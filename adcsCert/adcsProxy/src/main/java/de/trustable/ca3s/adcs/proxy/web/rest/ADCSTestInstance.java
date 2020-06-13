package de.trustable.ca3s.adcs.proxy.web.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import de.trustable.ca3s.adcsCertUtil.ADCSException;
import de.trustable.ca3s.adcsCertUtil.ADCSInstanceDetails;
import de.trustable.ca3s.adcsCertUtil.ADCSNativeImpl;
import de.trustable.ca3s.adcsCertUtil.ADCSWinNativeConnector;
import de.trustable.ca3s.adcsCertUtil.CertificateEnrollmentResponse;
import de.trustable.ca3s.adcsCertUtil.GetCertificateResponse;
import de.trustable.ca3s.adcsCertUtil.SubmitStatus;

public class ADCSTestInstance implements ADCSWinNativeConnector {

	int reqId = new Random().nextInt();
	
	@Override
	public CertificateEnrollmentResponse submitRequest(String b64Csr, Map<String, String> attributeMap)
			throws ADCSException {
		
		if( attributeMap.containsKey("template") && ( "reject".equals( attributeMap.get("template")))){
			return new CertificateEnrollmentResponse(SubmitStatus.ERROR, reqId++);
		}
		
		return new CertificateEnrollmentResponse(SubmitStatus.INCOMPLETE, reqId++);
	}

	@Override
	public void revokeCertifcate(String serial, int reason, Date revocationDate) throws ADCSException {
		
		if( "-1".equals(serial)) {
			throw new ADCSException("unknown serial number");
		}

	}

	@Override
	public List<String> getRequesIdList(int offset, long resolvedWhenTimestamp, long revokedWhenTimestamp, int limit) throws ADCSException {
		
		List<String> reqList= new ArrayList<String>();
		
		for( int i = offset; i < (offset + limit); i++) {
			if( (i % 10 ) != 0) {
				reqList.add("" + i);
			}
		}
		return null;
	}

	@Override
	public GetCertificateResponse getCertificateByRequestId(String reqId) throws ADCSException {

		if( "524".equals(reqId)) {
			return new GetCertificateResponse(reqId, "-----BEGIN CERTIFICATE-----\r\n" + 
					"MIIEPzCCAyegAwIBAgITFQAAAgxUO3IXoq/F5wAAAAACDDANBgkqhkiG9w0BAQsF\r\n" + 
					"ADAcMRowGAYDVQQDExFXUy0yMDE5LUlzc3VpbmdDQTAeFw0xOTA5MDQxNzA2MjNa\r\n" + 
					"Fw0yMDA0MTgxMjA4NDJaME8xCzAJBgNVBAYTAkRFMRYwFAYDVQQKEw10cnVzdGFi\r\n" + 
					"bGUgTHRkMQ0wCwYDVQQLEwRUZXN0MRkwFwYDVQQDExByZXExNTY3NjE3MzIxNzA3\r\n" + 
					"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAi+zj+l3anNMQMucHSjnE\r\n" + 
					"JIY4ItkAZt/oQQ547wgpwCmgIVL+olwzMYKnUJDGZ1cHVuGeM1S4m/bx160TeNbc\r\n" + 
					"SVbZfiqxLH9KXwRysiSPeMvnDz399RIr7FCY3fh4T7xyrC+9jm2Hj5GGkTeGr+SF\r\n" + 
					"6jommo0XEfofZM/GFzTVsstJUMjoU76UnVqjThNi6MBAOCw5TqokbPdDuwY3Z4Ap\r\n" + 
					"iMrJJIwn9bdlbevomhWvybK5SXH4FecYVrS8McKARSvACOocXgD5kcJrhJ5oMw5Y\r\n" + 
					"/nGnWp8EHRHpPleojDyG8f0xwb9RROHrUlIlh1ncCEzz4ekBIk0kRIga4Z0HrbJx\r\n" + 
					"UwIDAQABo4IBRTCCAUEwEwYDVR0lBAwwCgYIKwYBBQUHAw4wHQYDVR0OBBYEFOpl\r\n" + 
					"UN3YqpDPvI5T7xD2ijzOzRjjMB8GA1UdIwQYMBaAFPZBinSxew5Q6MlHG3Mz0oT+\r\n" + 
					"sHsYMEoGA1UdHwRDMEEwP6A9oDuGOWZpbGU6Ly8vL1dJTi1KNEVGQ1NBUkVOOS9D\r\n" + 
					"ZXJ0RW5yb2xsL1dTLTIwMTktSXNzdWluZ0NBLmNybDBlBggrBgEFBQcBAQRZMFcw\r\n" + 
					"VQYIKwYBBQUHMAKGSWZpbGU6Ly8vL1dJTi1KNEVGQ1NBUkVOOS9DZXJ0RW5yb2xs\r\n" + 
					"L1dJTi1KNEVGQ1NBUkVOOV9XUy0yMDE5LUlzc3VpbmdDQS5jcnQwKQYJKwYBBAGC\r\n" + 
					"NxQCBBweGgBDAEEAMwBTAFcAZQBiAFMAZQByAHYAZQByMAwGA1UdEwEB/wQCMAAw\r\n" + 
					"DQYJKoZIhvcNAQELBQADggEBACJpwW1pPnRrJIay0eE7igh1X154jVEm2RA9+YMA\r\n" + 
					"LCaRetgLC+3O4G0aqvQT7zLxeSyZMfpopuStETJJWEFBTwzJnlRGBJ0a160sVRp4\r\n" + 
					"7XECcqQDU/Q5uhcpaF6/PvUPm0XUxw+Q36gdS6RBddiHG8bMxb+AejYym19M3/CL\r\n" + 
					"UQBw9pboHyVgYF4zwDl/soVdvq78nOw01Sq0OETS480g79wx8IVdU+665Yeo7mgW\r\n" + 
					"IhJYLuutJQJIMMKYlP3fE12MPrt/FQIvqsGeYprnyiYcmUCbs7MleezIrVJx5oB/\r\n" + 
					"gNeJMuJItYpMVyJJn0uvcQzlWDwBzacsEOGQabdpLenQHE4=\r\n" + 
					"-----END CERTIFICATE-----\r\n", 
					"CA3SWebServer",
					"01.01.1970",
					"01.01.2020");
		}
		
		return null;
	}

	@Override
	public String getInfo() throws ADCSException {
		
		return "TestInstance";
	}

	@Override
	public String[] getCATemplates() throws ADCSException {
		
		String[] ret = new String[2];
		ret[0] = "ClientCertificateTemplate";
		ret[1] = "ServerCertificateTemplate";
		
		return ret;
	}

	@Override
	public ADCSInstanceDetails getCAInstanceDetails() throws ADCSException {
		
		ADCSInstanceDetails details = new ADCSInstanceDetails();
		
		details.setCaName("Test CA");
		details.setCaType(ADCSNativeImpl.CA_DETAILS_TYPE_INTERMEDIATE);
		
		return details;
	}

}
