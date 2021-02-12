package de.trustable.ca3s.adcsKeyStore.provider;

import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Set;

import javax.net.ssl.X509ExtendedKeyManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.trustable.ca3s.cert.bundle.KeyCertBundle;
import de.trustable.ca3s.cert.bundle.TimedRenewalCertMap;

public class LocalADCSKeyManager extends X509ExtendedKeyManager {

    private final Logger log = LoggerFactory.getLogger(LocalADCSKeyManager.class);

    private TimedRenewalCertMap certMap;
    
    public LocalADCSKeyManager(TimedRenewalCertMap certMap) {
    	this.certMap = certMap;
    }
    
	@Override
	public String[] getClientAliases(String arg0, Principal[] arg1) {
		log.debug("in getClientAliases(String arg0, Principal[] arg1)");
		return new String[0];
	}

	@Override
	public String chooseClientAlias(String[] arg0, Principal[] arg1, Socket arg2) {
		log.debug("in chooseClientAlias(String[] arg0, Principal[] arg1, Socket arg2)");
		return null;
	}

	@Override
	public String[] getServerAliases(String arg0, Principal[] arg1) {
		
		Set<String> aliasSet = certMap.aliases();
		String[] aliasArr =  aliasSet.toArray(new String[aliasSet.size()]);
		log.debug("in getServerAliases(String[] arg0, Principal[] arg1), returning #{} aliases", aliasArr.length);
		return aliasArr;
	}

	@Override
	public String chooseServerAlias(String arg0, Principal[] arg1, Socket arg2) {
		Set<String> aliasSet = certMap.aliases();
		String alias = aliasSet.iterator().next();
		log.debug("in chooseServerAlias(String[] arg0, Principal[] arg1, Socket arg2), returning alias '{}'", alias);
		return alias;
	}

	@Override
	public X509Certificate[] getCertificateChain(String alias) {
		
		KeyCertBundle bundle = certMap.findBundleForAlias(alias);
		if( bundle != null) {
			log.debug("in getCertificateChain('{}'), returning #{} certificates", alias, bundle.getCertificateChain().length);
			return bundle.getCertificateChain();
		}else {
			return null;
		}
	}

	@Override
	public PrivateKey getPrivateKey(String alias) {
		KeyCertBundle bundle = certMap.findBundleForAlias(alias);
		if( bundle != null) {
			log.debug("in getPrivateKey('{}'), returning private key", alias);
			return (PrivateKey) bundle.getKey();
		}else {
			return null;
		}
	}

}
