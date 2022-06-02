/*
 * ADCSConnector
 * baseline API to request and revoke certificates from an ADCS instance
 *
 * OpenAPI spec version: 1.0.0-oas3
 * Contact: kuehne@trustable.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package de.trustable.ca3s.client.invoker;


import de.trustable.ca3s.client.invoker.auth.ApiKeyAuth;
import de.trustable.ca3s.client.invoker.auth.Authentication;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.ws.rs.client.ClientBuilder;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ADCSApiClient extends ApiClient {

    private static final Logger log = Logger.getLogger(ADCSApiClient.class.getName());

    private final TrustManager[] trustManagers;

    public ADCSApiClient(TrustManager[] trustManagers) {

        super(null);

        // Setup authentications (key: authentication name, value: authentication).
        authentications = new HashMap<>();
        authentications.put("ApiKeyAuth", new ApiKeyAuth("header", "X-API-Key"));

        // Prevent the authentications from being modified.
        authentications = Collections.unmodifiableMap(authentications);

        this.trustManagers = trustManagers;
        httpClient = buildHttpClient();

        log.fine("instantiating ADCSApiClient with trustManagers " + Arrays.toString(trustManagers));
    }

    @Override
    protected void customizeClientBuilder(ClientBuilder clientBuilder) {

        if( trustManagers == null ) {
            log.info("customizeClientBuilder without trustManagers");
        }else{
            log.fine("customizeClientBuilder with " + trustManagers.getClass().getName());
            try {
                SSLContext sslContext = SSLContext.getInstance("TLS");
                sslContext.init(null, trustManagers, new SecureRandom());

                clientBuilder.sslContext(sslContext);
                log.fine("jackson client customized");
            } catch (GeneralSecurityException gse) {
                log.log(Level.SEVERE, "problem customizing jackson client", gse);
            }
        }
    }

}
