package de.trustable.ca3s.adcs.proxy.web.rest;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.trustable.ca3s.adcs.proxy.web.dto.GetCertificateResponse;
import de.trustable.ca3s.adcs.proxy.web.dto.GetCertificateResponseValues;
import de.trustable.ca3s.adcsCertUtil.ADCSException;
import de.trustable.ca3s.adcsCertUtil.ADCSWinNativeConnector;
import de.trustable.ca3s.adcsCertUtil.OODBConnectionsADCSException;
import io.swagger.annotations.ApiParam;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-30T11:55:34.168Z[GMT]")
@Controller
public class AdcsRequestApiController implements AdcsRequestApi {

    private static final Logger log = LoggerFactory.getLogger(AdcsRequestApiController.class);

    @Autowired
    private LocalADCSService localADCSService;
    

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AdcsRequestApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.request = request;
    }

    public ResponseEntity<GetCertificateResponse> getRequestById(@ApiParam(value = "certificate request id",required=true) @PathVariable("reqId") String reqId) {
        String accept = request.getHeader("Accept");
        log.debug("getRequestById for id '" + reqId + "'");
        
        if (accept != null && accept.contains("application/json")) {
            try {
            	
            	ADCSWinNativeConnector adcsConn = localADCSService.getADCSConnector();
            	de.trustable.ca3s.adcsCertUtil.GetCertificateResponse adcsCertResp = adcsConn.getCertificateByRequestId(reqId);

            	if( adcsCertResp != null) {
	            	GetCertificateResponse getCertResp = new GetCertificateResponse();
	            	
	            	addCertResponseElement("ReqId", adcsCertResp.getReqId(), getCertResp);
	            	addCertResponseElement("Template", adcsCertResp.getTemplate(), getCertResp);
	            	addCertResponseElement("ResolvedDate", adcsCertResp.getResolvedDate(), getCertResp);
	            	addCertResponseElement("Cert", adcsCertResp.getB64Cert(), getCertResp);
	            	
	                return new ResponseEntity<GetCertificateResponse>(getCertResp, HttpStatus.OK);
            	} else {
                    log.debug("getRequestById for id '" + reqId + "': nothing found");
	                return new ResponseEntity<GetCertificateResponse>(HttpStatus.NOT_FOUND);
            	}
            } catch (OODBConnectionsADCSException e) {
                log.error("Out of DBCOnnections, try again later ...", e);
                return new ResponseEntity<GetCertificateResponse>(HttpStatus.SERVICE_UNAVAILABLE);
            } catch (ADCSException e) {
                log.error("Problem retrieving certificate with request id '" + reqId + "'", e);
                return new ResponseEntity<GetCertificateResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
        }

        return new ResponseEntity<GetCertificateResponse>(HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

	/**
	 * @param adcsCertResp
	 * @param getCertResp
	 */
	private void addCertResponseElement(final String elementName,
			final String value,
			final GetCertificateResponse getCertResp) {
		GetCertificateResponseValues valuesItemReqId = new GetCertificateResponseValues();
		valuesItemReqId.setName(elementName);
		valuesItemReqId.setValue(value);
		getCertResp.addValuesItem(valuesItemReqId );
	}

}
