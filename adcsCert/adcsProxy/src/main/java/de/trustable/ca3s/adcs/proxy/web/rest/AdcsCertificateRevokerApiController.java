package de.trustable.ca3s.adcs.proxy.web.rest;


import java.io.IOException;
import java.security.GeneralSecurityException;
import java.text.ParseException;
import java.util.Date;

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
import de.trustable.ca3s.adcs.proxy.web.dto.CertificateRevocationRequest;
import de.trustable.ca3s.adcsCertUtil.ADCSException;
import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-20T18:45:40.714Z[GMT]")
@Controller
public class AdcsCertificateRevokerApiController implements AdcsCertificateRevokerApi {

    private static final Logger log = LoggerFactory.getLogger(AdcsCertificateRevokerApiController.class);

    private final ObjectMapper objectMapper;


    @Autowired
    private LocalADCSService localADCSService;
    
    @Autowired
    private JWSService jwsService;
    
    
    @org.springframework.beans.factory.annotation.Autowired
    public AdcsCertificateRevokerApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Void> revokeCertificate(@ApiParam(value = "serial, reason and revocation date wrapped in a JWS"  )  @Valid @RequestBody JWSWrappedRequest body) {
  //      String accept = request.getHeader("Accept");
  //      if (accept != null && accept.contains("application/json")) {
            try {
            	
                log.debug("incoming JWS " + body);

                String payload = jwsService.getJWSPayload(body.getJws());

                CertificateRevocationRequest revRequest = objectMapper.readValue(payload, CertificateRevocationRequest.class); 

                Date revDate = new Date(revRequest.getRevTime());
    			localADCSService.getADCSConnector().revokeCertifcate(revRequest.getSerial(), revRequest.getReason(), revDate );

                return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
            } catch (IOException | GeneralSecurityException | ADCSException e) {
                log.error("Couldn't process request", e);
                return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
            } catch (JOSEException | ParseException e) {
                log.error("Couldn't process JOSE element", e);
                return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
			}
  //      }else {
  //          return new ResponseEntity<Void>(HttpStatus.UNSUPPORTED_MEDIA_TYPE);
  //      }
    }

}
