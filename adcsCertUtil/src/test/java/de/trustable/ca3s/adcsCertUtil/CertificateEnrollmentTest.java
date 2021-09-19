package de.trustable.ca3s.adcsCertUtil;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.x500.X500Principal;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.trustable.util.CryptoUtil;


public class CertificateEnrollmentTest {

	  private static final Logger LOGGER = LoggerFactory.getLogger(CertificateEnrollmentTest.class);
	
	  int nCreateCerts = 1000;
	  
@Ignore
	@Test
	public void testBasicAdcsCommunication() throws ADCSException, GeneralSecurityException, IOException {
		
        java.security.Security.addProvider( new BouncyCastleProvider() );
        KeyPair keyPair = KeyPairGenerator.getInstance("RSA").generateKeyPair();

		X500Principal subject = new X500Principal("CN=req" + System.currentTimeMillis() + ", O=trustable Ltd, OU=Test, C=DE");
		String p10ReqPem = CryptoUtil.getCsrAsPEM(subject, keyPair.getPublic(), keyPair.getPrivate(),
				"password".toCharArray());
	 
		try {
			ADCSWinNativeConnector ce = new ADCSNativeImpl();
			
			for( int i = 0; i < nCreateCerts; i++) {
				try {
					
					Map<String, String> attrMap = new HashMap<String, String>();
					attrMap.put("foo", "bar");
					attrMap.put("CertificateTemplate", "CA3SWebServer");
					
					CertificateEnrollmentResponse certResponse = ce.submitRequest(p10ReqPem, attrMap);
					assertNotNull(certResponse);
					assertNotNull(certResponse.getStatus());
	
					LOGGER.debug("certResponse.getStatus() : " + certResponse.getStatus());
	
					assertEquals(SubmitStatus.ISSUED, certResponse.getStatus());
			
					assertTrue(certResponse.getReqId() > 0L);
					
					
					X509Certificate x509Cert = CryptoUtil.convertPemToCertificate(certResponse.getB64Cert());
	
					assertNotNull(certResponse.getB64Cert());
					assertTrue(certResponse.getB64Cert().length() > 100);
				
					// @Todo read the serial from the newly created certificate
					ce.revokeCertifcate(x509Cert.getSerialNumber().toString(16), 0, new Date());
					
				}catch(NoLocalADCSException nlADCSEx) {
					// no local ADCS available ...
					LOGGER.info("ADCS adapter not available. quitting ...");
					break;
				}
			}
		} catch(NoClassDefFoundError ncde) {
			assertEquals("Windows /JNA problem", "com/sun/jna/win32/StdCallLibrary", ncde.getMessage());
			
			LOGGER.info("ADCS adapter not tested. That's no problem on a non-Windows system.");

		} catch(Error e) {
			LOGGER.info("ADCS adapter not tested. That's no problem on a non-Windows system.", e);
		}
	}
	
}
