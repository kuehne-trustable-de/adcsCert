package de.trustable.ca3s.adcs.proxy.web.rest;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jna.platform.win32.COM.COMException;

import de.trustable.ca3s.adcs.proxy.web.dto.ADCSInstanceDetailsResponse;
import de.trustable.ca3s.adcsCertUtil.ADCSException;
import de.trustable.ca3s.adcsCertUtil.ADCSInstanceDetails;
import de.trustable.ca3s.adcsCertUtil.NoLocalADCSException;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-16T20:41:45.662Z[GMT]")
@Controller
public class AdcsInfoApiController implements AdcsInfoApi {

    private static final Logger log = LoggerFactory.getLogger(AdcsInfoApiController.class);

    @Autowired
    private LocalADCSService localADCSService;
    
    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AdcsInfoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.request = request;
    }

    public ResponseEntity<String> getADCSInfo() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	String info = localADCSService.getADCSConnector().getInfo();
                return new ResponseEntity<String>(info, HttpStatus.OK);
            } catch( NoLocalADCSException nlae ){
                log.error("Local ADCS not available, check status of ADCS instance!");
                return new ResponseEntity<String>(HttpStatus.SERVICE_UNAVAILABLE);
            } catch (ADCSException e) {
                log.error("Problem retrieving ADCS info", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }catch( Exception ex) {
                log.error("Problem retrieving ADCS info", ex);
                return new ResponseEntity<String>("", HttpStatus.OK);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    
    public ResponseEntity<String[]> getCATemplates(){
    	
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                String[] templateArr = localADCSService.getADCSConnector().getCATemplates();
                return new ResponseEntity<String[]>(templateArr, HttpStatus.OK);
            } catch( NoLocalADCSException nlae ){
                log.error("Local ADCS not available, check status of ADCS instance!");
                return new ResponseEntity<String[]>(HttpStatus.SERVICE_UNAVAILABLE);
            } catch (ADCSException e) {
                log.error("Problem retrieving ADCS info", e);
                return new ResponseEntity<String[]>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String[]>(HttpStatus.NOT_IMPLEMENTED);
    }


    public ResponseEntity<ADCSInstanceDetailsResponse> getCAInstanceDetails(){

        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	ADCSInstanceDetails details = localADCSService.getADCSConnector().getCAInstanceDetails();
            	
                return new ResponseEntity<ADCSInstanceDetailsResponse>(new ADCSInstanceDetailsResponse(details), HttpStatus.OK);
            } catch( NoLocalADCSException nlae ){
                log.error("Local ADCS not available, check status of ADCS instance!");
                return new ResponseEntity<ADCSInstanceDetailsResponse>(HttpStatus.SERVICE_UNAVAILABLE);
            } catch (ADCSException e) {
                log.error("Problem retrieving ADCS info", e);
                return new ResponseEntity<ADCSInstanceDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ADCSInstanceDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);

    }

    

}
