package de.trustable.ca3s.adcsKeyStore.provider;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.trustable.ca3s.cert.bundle.TimedRenewalCertMap;
import de.trustable.ca3s.cert.bundle.TimedRenewalKeyManagerFactorySpi;

public class LocalADCSKeyManagerProvider extends Provider {

	public static final String ALGO_NAME = "localADCSAlgo";
	private static final String PROVIDER_TYPE_KEYMANAGER = "KeyManagerFactory";

	/**
	 * 
	 */
	private static final long serialVersionUID = -2476288508778039686L;

    private static final Logger LOG = LoggerFactory.getLogger(LocalADCSKeyManagerProvider.class);

    
	private static TimedRenewalCertMap certMap;

	public LocalADCSKeyManagerProvider(final TimedRenewalCertMap certMap) {
		super("LocalADCSKeyManagerProvider", 1.0, "Key management provider implemented by ADCSProxy");
		
		LocalADCSKeyManagerProvider.certMap = certMap;
		
//		super.put("Keystore.ca3s", KeyStoreImpl.class.getName());
//		super.put("Keystore.ca3s storetype", SERVICE_NAME);

		putService( new ProviderService(this, PROVIDER_TYPE_KEYMANAGER, ALGO_NAME, TimedRenewalKeyManagerFactorySpi.class.getName()));
		
		LOG.debug("registered TimedRenewalKeyManagerFactorySpi in LocalADCSKeyManagerProvider");
		
		for( String prop: super.stringPropertyNames()){
			LOG.debug("provider attribute {} : '{}'", prop, this.getProperty(prop));
		}

	}

	private static final class ProviderService extends Provider.Service{
		ProviderService( Provider p, String type, String algo, String cn){
			super(p, type, algo, cn, null, null); 
		}
		
		@Override
		public Object newInstance(Object ctrParamObj) throws NoSuchAlgorithmException{
			
			String type = getType();
			String algo = getAlgorithm();
			
			try {
				if( PROVIDER_TYPE_KEYMANAGER.equalsIgnoreCase(type)) {
					if( ALGO_NAME.equalsIgnoreCase(algo)) {
						LOG.debug("creating TimedRenewalKeyManagerFactorySpi with a LocalADCSKeyManagerProvider instance for type '{}' / algo '{}'", type, algo);
						TimedRenewalKeyManagerFactorySpi keyManfac = new TimedRenewalKeyManagerFactorySpi(ALGO_NAME, certMap);
						return keyManfac;
					}
				}
			}catch(Exception ex ) {
				LOG.error("exception while provider instantiation", ex );
				throw new NoSuchAlgorithmException("Error constructing provider type '" + type + "' for algo '" + algo + "' using TimedRenewalKeyManagerFactorySpi ");

			}
			throw new NoSuchAlgorithmException("No impl for " + type + " / " + algo );
		}
	}
}
