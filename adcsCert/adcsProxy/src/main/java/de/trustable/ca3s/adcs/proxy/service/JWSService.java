package de.trustable.ca3s.adcs.proxy.service;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.ParseException;
import java.util.Random;
import java.util.prefs.Preferences;

import javax.annotation.PostConstruct;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.MACVerifier;

@Service
public class JWSService {

    public static final String PREF_KEY = "de.trustable.ca3s.adcsproxy";
    public static final String PREF_KEY_SECRET = PREF_KEY + ".secret";
    
    
    private static final Logger log = LoggerFactory.getLogger(JWSService.class);

	@Value("${connection.secret:@null}")
	private String secretPassphrase;
	

	byte[] getSalt() {
		return "ca3sSalt".getBytes();
	}
	
	int getIterations() {
		return 4567;
	}
    
	byte[] getAPIKeySalt() {
		return "apiKeySalt".getBytes();
	}
	
	int getAPIKeyIterations() {
		return 3756;
	}
    
	/**
	 * 
	 * @param jwsAsString
	 * @return
	 * @throws JOSEException
	 * @throws ParseException
	 * @throws GeneralSecurityException
	 */
    public String getJWSPayload(String jwsAsString) throws JOSEException, ParseException, GeneralSecurityException{
    	
		// To parse the JWS and verify it, e.g. on client-side
		JWSObject jwsObject = JWSObject.parse(jwsAsString);
	    log.debug("jwsObject " + jwsObject.serialize());
	
	    byte[] sharedSecret = getSharedSecret() ;
	    
//	    log.debug("calculated secret as " + Base64.encodeBase64String(sharedSecret));
	    
		JWSVerifier verifier = new MACVerifier(sharedSecret);
    	if( jwsObject.verify(verifier)) {

    		return jwsObject.getPayload().toString(); 
    	} else {
    	    log.debug("jws '{}' failed verification", jwsAsString);
    		throw new JOSEException("verification of JWS failed");
    	}
    }

    byte[] getSharedSecret() throws GeneralSecurityException  {

        String passphrase = getPassphrase();
        
	    PBEKeySpec spec = new PBEKeySpec(passphrase.toCharArray(), getSalt(), getIterations(), 256);
	    SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
	    return skf.generateSecret(spec).getEncoded();
    }

    /**
     * 
     * @return
     * @throws GeneralSecurityException
     */
    public String getAPIKey() throws GeneralSecurityException  {

        String passphrase = getPassphrase();
        
	    PBEKeySpec spec = new PBEKeySpec(passphrase.toCharArray(), getAPIKeySalt(), getAPIKeyIterations(), 256);
	    SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
	    
	    return Base64.encodeBase64String(skf.generateSecret(spec).getEncoded());
    }

	private String getPassphrase() {
		Preferences userPref = Preferences.userRoot();
        
        // check own registry entry first. The registry has the advantage, that the secret cannot be found in process parameter
        String passphrase = userPref.get(PREF_KEY_SECRET, null);
        if( passphrase == null) {
        	
        	// no registry entry found, use the property from command line / property file
        	if( secretPassphrase != null && (secretPassphrase.trim().length() >= 6)) {
        		passphrase = secretPassphrase;
        	} else {

            	// no property from command line / property file available or too short
        		if(secretPassphrase == null) {
    	    	    log.warn("connection secret not available!", PREF_KEY_SECRET);
        		} else if(secretPassphrase.trim().length() >= 6) {
    	    	    log.warn("connection secret too short ( < 6 characters) !", PREF_KEY_SECRET);
        		}

        		passphrase = createRandomString();
	        	userPref.put(PREF_KEY_SECRET, passphrase);
	    	    log.info("new registry key '{}' populated with random secret", PREF_KEY_SECRET);
        	}
        } else {
    	    log.info("connection secret provided by registry key '{}', taking precedence over connection secret from command line / property file !", PREF_KEY_SECRET);
    	    log.info("See registry at 'Computer\\HKEY_CURRENT_USER\\Software\\JavaSoft\\Prefs'");
        }
		return passphrase;
	}

	/**
	 * @return
	 */
	public String createRandomString() {

		// generate a new random value and preserve it in the registry
		// copy it from there and populate it to ca3s
		Random rnd = new SecureRandom();
		byte[] genSecret = new byte[16];
		rnd.nextBytes(genSecret);
		return Base64.encodeBase64String(genSecret).toLowerCase().replaceAll("=", "");
	}
    
    @PostConstruct
    public void init() {
    	try {
			getSharedSecret();
		} catch (GeneralSecurityException e) {
			log.warn("problem starting the JWSService", e);
		}
    }
}
