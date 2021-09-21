package de.trustable.ca3s.adcs.proxy.config;

import de.trustable.ca3s.adcsKeyStore.provider.LocalADCSBundleFactory;
import de.trustable.ca3s.adcsKeyStore.provider.LocalADCSKeyManager;
import de.trustable.ca3s.adcsKeyStore.provider.LocalADCSKeyManagerFactory;
import de.trustable.ca3s.adcsKeyStore.provider.LocalADCSKeyManagerProvider;
import de.trustable.ca3s.adcsKeyStore.provider.LocalADCSProvider;
import de.trustable.ca3s.adcsKeyStore.provider.SpringEnvironmentPropertyProviderImpl;
import de.trustable.ca3s.cert.bundle.TimedRenewalCertMap;
import de.trustable.ca3s.cert.bundle.TimedRenewalKeyManagerFactorySpi;
import de.trustable.util.JCAManager;
import java.security.Security;
import javax.servlet.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.server.*;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.util.CollectionUtils;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import tech.jhipster.config.JHipsterProperties;

/**
 * Configuration of web application with Servlet 3.0 APIs.
 */
@Configuration
public class WebConfigurer implements ServletContextInitializer {

    private final Logger log = LoggerFactory.getLogger(WebConfigurer.class);

    private final Environment env;

    private final JHipsterProperties jHipsterProperties;

    public WebConfigurer(
        Environment env,
        JHipsterProperties jHipsterProperties
    ) {
        this.env = env;
        this.jHipsterProperties = jHipsterProperties;
    }

    @Override
    public void onStartup(ServletContext servletContext)
        throws ServletException {
        /*
        JCAManager.getInstance();

        SpringEnvironmentPropertyProviderImpl propProvider = new SpringEnvironmentPropertyProviderImpl(env);
        TimedRenewalCertMap certMap = new TimedRenewalCertMap(new LocalADCSBundleFactory(propProvider));

        LocalADCSKeyManager keyManager = new LocalADCSKeyManager(certMap);
        LocalADCSKeyManagerFactory keyMangerFactory = new LocalADCSKeyManagerFactory(keyManager);

        Security.addProvider(new LocalADCSProvider(certMap, propProvider));

        Security.addProvider(new LocalADCSKeyManagerProvider(certMap));
*/
        if (env.getActiveProfiles().length != 0) {
            log.info(
                "Web application configuration, using profiles: {}",
                (Object[]) env.getActiveProfiles()
            );
        }

        log.info("Web application fully configured");
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = jHipsterProperties.getCors();
        if (!CollectionUtils.isEmpty(config.getAllowedOrigins()) || !CollectionUtils.isEmpty(config.getAllowedOriginPatterns())) {
            log.debug("Registering CORS filter");
            source.registerCorsConfiguration("/api/**", config);
            source.registerCorsConfiguration("/management/**", config);
            source.registerCorsConfiguration("/v2/api-docs", config);
            source.registerCorsConfiguration("/v3/api-docs", config);
            source.registerCorsConfiguration("/swagger-resources", config);
            source.registerCorsConfiguration("/swagger-ui/**", config);
        }
        return new CorsFilter(source);
    }
}
