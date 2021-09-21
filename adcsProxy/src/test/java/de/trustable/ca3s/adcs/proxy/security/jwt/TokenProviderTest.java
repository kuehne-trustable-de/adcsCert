package de.trustable.ca3s.adcs.proxy.security.jwt;

import static org.assertj.core.api.Assertions.assertThat;

import de.trustable.ca3s.adcs.proxy.security.AuthoritiesConstants;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.test.util.ReflectionTestUtils;
import tech.jhipster.config.JHipsterProperties;

class TokenProviderTest {

    private static final long ONE_MINUTE = 60000;

    private Key key;
    private TokenProvider tokenProvider;

    @BeforeEach
    public void setup() {
        JHipsterProperties jHipsterProperties = new JHipsterProperties();
<<<<<<< HEAD
        String base64Secret =
            "fd54a45s65fds737b9aafcb3412e07ed99b267f33413274720ddbb7f6c5e64e9f14075f2d7ed041592f0b7657baf8";
        jHipsterProperties
            .getSecurity()
            .getAuthentication()
            .getJwt()
            .setBase64Secret(base64Secret);
=======
        String base64Secret = "fd54a45s65fds737b9aafcb3412e07ed99b267f33413274720ddbb7f6c5e64e9f14075f2d7ed041592f0b7657baf8";
        jHipsterProperties.getSecurity().getAuthentication().getJwt().setBase64Secret(base64Secret);
>>>>>>> jhipster_upgrade
        tokenProvider = new TokenProvider(jHipsterProperties);
        key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(base64Secret));

        ReflectionTestUtils.setField(tokenProvider, "key", key);
        ReflectionTestUtils.setField(
            tokenProvider,
            "tokenValidityInMilliseconds",
            ONE_MINUTE
        );
    }

    @Test
    void testReturnFalseWhenJWThasInvalidSignature() {
<<<<<<< HEAD
        boolean isTokenValid = tokenProvider.validateToken(
            createTokenWithDifferentSignature()
        );
=======
        boolean isTokenValid = tokenProvider.validateToken(createTokenWithDifferentSignature());
>>>>>>> jhipster_upgrade

        assertThat(isTokenValid).isFalse();
    }

    @Test
    void testReturnFalseWhenJWTisMalformed() {
        Authentication authentication = createAuthentication();
        String token = tokenProvider.createToken(authentication, false);
        String invalidToken = token.substring(1);
        boolean isTokenValid = tokenProvider.validateToken(invalidToken);

        assertThat(isTokenValid).isFalse();
    }

    @Test
    void testReturnFalseWhenJWTisExpired() {
<<<<<<< HEAD
        ReflectionTestUtils.setField(
            tokenProvider,
            "tokenValidityInMilliseconds",
            -ONE_MINUTE
        );
=======
        ReflectionTestUtils.setField(tokenProvider, "tokenValidityInMilliseconds", -ONE_MINUTE);
>>>>>>> jhipster_upgrade

        Authentication authentication = createAuthentication();
        String token = tokenProvider.createToken(authentication, false);

        boolean isTokenValid = tokenProvider.validateToken(token);

        assertThat(isTokenValid).isFalse();
    }

    @Test
    void testReturnFalseWhenJWTisUnsupported() {
        String unsupportedToken = createUnsupportedToken();

        boolean isTokenValid = tokenProvider.validateToken(unsupportedToken);

        assertThat(isTokenValid).isFalse();
    }

    @Test
    void testReturnFalseWhenJWTisInvalid() {
        boolean isTokenValid = tokenProvider.validateToken("");

        assertThat(isTokenValid).isFalse();
    }

    @Test
    void testKeyIsSetFromSecretWhenSecretIsNotEmpty() {
        final String secret = "NwskoUmKHZtzGRKJKVjsJF7BtQMMxNWi";
        JHipsterProperties jHipsterProperties = new JHipsterProperties();
<<<<<<< HEAD
        jHipsterProperties
            .getSecurity()
            .getAuthentication()
            .getJwt()
            .setSecret(secret);
=======
        jHipsterProperties.getSecurity().getAuthentication().getJwt().setSecret(secret);
>>>>>>> jhipster_upgrade

        TokenProvider tokenProvider = new TokenProvider(jHipsterProperties);

        Key key = (Key) ReflectionTestUtils.getField(tokenProvider, "key");
<<<<<<< HEAD
        assertThat(key)
            .isNotNull()
            .isEqualTo(
                Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8))
            );
=======
        assertThat(key).isNotNull().isEqualTo(Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8)));
>>>>>>> jhipster_upgrade
    }

    @Test
    void testKeyIsSetFromBase64SecretWhenSecretIsEmpty() {
<<<<<<< HEAD
        final String base64Secret =
            "fd54a45s65fds737b9aafcb3412e07ed99b267f33413274720ddbb7f6c5e64e9f14075f2d7ed041592f0b7657baf8";
        JHipsterProperties jHipsterProperties = new JHipsterProperties();
        jHipsterProperties
            .getSecurity()
            .getAuthentication()
            .getJwt()
            .setBase64Secret(base64Secret);
=======
        final String base64Secret = "fd54a45s65fds737b9aafcb3412e07ed99b267f33413274720ddbb7f6c5e64e9f14075f2d7ed041592f0b7657baf8";
        JHipsterProperties jHipsterProperties = new JHipsterProperties();
        jHipsterProperties.getSecurity().getAuthentication().getJwt().setBase64Secret(base64Secret);
>>>>>>> jhipster_upgrade

        TokenProvider tokenProvider = new TokenProvider(jHipsterProperties);

        Key key = (Key) ReflectionTestUtils.getField(tokenProvider, "key");
<<<<<<< HEAD
        assertThat(key)
            .isNotNull()
            .isEqualTo(
                Keys.hmacShaKeyFor(Decoders.BASE64.decode(base64Secret))
            );
=======
        assertThat(key).isNotNull().isEqualTo(Keys.hmacShaKeyFor(Decoders.BASE64.decode(base64Secret)));
>>>>>>> jhipster_upgrade
    }

    private Authentication createAuthentication() {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(
            new SimpleGrantedAuthority(AuthoritiesConstants.ANONYMOUS)
        );
        return new UsernamePasswordAuthenticationToken(
            "anonymous",
            "anonymous",
            authorities
        );
    }

    private String createUnsupportedToken() {
<<<<<<< HEAD
        return Jwts
            .builder()
            .setPayload("payload")
            .signWith(key, SignatureAlgorithm.HS512)
            .compact();
=======
        return Jwts.builder().setPayload("payload").signWith(key, SignatureAlgorithm.HS512).compact();
>>>>>>> jhipster_upgrade
    }

    private String createTokenWithDifferentSignature() {
        Key otherKey = Keys.hmacShaKeyFor(
<<<<<<< HEAD
            Decoders.BASE64.decode(
                "Xfd54a45s65fds737b9aafcb3412e07ed99b267f33413274720ddbb7f6c5e64e9f14075f2d7ed041592f0b7657baf8"
            )
=======
            Decoders.BASE64.decode("Xfd54a45s65fds737b9aafcb3412e07ed99b267f33413274720ddbb7f6c5e64e9f14075f2d7ed041592f0b7657baf8")
>>>>>>> jhipster_upgrade
        );

        return Jwts
            .builder()
            .setSubject("anonymous")
            .signWith(otherKey, SignatureAlgorithm.HS512)
            .setExpiration(new Date(new Date().getTime() + ONE_MINUTE))
            .compact();
    }
}
