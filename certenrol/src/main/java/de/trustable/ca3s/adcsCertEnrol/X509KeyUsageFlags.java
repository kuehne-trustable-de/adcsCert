
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509KeyUsageFlags implements IComEnum {
    
    /**
     * (0)
     */
    XCN_CERT_NO_KEY_USAGE(0),
    
    /**
     * (128)
     */
    XCN_CERT_DIGITAL_SIGNATURE_KEY_USAGE(128),
    
    /**
     * (64)
     */
    XCN_CERT_NON_REPUDIATION_KEY_USAGE(64),
    
    /**
     * (32)
     */
    XCN_CERT_KEY_ENCIPHERMENT_KEY_USAGE(32),
    
    /**
     * (16)
     */
    XCN_CERT_DATA_ENCIPHERMENT_KEY_USAGE(16),
    
    /**
     * (8)
     */
    XCN_CERT_KEY_AGREEMENT_KEY_USAGE(8),
    
    /**
     * (4)
     */
    XCN_CERT_KEY_CERT_SIGN_KEY_USAGE(4),
    
    /**
     * (2)
     */
    XCN_CERT_OFFLINE_CRL_SIGN_KEY_USAGE(2),
    
    /**
     * (2)
     */
    XCN_CERT_CRL_SIGN_KEY_USAGE(2),
    
    /**
     * (1)
     */
    XCN_CERT_ENCIPHER_ONLY_KEY_USAGE(1),
    
    /**
     * (32768)
     */
    XCN_CERT_DECIPHER_ONLY_KEY_USAGE(32768),
    ;

    private X509KeyUsageFlags(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}