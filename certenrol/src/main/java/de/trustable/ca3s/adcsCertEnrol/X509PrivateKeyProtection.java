
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509PrivateKeyProtection implements IComEnum {
    
    /**
     * (0)
     */
    XCN_NCRYPT_UI_NO_PROTECTION_FLAG(0),
    
    /**
     * (1)
     */
    XCN_NCRYPT_UI_PROTECT_KEY_FLAG(1),
    
    /**
     * (2)
     */
    XCN_NCRYPT_UI_FORCE_HIGH_PROTECTION_FLAG(2),
    
    /**
     * (4)
     */
    XCN_NCRYPT_UI_FINGERPRINT_PROTECTION_FLAG(4),
    
    /**
     * (8)
     */
    XCN_NCRYPT_UI_APPCONTAINER_ACCESS_MEDIUM_FLAG(8),
    ;

    private X509PrivateKeyProtection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}