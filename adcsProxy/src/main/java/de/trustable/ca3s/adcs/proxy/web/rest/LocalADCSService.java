package de.trustable.ca3s.adcs.proxy.web.rest;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import de.trustable.ca3s.adcs.proxy.web.dto.CertificateEnrollmentResponse;
import de.trustable.ca3s.adcs.proxy.web.dto.CertificateRequestElements;
import de.trustable.ca3s.adcs.proxy.web.dto.CertificateRequestElementsAttributes;
import de.trustable.ca3s.adcsCertUtil.ADCSException;
import de.trustable.ca3s.adcsCertUtil.ADCSNativeImpl;
import de.trustable.ca3s.adcsCertUtil.ADCSWinNativeConnector;
import de.trustable.ca3s.adcsCertUtil.NoLocalADCSException;

@Service
public class LocalADCSService {

	private static final Logger LOGGER = LoggerFactory.getLogger(LocalADCSService.class);

	private ADCSWinNativeConnector adcsConnector;

	/**
	  * build a local service
	  */
	public LocalADCSService() {

		boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
		
		if (!isWindows) {
			LOGGER.info("ADCSConnector available on Windows, only");
		} else {

			LOGGER.debug("ADCSConnector cTor trying to load Windows native interface classes...");
			
			do {
				try {
					adcsConnector = new ADCSNativeImpl();
					LOGGER.info("ADCSConnector cTor instantiated using Windows native interface");
					break;
				}catch( NoLocalADCSException nlae) {
					LOGGER.info("### waiting for the ADCS to start ...");
					try {
					    Thread.sleep( 2 * 1000); // wait for two seconds
					} catch (InterruptedException ie) {
					    Thread.currentThread().interrupt();
					}
				} catch (UnsatisfiedLinkError ule) {
					LOGGER.info("unable to load Windows connection classes, ADCS connection unavailable.", ule);
					break;
				} catch (ADCSException e) {
					LOGGER.info("unable to load Windows connection classes, ADCS connection unavailable.", e);
					break;
				}
			} while (true);
		}	
	}

	/**
	  * build a local service with a given connector
	 * 
	 * @param adcsConnector
	 */
	public LocalADCSService(ADCSWinNativeConnector adcsConnector) {
		this.adcsConnector = adcsConnector;
	}

	/**
	 * @return the adcsConnector
	 */
	public ADCSWinNativeConnector getADCSConnector() {
		return adcsConnector;
	}
	
	
	public CertificateEnrollmentResponse requestCertificate(CertificateRequestElements cre) throws ADCSException {
		
    	List<CertificateRequestElementsAttributes> reqAttributeList = cre.getAttributes();
    	HashMap<String, String> attrMap = new HashMap<String, String>();
    	for(CertificateRequestElementsAttributes creAttr: reqAttributeList) {
    		attrMap.put(creAttr.getName(), creAttr.getValue());
    	}

    	de.trustable.ca3s.adcsCertUtil.CertificateEnrollmentResponse adcsResp = getADCSConnector().submitRequest(cre.getCsr(), attrMap);
    	CertificateEnrollmentResponse ceResp = new CertificateEnrollmentResponse();
    	
    	Integer reqIdInt = (int)adcsResp.getReqId();
    	ceResp.reqId(reqIdInt);
    	ceResp.status( adcsResp.getStatus().toString());
    	ceResp.cert(adcsResp.getB64Cert());
    	ceResp.certCA(adcsResp.getB64CACert());

    	return ceResp;
	}

}
