package de.trustable.ca3s.adcs.proxy.web.rest;


import java.io.IOException;
import java.security.GeneralSecurityException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nimbusds.jose.JOSEException;

import de.trustable.ca3s.adcs.proxy.service.JWSService;
import de.trustable.ca3s.adcs.proxy.web.dto.CertificateEnrollmentResponse;
import de.trustable.ca3s.adcs.proxy.web.dto.CertificateRequestElements;
import de.trustable.ca3s.adcsCertUtil.ADCSException;
import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-18T13:22:19.642Z[GMT]")
@Controller
public class AdcsCertificateBuilderApiController implements AdcsCertificateBuilderApi {

    private static final Logger log = LoggerFactory.getLogger(AdcsCertificateBuilderApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private LocalADCSService localADCSService;
    
    @Autowired
    private JWSService jwsService;
    
    @org.springframework.beans.factory.annotation.Autowired
    public AdcsCertificateBuilderApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CertificateEnrollmentResponse> buildCertificate(@ApiParam(value = "CSR and additional attributes (e.g. template) wrapped in a JWS"  )  @Valid @RequestBody JWSWrappedRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	
                log.debug("incoming JWS " + body);

                String payload = jwsService.getJWSPayload(body.getJws());

        		CertificateRequestElements certRequest = objectMapper.readValue(payload, CertificateRequestElements.class); 
            	CertificateEnrollmentResponse ceResp = localADCSService.requestCertificate(certRequest);
            	
                return new ResponseEntity<CertificateEnrollmentResponse>(ceResp, HttpStatus.OK);
            } catch (IOException | GeneralSecurityException | ADCSException e) {
                log.error("Couldn't process request", e);
                return new ResponseEntity<CertificateEnrollmentResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            } catch (JOSEException | ParseException e) {
                log.error("Couldn't process JOSE element", e);
                return new ResponseEntity<CertificateEnrollmentResponse>(HttpStatus.BAD_REQUEST);
			}
        }else {
            return new ResponseEntity<CertificateEnrollmentResponse>(HttpStatus.UNSUPPORTED_MEDIA_TYPE);
        }

    }

}
