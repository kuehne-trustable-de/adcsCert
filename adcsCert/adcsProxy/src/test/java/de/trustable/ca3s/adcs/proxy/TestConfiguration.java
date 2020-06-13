package de.trustable.ca3s.adcs.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import de.trustable.ca3s.adcs.proxy.web.rest.ADCSTestInstance;
import de.trustable.ca3s.adcs.proxy.web.rest.LocalADCSService;
import de.trustable.ca3s.adcsKeyStore.provider.TimedRenewalCertMap;

@Profile("test")
@Configuration
public class TestConfiguration {
    private static final Logger LOG = LoggerFactory.getLogger(TimedRenewalCertMap.class);
    
	@Bean
	@Primary
	public LocalADCSService localADCSService() {
		
	    LOG.info("building test instance of LocalADCSService");
		return new LocalADCSService( new ADCSTestInstance());
	}
}
