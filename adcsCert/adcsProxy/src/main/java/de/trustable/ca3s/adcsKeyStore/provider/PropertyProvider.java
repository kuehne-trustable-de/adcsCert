package de.trustable.ca3s.adcsKeyStore.provider;

public interface PropertyProvider {

	String getProperty(String propertyName, String defaultValue);
}
