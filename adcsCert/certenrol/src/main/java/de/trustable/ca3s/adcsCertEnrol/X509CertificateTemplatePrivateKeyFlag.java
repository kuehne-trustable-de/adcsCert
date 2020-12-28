
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509CertificateTemplatePrivateKeyFlag implements IComEnum {
    
    /**
     * (1)
     */
    PrivateKeyRequireArchival(1),
    
    /**
     * (16)
     */
    PrivateKeyExportable(16),
    
    /**
     * (32)
     */
    PrivateKeyRequireStrongKeyProtection(32),
    
    /**
     * (64)
     */
    PrivateKeyRequireAlternateSignatureAlgorithm(64),
    
    /**
     * (128)
     */
    PrivateKeyRequireSameKeyRenewal(128),
    
    /**
     * (256)
     */
    PrivateKeyUseLegacyProvider(256),
    
    /**
     * (512)
     */
    PrivateKeyEKTrustOnUse(512),
    
    /**
     * (1024)
     */
    PrivateKeyEKValidateCert(1024),
    
    /**
     * (2048)
     */
    PrivateKeyEKValidateKey(2048),
    
    /**
     * (0)
     */
    PrivateKeyAttestNone(0),
    
    /**
     * (4096)
     */
    PrivateKeyAttestPreferred(4096),
    
    /**
     * (8192)
     */
    PrivateKeyAttestRequired(8192),
    
    /**
     * (12288)
     */
    PrivateKeyAttestMask(12288),
    
    /**
     * (16384)
     */
    PrivateKeyAttestWithoutPolicy(16384),
    
    /**
     * (983040)
     */
    PrivateKeyServerVersionMask(983040),
    
    /**
     * (16)
     */
    PrivateKeyServerVersionShift(16),
    
    /**
     * (1048576)
     */
    PrivateKeyHelloKspKey(1048576),
    
    /**
     * (2097152)
     */
    PrivateKeyHelloLogonKey(2097152),
    
    /**
     * (251658240)
     */
    PrivateKeyClientVersionMask(251658240),
    
    /**
     * (24)
     */
    PrivateKeyClientVersionShift(24),
    ;

    private X509CertificateTemplatePrivateKeyFlag(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}