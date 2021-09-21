package de.trustable.ca3s.adcs.proxy.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import tech.jhipster.config.JHipsterConstants;
import tech.jhipster.config.JHipsterProperties;
import tech.jhipster.config.apidoc.customizer.SpringfoxCustomizer;

@Configuration
@Profile(JHipsterConstants.SPRING_PROFILE_API_DOCS)
public class OpenApiConfiguration {

    @Bean
    public SpringfoxCustomizer noApiFirstCustomizer() {
<<<<<<< HEAD
        return docket ->
            docket
                .select()
                .apis(
                    RequestHandlerSelectors
                        .basePackage("de.trustable.ca3s.adcs.proxy.web.api")
                        .negate()
                );
=======
        return docket -> docket.select().apis(RequestHandlerSelectors.basePackage("de.trustable.ca3s.adcs.proxy.web.api").negate());
>>>>>>> jhipster_upgrade
    }

    @Bean
    public Docket apiFirstDocket(JHipsterProperties jHipsterProperties) {
        JHipsterProperties.ApiDocs properties = jHipsterProperties.getApiDocs();
<<<<<<< HEAD
        Contact contact = new Contact(
            properties.getContactName(),
            properties.getContactUrl(),
            properties.getContactEmail()
        );
=======
        Contact contact = new Contact(properties.getContactName(), properties.getContactUrl(), properties.getContactEmail());
>>>>>>> jhipster_upgrade

        ApiInfo apiInfo = new ApiInfo(
            "API First " + properties.getTitle(),
            properties.getDescription(),
            properties.getVersion(),
            properties.getTermsOfServiceUrl(),
            contact,
            properties.getLicense(),
            properties.getLicenseUrl(),
            new ArrayList<>()
        );

        return new Docket(DocumentationType.OAS_30)
            .groupName("openapi")
            .host(properties.getHost())
            .protocols(new HashSet<>(Arrays.asList(properties.getProtocols())))
            .apiInfo(apiInfo)
<<<<<<< HEAD
            .useDefaultResponseMessages(
                properties.isUseDefaultResponseMessages()
            )
=======
            .useDefaultResponseMessages(properties.isUseDefaultResponseMessages())
>>>>>>> jhipster_upgrade
            .forCodeGeneration(true)
            .directModelSubstitute(ByteBuffer.class, String.class)
            .genericModelSubstitutes(ResponseEntity.class)
            .ignoredParameterTypes(Pageable.class)
            .select()
<<<<<<< HEAD
            .apis(
                RequestHandlerSelectors.basePackage(
                    "de.trustable.ca3s.adcs.proxy.web.api"
                )
            )
=======
            .apis(RequestHandlerSelectors.basePackage("de.trustable.ca3s.adcs.proxy.web.api"))
>>>>>>> jhipster_upgrade
            .paths(regex(properties.getDefaultIncludePattern()))
            .build();
    }
}
