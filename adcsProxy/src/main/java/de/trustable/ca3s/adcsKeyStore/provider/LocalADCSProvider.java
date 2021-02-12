package de.trustable.ca3s.adcsKeyStore.provider;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;

import javax.net.ssl.KeyManagerFactorySpi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.trustable.ca3s.cert.bundle.KeyStoreImpl;
import de.trustable.ca3s.cert.bundle.TimedRenewalCertMap;

public class LocalADCSProvider extends Provider {

	public static final String ALGO_NAME = "LocalADCS";
	private static final String STORE_TYPE_KEYSTORE = "Keystore";


	/**
	 * 
	 */
	private static final long serialVersionUID = -2476288508778039686L;

    private static final Logger LOG = LoggerFactory.getLogger(LocalADCSProvider.class);

    private static PropertyProvider propProvider = new DummyPropertyProviderImpl();
    
    private static KeyStoreImpl keystoreImpl;
    
	public LocalADCSProvider(final TimedRenewalCertMap certMap, SpringEnvironmentPropertyProviderImpl propProviderArg) {
		super("LocalADCSProvider", 1.0, "Keystore provider using local ADCS");

		propProvider = propProviderArg;

		String alias = propProvider.getProperty( LocalADCSBundleFactory.KEY_STORE_PROPERTIES_PREFIX + "key.alias", "localADCSAlias");
		keystoreImpl = new KeyStoreImpl(certMap, alias);
		keystoreImpl.engineGetCertificate(alias);

		// the more modern variant is to put a Service		
		putService( new ProviderService(this, STORE_TYPE_KEYSTORE, ALGO_NAME, KeyStoreImpl.class.getName()));

		LOG.debug("registered KeyStoreImpl in LocalADCSProvider");

		for( String prop: super.stringPropertyNames()){
			LOG.info("provider attribute {} : '{}'", prop, this.getProperty(prop));
		}
		
	}


	/**
	 * inner class to instantiate the provider
	 * 
	 * @author kuehn
	 *
	 */
	private static final class ProviderService extends Provider.Service{
		ProviderService( Provider p, String type, String algo, String cn){
			super(p, type, algo, cn, null, null); 
		}
		
		@Override
		public Object newInstance(Object ctrParamObj) throws NoSuchAlgorithmException{
			
			String type = getType();
			String algo = getAlgorithm();

			LOG.info(" type : {}, algo : '{}'", type, algo);

			try {
				if( STORE_TYPE_KEYSTORE.equalsIgnoreCase(type)) {
					if( ALGO_NAME.equalsIgnoreCase(algo)) {
//						return new LocalADCSKeyStoreImpl(propProvider);
						return keystoreImpl;
					}
				}
			}catch(Exception ex ) {
				throw new NoSuchAlgorithmException("Error constructing " + type + " for " + algo + "using LocalADCSProvider ");
			}
			throw new NoSuchAlgorithmException("No impl for " + type + " / " + algo );
		}
	}
	
}
