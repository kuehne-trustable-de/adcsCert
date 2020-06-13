package de.trustable.ca3s.adcs.proxy.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class ApiKeyAuthenticationManager implements AuthenticationManager {

    private final Logger log = LoggerFactory.getLogger(ApiKeyAuthenticationManager.class);

	private String principalValue;
	
	public ApiKeyAuthenticationManager(String principalValue) {
		this.principalValue = principalValue;
	}
	
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String principal = (String) authentication.getPrincipal();
        if (! principalValue.equalsIgnoreCase(principal)) {
            throw new BadCredentialsException("The API key was not found or not the expected value.");
        }
        log.debug("api key present");
        authentication.setAuthenticated(true);
        return authentication;
    }

}
