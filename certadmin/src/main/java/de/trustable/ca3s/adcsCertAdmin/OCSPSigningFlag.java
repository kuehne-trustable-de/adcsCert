
package de.trustable.ca3s.adcsCertAdmin;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OCSPSigningFlag implements IComEnum {
    
    /**
     * (1)
     */
    OCSP_SF_SILENT(1),
    
    /**
     * (2)
     */
    OCSP_SF_USE_CACERT(2),
    
    /**
     * (4)
     */
    OCSP_SF_ALLOW_SIGNINGCERT_AUTORENEWAL(4),
    
    /**
     * (8)
     */
    OCSP_SF_FORCE_SIGNINGCERT_ISSUER_ISCA(8),
    
    /**
     * (16)
     */
    OCSP_SF_AUTODISCOVER_SIGNINGCERT(16),
    
    /**
     * (32)
     */
    OCSP_SF_MANUAL_ASSIGN_SIGNINGCERT(32),
    
    /**
     * (64)
     */
    OCSP_SF_RESPONDER_ID_KEYHASH(64),
    
    /**
     * (128)
     */
    OCSP_SF_RESPONDER_ID_NAME(128),
    
    /**
     * (256)
     */
    OCSP_SF_ALLOW_NONCE_EXTENSION(256),
    
    /**
     * (512)
     */
    OCSP_SF_ALLOW_SIGNINGCERT_AUTOENROLLMENT(512),
    ;

    private OCSPSigningFlag(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}