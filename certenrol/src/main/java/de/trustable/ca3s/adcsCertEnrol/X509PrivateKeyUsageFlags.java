
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509PrivateKeyUsageFlags implements IComEnum {
    
    /**
     * (0)
     */
    XCN_NCRYPT_ALLOW_USAGES_NONE(0),
    
    /**
     * (1)
     */
    XCN_NCRYPT_ALLOW_DECRYPT_FLAG(1),
    
    /**
     * (2)
     */
    XCN_NCRYPT_ALLOW_SIGNING_FLAG(2),
    
    /**
     * (4)
     */
    XCN_NCRYPT_ALLOW_KEY_AGREEMENT_FLAG(4),
    
    /**
     * (8)
     */
    XCN_NCRYPT_ALLOW_KEY_IMPORT_FLAG(8),
    
    /**
     * (16777215)
     */
    XCN_NCRYPT_ALLOW_ALL_USAGES(16777215),
    ;

    private X509PrivateKeyUsageFlags(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}