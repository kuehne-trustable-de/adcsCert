package de.trustable.ca3s.adcsKeyStore.provider;

import de.trustable.ca3s.adcs.proxy.web.rest.LocalADCSService;
import de.trustable.ca3s.adcsCertUtil.ADCSException;
import de.trustable.ca3s.adcsCertUtil.CertificateEnrollmentResponse;
import de.trustable.ca3s.adcsCertUtil.NoLocalADCSException;
import de.trustable.ca3s.adcsCertUtil.SubmitStatus;
import de.trustable.ca3s.cert.bundle.BundleFactory;
import de.trustable.ca3s.cert.bundle.KeyCertBundle;
import de.trustable.util.CryptoUtil;
import java.io.IOException;
import java.io.StringWriter;
import java.net.InetAddress;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.ExtendedKeyUsage;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.KeyPurposeId;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.openssl.jcajce.JcaPEMWriter;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LocalADCSBundleFactory implements BundleFactory {

    private static final Logger LOG = LoggerFactory.getLogger(
        LocalADCSBundleFactory.class
    );

    public static final String KEY_STORE_PROPERTIES_PREFIX = "server.tls.";
    private static final String ADDITIONAL_SANS =
        KEY_STORE_PROPERTIES_PREFIX + "additionalSANs";
    private static final String KEY_LENGTH =
        KEY_STORE_PROPERTIES_PREFIX + "key.length";
    private static final String KEY_ALGO =
        KEY_STORE_PROPERTIES_PREFIX + "key.algorithm";
    private static final String SIGNING_ALGO =
        KEY_STORE_PROPERTIES_PREFIX + "signing.algorithm";

    private String keyAlgo = "RSA";
    private String signingAlgo = "SHA256withRSA";
    private int keylength = 2048;
    private String[] sanArr = new String[0];

    /**
     *
     * @param propProvider
     */
    public LocalADCSBundleFactory(PropertyProvider propProvider) {
        LOG.debug("cTor LocalADCSBundleFactory(proProvider)");

        if (propProvider != null) {
            String san = propProvider.getProperty(ADDITIONAL_SANS, "");
            sanArr = san.split(",");
            for (String additionalSan : sanArr) {
                LOG.debug("additionalSan : " + additionalSan);
            }

            String length = propProvider.getProperty(KEY_LENGTH, "2048");
            keylength = Integer.parseUnsignedInt(length);

            keyAlgo = propProvider.getProperty(KEY_ALGO, "RSA");

            signingAlgo =
                propProvider.getProperty(SIGNING_ALGO, "SHA256withRSA");
        }
    }

    /**
     *
     */
    @Override
    public KeyCertBundle newKeyBundle(
        String bundleName,
        long minValiditySeconds
    ) throws GeneralSecurityException {
        try {
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance(keyAlgo);
            keyGen.initialize(keylength);
            KeyPair kp = keyGen.genKeyPair();

            InetAddress ip = InetAddress.getLocalHost();
            String hostname = ip.getCanonicalHostName();
            LOG.debug("requesting certificate for host : " + hostname);

            String csr = createCsrAsPEM(
                hostname,
                kp.getPublic(),
                kp.getPrivate()
            );

            LocalADCSService adcsService = new LocalADCSService();
            Map<String, String> attrMap = new HashMap<String, String>();

            if (bundleName.contains("@")) {
                String[] parts = bundleName.split("@");
                if (parts.length > 1) {
                    String template = parts[1].replaceAll(" ", "");
                    LOG.debug(
                        "requesting certificate using template : " + template
                    );
                    attrMap.put("Certificate Template", template);
                } else {
                    LOG.warn(
                        "alias contains an '@', but it is not followed by a template name!"
                    );
                }
            } else {
                LOG.debug(
                    "requesting certificate using bundle name '{}' without a template. This is valid for non-domain ADCS instances.",
                    bundleName
                );
            }

            CertificateEnrollmentResponse certResponse = adcsService
                .getADCSConnector()
                .submitRequest(csr, attrMap);

            if (SubmitStatus.ISSUED.equals(certResponse.getStatus())) {
                X509Certificate cert = CryptoUtil.convertPemToCertificate(
                    certResponse.getB64Cert()
                );
                X509Certificate caCert = CryptoUtil.convertPemToCertificate(
                    certResponse.getB64CACert()
                );
                X509Certificate[] caCertArr = { cert, caCert };

                LOG.debug(
                    "succeeded to retrieve certificate from ADCS instance"
                );
                return new KeyCertBundle(
                    bundleName,
                    caCertArr,
                    cert,
                    kp.getPrivate()
                );
            } else {
                LOG.error(
                    "failed to retrieve certificate from ADCS instance, status : '{}', check request id {}",
                    certResponse.getStatus(),
                    certResponse.getReqId()
                );
                throw new GeneralSecurityException(
                    "failed to retrieve certificate from ADCS instance!"
                );
            }
        } catch (NoLocalADCSException nlae) {
            LOG.error("ADCSConnector not available !");
            throw new GeneralSecurityException(
                "ADCSConnector not available !",
                nlae
            );
        } catch (IOException | ADCSException ex) {
            LOG.warn("failed to retrieve certificate from ADCS instance", ex);
            throw new GeneralSecurityException(
                "ADCSConnector not available !",
                ex
            );
        }
    }

    /**
     *
     * @param hostname
     * @param pubKey
     * @param priKey
     * @return
     * @throws GeneralSecurityException
     * @throws IOException
     */
    private String createCsrAsPEM(
        final String hostname,
        PublicKey pubKey,
        PrivateKey priKey
    ) throws GeneralSecurityException, IOException {
        X500Principal subject = new X500Principal("CN=" + hostname);

        SubjectPublicKeyInfo pkInfo = SubjectPublicKeyInfo.getInstance(
            pubKey.getEncoded()
        );

        JcaContentSignerBuilder signerBuilder = new JcaContentSignerBuilder(
            signingAlgo
        );
        ContentSigner signer;
        try {
            signer = signerBuilder.build(priKey);
        } catch (OperatorCreationException e) {
            IOException ioe = new IOException();
            ioe.initCause(e);
            throw ioe;
        }

        PKCS10CertificationRequestBuilder builder = new PKCS10CertificationRequestBuilder(
            X500Name.getInstance(subject.getEncoded()),
            pkInfo
        );

        ExtensionsGenerator extensionsGenerator = new ExtensionsGenerator();
        extensionsGenerator.addExtension(
            Extension.extendedKeyUsage,
            false,
            new ExtendedKeyUsage(KeyPurposeId.id_kp_serverAuth)
        );

        List<GeneralName> namesList = new ArrayList<>();

        boolean localhostRequested = "localhost".equalsIgnoreCase(hostname);

        for (String additionalSan : sanArr) {
            String name = additionalSan.trim();
            if (name.length() == 0) {
                continue;
            }

            LOG.debug("set additonal SAN: " + name);
            namesList.add(new GeneralName(GeneralName.dNSName, name));
            if ("localhost".equalsIgnoreCase(name)) {
                localhostRequested = true;
            }
        }

        if (!localhostRequested) {
            namesList.add(new GeneralName(GeneralName.dNSName, "localhost"));
        }

        namesList.add(
            new GeneralName(GeneralName.dNSName, hostname.toLowerCase())
        );

        namesList.add(new GeneralName(GeneralName.iPAddress, "127.0.0.1"));
        GeneralNames subjectAltNames = new GeneralNames(
            namesList.toArray(new GeneralName[] {})
        );
        extensionsGenerator.addExtension(
            Extension.subjectAlternativeName,
            false,
            subjectAltNames
        );

        builder.addAttribute(
            PKCSObjectIdentifiers.pkcs_9_at_extensionRequest,
            extensionsGenerator.generate()
        );

        PKCS10CertificationRequest req = builder.build(signer);

        StringWriter stringWriter = new StringWriter();
        JcaPEMWriter pemWriter = new JcaPEMWriter(stringWriter);
        pemWriter.writeObject(req);
        pemWriter.close();

        return stringWriter.toString();
    }
}
