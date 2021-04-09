package de.trustable.ca3s.adcs.proxy.config;

import de.trustable.ca3s.adcs.proxy.security.*;
import de.trustable.ca3s.adcs.proxy.security.AuthoritiesConstants;
import de.trustable.ca3s.adcs.proxy.security.jwt.*;
import de.trustable.ca3s.adcs.proxy.security.jwt.JWTConfigurer;
import de.trustable.ca3s.adcs.proxy.security.jwt.TokenProvider;
import de.trustable.ca3s.adcs.proxy.service.JWSService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.header.writers.ReferrerPolicyHeaderWriter;
import org.zalando.problem.spring.web.advice.security.SecurityProblemSupport;
import tech.jhipster.config.JHipsterProperties;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
@Import(SecurityProblemSupport.class)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final JHipsterProperties jHipsterProperties;

    private static final Logger log = LoggerFactory.getLogger(
        SecurityConfiguration.class
    );

    @Value("${adcs-proxy.connection.api-key-header-name:X-API-Key}")
    private String principalRequestHeader;

    @Value("${adcs-proxy.connection.use-api-key:false}")
    private String useApiKey;

    @Autowired
    private JWSService jwsService;

    private final TokenProvider tokenProvider;
    private final SecurityProblemSupport problemSupport;

    public SecurityConfiguration(
        TokenProvider tokenProvider,
        JHipsterProperties jHipsterProperties,
        SecurityProblemSupport problemSupport
    ) {
        this.tokenProvider = tokenProvider;
        this.problemSupport = problemSupport;
        this.jHipsterProperties = jHipsterProperties;
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        APIKeyAuthFilter filter = new APIKeyAuthFilter(principalRequestHeader);

        ApiKeyAuthenticationManager authManager = new ApiKeyAuthenticationManager(
            jwsService.getAPIKey()
        );

        filter.setAuthenticationManager(authManager);

        // @formatter:off
        JWTConfigurer config = http
            .csrf()
            .disable()
            .exceptionHandling()
                .authenticationEntryPoint(problemSupport)
                .accessDeniedHandler(problemSupport)
        .and()
            .headers()
            .contentSecurityPolicy(jHipsterProperties.getSecurity().getContentSecurityPolicy())
        .and()
            .referrerPolicy(ReferrerPolicyHeaderWriter.ReferrerPolicy.STRICT_ORIGIN_WHEN_CROSS_ORIGIN)
        .and()
            .featurePolicy("geolocation 'none'; midi 'none'; sync-xhr 'none'; microphone 'none'; camera 'none'; magnetometer 'none'; gyroscope 'none'; fullscreen 'self'; payment 'none'")
        .and()
            .frameOptions()
            .deny()
        .and()
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and()
            .authorizeRequests()
            .antMatchers("/api/authenticate").permitAll()
            .antMatchers("/api/admin/**").hasAuthority(AuthoritiesConstants.ADMIN)
            .antMatchers("/api/**").authenticated()
            .antMatchers("/management/health").permitAll()
            .antMatchers("/management/health/**").permitAll()
            .antMatchers("/management/info").permitAll()
            .antMatchers("/management/prometheus").permitAll()
            .antMatchers("/management/**").hasAuthority(AuthoritiesConstants.ADMIN)
        .and()
            .apply(securityConfigurerAdapter());

        if( Boolean.parseBoolean(useApiKey)) {
        	config.and().addFilter(filter).authorizeRequests().anyRequest().authenticated();
        	log.info("api-key required on every call");
        }
        // @formatter:on
    }

    private JWTConfigurer securityConfigurerAdapter() {
        return new JWTConfigurer(tokenProvider);
    }
}
