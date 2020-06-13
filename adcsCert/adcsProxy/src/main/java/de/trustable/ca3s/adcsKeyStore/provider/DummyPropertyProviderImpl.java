package de.trustable.ca3s.adcsKeyStore.provider;

/**
 * Dummy Property Provider, return s the default value, always
 * @author kuehn
 *
 */
public class DummyPropertyProviderImpl implements PropertyProvider {

	@Override
	public String getProperty(String propertyName, String defaultValue) {
		return defaultValue;
	}
}
