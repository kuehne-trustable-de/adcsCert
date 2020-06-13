
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum KeyAttestationClaimType implements IComEnum {
    
    /**
     * (0)
     */
    XCN_NCRYPT_CLAIM_NONE(0),
    
    /**
     * (3)
     */
    XCN_NCRYPT_CLAIM_AUTHORITY_AND_SUBJECT(3),
    
    /**
     * (1)
     */
    XCN_NCRYPT_CLAIM_AUTHORITY_ONLY(1),
    
    /**
     * (2)
     */
    XCN_NCRYPT_CLAIM_SUBJECT_ONLY(2),
    
    /**
     * (4096)
     */
    XCN_NCRYPT_CLAIM_UNKNOWN(4096),
    ;

    private KeyAttestationClaimType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}