package de.trustable.ca3s.adcs.proxy;

import de.trustable.ca3s.adcs.proxy.config.ApplicationProperties;
import de.trustable.ca3s.adcsKeyStore.provider.LocalADCSBundleFactory;
import de.trustable.ca3s.adcsKeyStore.provider.LocalADCSKeyManagerProvider;
import de.trustable.ca3s.adcsKeyStore.provider.LocalADCSProvider;
import de.trustable.ca3s.adcsKeyStore.provider.SpringEnvironmentPropertyProviderImpl;
import de.trustable.ca3s.cert.bundle.TimedRenewalCertMap;
import de.trustable.util.JCAManager;
import io.undertow.Undertow;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.PostConstruct;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.embedded.undertow.UndertowBuilderCustomizer;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.env.Environment;
import tech.jhipster.config.DefaultProfileUtil;
import tech.jhipster.config.JHipsterConstants;

@SpringBootApplication
@EnableConfigurationProperties({ ApplicationProperties.class })
public class AdcsProxyApp implements InitializingBean {

    private static final Logger log = LoggerFactory.getLogger(
        AdcsProxyApp.class
    );

    private final Environment env;

    public AdcsProxyApp(Environment env) {
        this.env = env;
    }

    /**
     * Initializes adcsProxy.
     * <p>
     * Spring profiles can be configured with a program argument --spring.profiles.active=your-active-profile
     * <p>
     * You can find more information on how profiles work with JHipster on <a href="https://www.jhipster.tech/profiles/">https://www.jhipster.tech/profiles/</a>.
     */
    @PostConstruct
    public void initApplication() {
        Collection<String> activeProfiles = Arrays.asList(
            env.getActiveProfiles()
        );
        if (
            activeProfiles.contains(
                JHipsterConstants.SPRING_PROFILE_DEVELOPMENT
            ) &&
            activeProfiles.contains(JHipsterConstants.SPRING_PROFILE_PRODUCTION)
        ) {
            log.error(
                "You have misconfigured your application! It should not run " +
                "with both the 'dev' and 'prod' profiles at the same time."
            );
        }
        if (
            activeProfiles.contains(
                JHipsterConstants.SPRING_PROFILE_DEVELOPMENT
            ) &&
            activeProfiles.contains(JHipsterConstants.SPRING_PROFILE_CLOUD)
        ) {
            log.error(
                "You have misconfigured your application! It should not " +
                "run with both the 'dev' and 'cloud' profiles at the same time."
            );
        }
    }

    /**
     * Initializes the application.
     * <p>
     * Spring profiles can be configured with a program argument --spring.profiles.active=your-active-profile
     * <p>
     * You can find more information on how profiles work with JHipster on <a href="https://www.jhipster.tech/profiles/">https://www.jhipster.tech/profiles/</a>.
     */
    @Override
    public void afterPropertiesSet() {
        initApplication();
    }

    /**
     * Main method, used to run the application.
     *
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AdcsProxyApp.class);
        DefaultProfileUtil.addDefaultProfile(app);
        Environment env = app.run(args).getEnvironment();
        logApplicationStartup(env);
    }

    private static void logApplicationStartup(Environment env) {
        String protocol = Optional
            .ofNullable(env.getProperty("server.ssl.key-store"))
            .map(key -> "https")
            .orElse("http");
        String serverPort = env.getProperty("server.port");
        String contextPath = Optional
            .ofNullable(env.getProperty("server.servlet.context-path"))
            .filter(StringUtils::isNotBlank)
            .orElse("/");
        String hostAddress = "localhost";
        try {
            hostAddress = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            log.warn(
                "The host name could not be determined, using `localhost` as fallback"
            );
        }
        log.info(
            "\n----------------------------------------------------------\n\t" +
            "Application '{}' is running! Access URLs:\n\t" +
            "Local: \t\t{}://localhost:{}{}\n\t" +
            "External: \t{}://{}:{}{}\n\t" +
            "Profile(s): \t{}\n----------------------------------------------------------",
            env.getProperty("spring.application.name"),
            protocol,
            serverPort,
            contextPath,
            protocol,
            hostAddress,
            serverPort,
            contextPath,
            env.getActiveProfiles()
        );
    }

    @Bean
    public TimedRenewalCertMap timedRenewalCertMap() {
        log.debug("in timedRenewalCertMap()");

        JCAManager.getInstance();

        SpringEnvironmentPropertyProviderImpl propProvider = new SpringEnvironmentPropertyProviderImpl(
            env
        );
        return new TimedRenewalCertMap(
            new LocalADCSBundleFactory(propProvider)
        );
    }

    @Bean
    @DependsOn({ "timedRenewalCertMap" })
    public LocalADCSKeyManagerProvider localADCSKeyManagerProvider() {
        log.debug("in localADCSKeyManagerProvider()");

        LocalADCSKeyManagerProvider localADCSKeyManagerProvider = new LocalADCSKeyManagerProvider(
            timedRenewalCertMap()
        );
        Security.addProvider(localADCSKeyManagerProvider);

        return localADCSKeyManagerProvider;
    }

    @Bean
    @DependsOn({ "timedRenewalCertMap" })
    public LocalADCSProvider localADCSProvider() {
        log.debug("in localADCSProvider()");

        SpringEnvironmentPropertyProviderImpl propProvider = new SpringEnvironmentPropertyProviderImpl(
            env
        );

        LocalADCSProvider localADCSProvider = new LocalADCSProvider(
            timedRenewalCertMap(),
            propProvider
        );
        Security.addProvider(localADCSProvider);

        return localADCSProvider;
    }

    @Bean
    @DependsOn({ "localADCSKeyManagerProvider", "localADCSProvider" })
    public UndertowServletWebServerFactory embeddedServletContainerFactory() {
        log.info(
            "\n----------------------------------------------------------\n\t" +
            " configure Undertow for TLS" +
            "\n----------------------------------------------------------\n\t"
        );

        UndertowServletWebServerFactory factory = new UndertowServletWebServerFactory();

        factory.addBuilderCustomizers(
            new UndertowBuilderCustomizer() {
                @Override
                public void customize(Undertow.Builder builder) {
                    int port = 8443;
                    String host = "0.0.0.0";

                    String sslPort = env.getProperty(
                        LocalADCSBundleFactory.KEY_STORE_PROPERTIES_PREFIX +
                        "port"
                    );

                    if (sslPort == null) {
                        log.debug(
                            "TLS listen port undefined, using default port #" +
                            port
                        );
                    } else {
                        port = Integer.parseUnsignedInt(sslPort);
                    }

                    String configuredHost = env.getProperty(
                        LocalADCSBundleFactory.KEY_STORE_PROPERTIES_PREFIX +
                        "host",
                        "localhost"
                    );
                    if (sslPort == null) {
                        log.debug(
                            "TLS listen host undefined, using default value '" +
                            host +
                            "'"
                        );
                    } else {
                        host = configuredHost.trim();
                    }

                    try {
                        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(
                            LocalADCSKeyManagerProvider.ALGO_NAME
                        );

                        KeyStore ks = KeyStore.getInstance(
                            LocalADCSProvider.ALGO_NAME
                        );
                        ks.load(null, null);

                        keyManagerFactory.init(ks, "password".toCharArray());

                        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
                        log.debug(
                            "keyManagers has #{} elements, first one is a {}",
                            keyManagers.length,
                            keyManagers[0].getClass().getName()
                        );

                        SSLContext sslContext;
                        sslContext = SSLContext.getInstance("TLS");
                        sslContext.init(keyManagers, null, null);

                        builder.addHttpsListener(port, host, sslContext);
                        //                builder.setSocketOption(Options.SSL_CLIENT_AUTH_MODE, SslClientAuthMode.REQUESTED);

                        log.debug(
                            "added TLS listen port {} programmatically",
                            port
                        );
                    } catch (GeneralSecurityException | IOException gse) {
                        log.error("problem configuring TLS port #" + port, gse);
                    }
                }
            }
        );

        return factory;
    }
    /*
     * uncomment to dump incoming requests
     * also ensure debug level is enabled
     * logging:
     *   level:
     *     org.springframework.web.filter.CommonsRequestLoggingFilter: DEBUG
	 *
    @Bean
    public CommonsRequestLoggingFilter logFilter() {
        CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();

        filter.setIncludeQueryString(true);
        filter.setIncludePayload(true);
        filter.setMaxPayloadLength(10000);
        filter.setIncludeHeaders(true);
        filter.setAfterMessagePrefix("REQUEST DATA : ");
        return filter;
            env.getActiveProfiles().length == 0 ? env.getDefaultProfiles() : env.getActiveProfiles()
        );
    }
    */
}
