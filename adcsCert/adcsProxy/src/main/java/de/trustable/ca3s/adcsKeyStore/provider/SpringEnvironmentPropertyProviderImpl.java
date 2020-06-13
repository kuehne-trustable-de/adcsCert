package de.trustable.ca3s.adcsKeyStore.provider;

import org.springframework.core.env.Environment;

public class SpringEnvironmentPropertyProviderImpl implements PropertyProvider {

    private Environment env;

	public SpringEnvironmentPropertyProviderImpl(Environment env) {
		this.env = env;
	}
	
	@Override
	public String getProperty(String propertyName, String defaultValue) {
		return env.getProperty(propertyName, defaultValue);
	}

}
