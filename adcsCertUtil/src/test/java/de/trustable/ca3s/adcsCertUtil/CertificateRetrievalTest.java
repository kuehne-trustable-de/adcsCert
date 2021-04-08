package de.trustable.ca3s.adcsCertUtil;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CertificateRetrievalTest {

	  private static final Logger LOGGER = LoggerFactory.getLogger(CertificateRetrievalTest.class);
	
	  int nCreateCerts = 1000;

	@Ignore
	@Test
	public void testListOfRequests() throws ADCSException, GeneralSecurityException, IOException {
		
	
		for( int i =0; i < 100; i++) {
			try {
				ADCSWinNativeConnector ce = new ADCSNativeImpl();
				List<String> reqList = ce.getRequesIdList(100, 510,  0L, 0L);
				
				for( String reqId: reqList) {
					LOGGER.info("reqId: " + reqId);
					
					GetCertificateResponse certResp = ce.getCertificateByRequestId(reqId);
					LOGGER.info("certResp: " + certResp.getReqId() + " of templ " + certResp.getTemplate() + ": \n" + certResp.getB64Cert());
	//				LOGGER.info("certResp: " + certResp.getReqId() + " of templ " + certResp.getTemplate() );
				}
				
			}catch(NoLocalADCSException nlADCSEx) {
				LOGGER.info("ADCS adapter not tested. That's no problem on a non-Windows system.");
			} catch(NoClassDefFoundError ncde) {
				assertEquals("Windows /JNA problem", "com/sun/jna/win32/StdCallLibrary", ncde.getMessage());
				
				LOGGER.info("ADCS adapter not tested. That's no problem on a non-Windows system.");
	
			} catch(Error e) {
				LOGGER.info("ADCS adapter not tested. That's no problem on a non-Windows system.", e);
			}
		}
	}
}
