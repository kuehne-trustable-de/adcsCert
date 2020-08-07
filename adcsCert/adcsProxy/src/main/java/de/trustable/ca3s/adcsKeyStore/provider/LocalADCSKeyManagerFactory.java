package de.trustable.ca3s.adcsKeyStore.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactorySpi;
import javax.net.ssl.ManagerFactoryParameters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LocalADCSKeyManagerFactory extends KeyManagerFactorySpi {

    private final Logger log = LoggerFactory.getLogger(LocalADCSKeyManagerFactory.class);

	private KeyManager keyManager;
	
	public LocalADCSKeyManagerFactory(KeyManager keyManager) {
		super();
		this.keyManager = keyManager;
	}
	
	@Override
	protected KeyManager[] engineGetKeyManagers() {
		log.debug("returning single key manager of type {}", keyManager.getClass().getName());
		return new KeyManager[]{keyManager};	}

	@Override
	protected void engineInit(ManagerFactoryParameters arg0) throws InvalidAlgorithmParameterException {
		log.debug("engineInit with {}", arg0);

	}

	@Override
	protected void engineInit(KeyStore arg0, char[] arg1) {
		log.debug("engineInit with keystore and password");
	}

}
