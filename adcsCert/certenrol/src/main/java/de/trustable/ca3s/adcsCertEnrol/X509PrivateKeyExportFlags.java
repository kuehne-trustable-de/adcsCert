
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509PrivateKeyExportFlags implements IComEnum {
    
    /**
     * (0)
     */
    XCN_NCRYPT_ALLOW_EXPORT_NONE(0),
    
    /**
     * (1)
     */
    XCN_NCRYPT_ALLOW_EXPORT_FLAG(1),
    
    /**
     * (2)
     */
    XCN_NCRYPT_ALLOW_PLAINTEXT_EXPORT_FLAG(2),
    
    /**
     * (4)
     */
    XCN_NCRYPT_ALLOW_ARCHIVING_FLAG(4),
    
    /**
     * (8)
     */
    XCN_NCRYPT_ALLOW_PLAINTEXT_ARCHIVING_FLAG(8),
    ;

    private X509PrivateKeyExportFlags(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}