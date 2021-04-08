
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum AlgorithmOperationFlags implements IComEnum {
    
    /**
     * (0)
     */
    XCN_NCRYPT_NO_OPERATION(0),
    
    /**
     * (1)
     */
    XCN_NCRYPT_CIPHER_OPERATION(1),
    
    /**
     * (2)
     */
    XCN_NCRYPT_HASH_OPERATION(2),
    
    /**
     * (4)
     */
    XCN_NCRYPT_ASYMMETRIC_ENCRYPTION_OPERATION(4),
    
    /**
     * (8)
     */
    XCN_NCRYPT_SECRET_AGREEMENT_OPERATION(8),
    
    /**
     * (16)
     */
    XCN_NCRYPT_SIGNATURE_OPERATION(16),
    
    /**
     * (32)
     */
    XCN_NCRYPT_RNG_OPERATION(32),
    
    /**
     * (64)
     */
    XCN_NCRYPT_KEY_DERIVATION_OPERATION(64),
    
    /**
     * (28)
     */
    XCN_NCRYPT_ANY_ASYMMETRIC_OPERATION(28),
    
    /**
     * (2097152)
     */
    XCN_NCRYPT_PREFER_SIGNATURE_ONLY_OPERATION(2097152),
    
    /**
     * (4194304)
     */
    XCN_NCRYPT_PREFER_NON_SIGNATURE_OPERATION(4194304),
    
    /**
     * (8388608)
     */
    XCN_NCRYPT_EXACT_MATCH_OPERATION(8388608),
    
    /**
     * (14680064)
     */
    XCN_NCRYPT_PREFERENCE_MASK_OPERATION(14680064),
    ;

    private AlgorithmOperationFlags(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}