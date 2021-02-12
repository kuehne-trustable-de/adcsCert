
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum ObjectIdPublicKeyFlags implements IComEnum {
    
    /**
     * (0)
     */
    XCN_CRYPT_OID_INFO_PUBKEY_ANY(0),
    
    /**
     * (-2147483648)
     */
    XCN_CRYPT_OID_INFO_PUBKEY_SIGN_KEY_FLAG(-2147483648),
    
    /**
     * (1073741824)
     */
    XCN_CRYPT_OID_INFO_PUBKEY_ENCRYPT_KEY_FLAG(1073741824),
    ;

    private ObjectIdPublicKeyFlags(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}