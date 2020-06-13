package de.trustable.ca3s.adcs.proxy.web.rest;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.trustable.ca3s.adcs.proxy.web.dto.CertificateArrayResponse;
import de.trustable.ca3s.adcs.proxy.web.dto.RequestIdsResponse;
import de.trustable.ca3s.adcsCertUtil.ADCSException;
import de.trustable.ca3s.adcsCertUtil.OODBConnectionsADCSException;
import io.swagger.annotations.ApiParam;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-30T11:55:34.168Z[GMT]")
@Controller
public class AdcsRequestsApiController implements AdcsRequestsApi {

    private static final Logger log = LoggerFactory.getLogger(AdcsRequestsApiController.class);

    @Autowired
    private LocalADCSService localADCSService;
    
    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AdcsRequestsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.request = request;
    }

    public ResponseEntity<RequestIdsResponse> getRequestIdList(@ApiParam(value = "The number of items to skip before starting to collect the result set. Either provide this parameter or resolvedWhenTimestamp or revokedWhenTimestamp.") @Valid @RequestParam(value = "offset",  required = false) Integer offset, 
    		@ApiParam(value = "The resolvedWhen value must be after this timestamp value. Either provide this parameter or offset or revokedWhenTimestamp.") @Valid @RequestParam(value = "resolvedWhenTimestamp", required = false) Long resolvedWhenTimestamp, 
    		@ApiParam(value = "The revokedWhen value must be after this timestamp value. Either provide this parameter or resolvedWhenTimestamp or offset.") @Valid @RequestParam(value = "revokedWhenTimestamp", required = false) Long revokedWhenTimestamp, 
    		@ApiParam(value = "The numbers of items to return") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        
        int intOffset = 0;
        if( offset != null) {
        	intOffset = offset;
        }
        
        int intLimit = 1000;
        if( limit != null) {
        	intLimit = limit;
        }

        long longResolvedWhenTimestamp = 0L;
        if( resolvedWhenTimestamp != null) {
        	longResolvedWhenTimestamp = resolvedWhenTimestamp;
        }

        long longRevokedWhenTimestamp = 0L;
        if( revokedWhenTimestamp != null) {
        	longRevokedWhenTimestamp = revokedWhenTimestamp;
        }

        if(intOffset < 0) {
            log.error("Unexpected offset '" + offset + "', expected to by >= 0 ");
            return new ResponseEntity<RequestIdsResponse>(HttpStatus.BAD_REQUEST);
        }
        
        if( (intLimit < 0 ) || (intLimit > 65535)) {
            log.error("Unexpected limit '" + limit + "', expected to by >= 0 and < 65535");
            return new ResponseEntity<RequestIdsResponse>(HttpStatus.BAD_REQUEST);
        }
        
        if (accept != null && accept.contains("application/json")) {
            try {
            	List<String> adcsCertResp = localADCSService.getADCSConnector().getRequesIdList(intOffset, longResolvedWhenTimestamp, longRevokedWhenTimestamp, intLimit);

            	RequestIdsResponse reqIdList = new RequestIdsResponse();
            	for( String id: adcsCertResp) {
            		reqIdList.add(id);
            	}
                return new ResponseEntity<RequestIdsResponse>(reqIdList, HttpStatus.OK);
                
            } catch (OODBConnectionsADCSException e) {
                log.error("Out of DBCOnnections, try again later ...", e);
                return new ResponseEntity<RequestIdsResponse>(HttpStatus.SERVICE_UNAVAILABLE);
            } catch (ADCSException e) {
                log.error("Problem retrieving certificate list from '" + offset + "' with '" + limit + "' elements", e);
                return new ResponseEntity<RequestIdsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
        }

        return new ResponseEntity<RequestIdsResponse>(HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    public ResponseEntity<CertificateArrayResponse> getRequestsById(@ApiParam(value = "The number of items to skip before starting to collect the result set") @Valid @RequestParam(value = "id", required = false) List<String> id) {

        return new ResponseEntity<CertificateArrayResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
