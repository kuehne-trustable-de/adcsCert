
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509HardwareKeyUsageFlags implements IComEnum {
    
    /**
     * (0)
     */
    XCN_NCRYPT_PCP_NONE(0),
    
    /**
     * (65536)
     */
    XCN_NCRYPT_TPM12_PROVIDER(65536),
    
    /**
     * (1)
     */
    XCN_NCRYPT_PCP_SIGNATURE_KEY(1),
    
    /**
     * (2)
     */
    XCN_NCRYPT_PCP_ENCRYPTION_KEY(2),
    
    /**
     * (3)
     */
    XCN_NCRYPT_PCP_GENERIC_KEY(3),
    
    /**
     * (4)
     */
    XCN_NCRYPT_PCP_STORAGE_KEY(4),
    
    /**
     * (8)
     */
    XCN_NCRYPT_PCP_IDENTITY_KEY(8),
    ;

    private X509HardwareKeyUsageFlags(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}