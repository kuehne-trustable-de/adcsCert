package de.trustable.ca3s.adcs.proxy.service;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.MACVerifier;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.ParseException;
import java.util.Random;
import java.util.prefs.Preferences;
import javax.annotation.PostConstruct;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class JWSService {

    public static final String PREF_KEY = "de.trustable.ca3s.adcsproxy";
    public static final String PREF_KEY_SECRET = PREF_KEY + ".secret";

    private static final Logger log = LoggerFactory.getLogger(JWSService.class);


    private final String secretPassphrase;
    private final String salt;
    private final int iterations;
    private final String apiKeySalt;
    private final int apiKeyIterations;
    private final String pbeAlgo;

    public JWSService(@Value("${adcs-proxy.connection.secret:#{null}}") String secretPassphrase,
                      @Value("${adcs-proxy.connection.salt:ca3sSalt}") String salt,
                      @Value("${adcs-proxy.connection.iterations:4567}") int iterations,
                      @Value("${adcs-proxy.connection.api-key-salt:apiKeySalt}") String apiKeySalt,
                      @Value("${adcs-proxy.connection.api-key-iterations:3756}") int apiKeyIterations,
                      @Value("${adcs-proxy.connection.pbeAlgo:PBKDF2WithHmacSHA256}") String pbeAlgo) {
        this.secretPassphrase = secretPassphrase;
        this.salt = salt;
        this.iterations = iterations;
        this.apiKeySalt = apiKeySalt;
        this.apiKeyIterations = apiKeyIterations;
        this.pbeAlgo = pbeAlgo;
    }

    byte[] getSalt() {
        return salt.getBytes();
        // return "ca3sSalt".getBytes();
    }

    int getIterations() {
        return iterations;
//        return 4567;
    }

    byte[] getAPIKeySalt() {
        return apiKeySalt.getBytes();
//        return "apiKeySalt".getBytes();
    }

    int getAPIKeyIterations() {
        return apiKeyIterations;
//        return 3756;
    }

    /**
     *
     * @param jwsAsString
     * @return
     * @throws JOSEException
     * @throws ParseException
     * @throws GeneralSecurityException
     */
    public String getJWSPayload(String jwsAsString)
        throws JOSEException, ParseException, GeneralSecurityException {
        // To parse the JWS and verify it, e.g. on client-side
        JWSObject jwsObject = JWSObject.parse(jwsAsString);

        // enable for debugging purposes only!
//        log.debug("NOT FOR PRODUCTION: jwsObject " + jwsObject.serialize());

        byte[] sharedSecret = getSharedSecret();

        // enable for debugging purposes only!
//        log.debug("NOT FOR PRODUCTION: calculated secret as " + java.util.Base64.getEncoder().encodeToString(sharedSecret));

        JWSVerifier verifier = new MACVerifier(sharedSecret);
        if (jwsObject.verify(verifier)) {
            return jwsObject.getPayload().toString();
        } else {
            log.debug("jws '{}' failed verification", jwsAsString);
            throw new JOSEException("verification of JWS failed");
        }
    }

    byte[] getSharedSecret() throws GeneralSecurityException {
        String passphrase = getPassphrase();

        PBEKeySpec spec = new PBEKeySpec(
            passphrase.toCharArray(),
            getSalt(),
            getIterations(),
            256
        );
        SecretKeyFactory skf = SecretKeyFactory.getInstance(pbeAlgo);

        return skf.generateSecret(spec).getEncoded();
    }

    /**
     *
     * @return
     * @throws GeneralSecurityException
     */
    public String getAPIKey() throws GeneralSecurityException {
        String passphrase = getPassphrase();

        PBEKeySpec spec = new PBEKeySpec(
            passphrase.toCharArray(),
            getAPIKeySalt(),
            getAPIKeyIterations(),
            256
        );

        SecretKeyFactory skf = SecretKeyFactory.getInstance(pbeAlgo);

        String apiKey = java.util.Base64
            .getEncoder()
            .encodeToString(skf.generateSecret(spec).getEncoded());

        // enable for debugging purposes only!
//        log.debug("NOT FOR PRODUCTION: expected api key '{}' " + apiKey);

        return apiKey;
    }

    private String getPassphrase() {
        String passphrase = "";

        if (secretPassphrase == null || (secretPassphrase.trim().length() < 6)) {
            log.warn("connection secret missing / too short!");
            return passphrase;
        }

        int passLen = secretPassphrase.length();
        log.debug("NOT FOR PRODUCTION: connection secret provided from command line / property file : '{}'",
            "*****" + secretPassphrase.substring(passLen-3, passLen)
        );


        if (secretPassphrase != null) {
            // check content from command line / property file
            passphrase = secretPassphrase;
            log.debug( "connection secret provided from command line / property file. To take advantage of the registry key '{}', insert your secret in registry folder 'Computer\\\\HKEY_CURRENT_USER\\\\Software\\\\JavaSoft\\\\Prefs' !",
                PREF_KEY_SECRET
            );
        } else {
            Preferences userPref = Preferences.userRoot();

            // check own registry entry. The registry has the advantage, that the secret cannot be found in process parameter
            passphrase = userPref.get(PREF_KEY_SECRET, null);
            if (passphrase == null) {
                log.warn("connection secret not available in registry entry '{}' !",PREF_KEY_SECRET);
                passphrase = createRandomString();
                userPref.put(PREF_KEY_SECRET, passphrase);
                log.info("new registry key '{}' populated with random secret",
                    PREF_KEY_SECRET);
            } else {
                passLen = passphrase.length();
                log.debug("NOT FOR PRODUCTION: connection secret provided from registry : '{}'",
                    "*****" + passphrase.substring(passLen-3, passLen)
                );
            }
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
        return java.util.Base64
            .getEncoder()
            .encodeToString(genSecret)
            .toLowerCase()
            .replaceAll("=", "");
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
