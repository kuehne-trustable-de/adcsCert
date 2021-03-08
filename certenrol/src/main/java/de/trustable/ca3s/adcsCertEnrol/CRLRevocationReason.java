
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum CRLRevocationReason implements IComEnum {
    
    /**
     * (0)
     */
    XCN_CRL_REASON_UNSPECIFIED(0),
    
    /**
     * (1)
     */
    XCN_CRL_REASON_KEY_COMPROMISE(1),
    
    /**
     * (2)
     */
    XCN_CRL_REASON_CA_COMPROMISE(2),
    
    /**
     * (3)
     */
    XCN_CRL_REASON_AFFILIATION_CHANGED(3),
    
    /**
     * (4)
     */
    XCN_CRL_REASON_SUPERSEDED(4),
    
    /**
     * (5)
     */
    XCN_CRL_REASON_CESSATION_OF_OPERATION(5),
    
    /**
     * (6)
     */
    XCN_CRL_REASON_CERTIFICATE_HOLD(6),
    
    /**
     * (8)
     */
    XCN_CRL_REASON_REMOVE_FROM_CRL(8),
    
    /**
     * (9)
     */
    XCN_CRL_REASON_PRIVILEGE_WITHDRAWN(9),
    
    /**
     * (10)
     */
    XCN_CRL_REASON_AA_COMPROMISE(10),
    ;

    private CRLRevocationReason(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}