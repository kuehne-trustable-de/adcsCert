
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum AlgorithmType implements IComEnum {
    
    /**
     * (0)
     */
    XCN_BCRYPT_UNKNOWN_INTERFACE(0),
    
    /**
     * (1)
     */
    XCN_BCRYPT_CIPHER_INTERFACE(1),
    
    /**
     * (2)
     */
    XCN_BCRYPT_HASH_INTERFACE(2),
    
    /**
     * (3)
     */
    XCN_BCRYPT_ASYMMETRIC_ENCRYPTION_INTERFACE(3),
    
    /**
     * (5)
     */
    XCN_BCRYPT_SIGNATURE_INTERFACE(5),
    
    /**
     * (4)
     */
    XCN_BCRYPT_SECRET_AGREEMENT_INTERFACE(4),
    
    /**
     * (6)
     */
    XCN_BCRYPT_RNG_INTERFACE(6),
    
    /**
     * (7)
     */
    XCN_BCRYPT_KEY_DERIVATION_INTERFACE(7),
    ;

    private AlgorithmType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}