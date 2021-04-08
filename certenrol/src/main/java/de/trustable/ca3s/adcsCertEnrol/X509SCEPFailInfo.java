
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509SCEPFailInfo implements IComEnum {
    
    /**
     * (-1)
     */
    SCEPFailUnknown(-1),
    
    /**
     * (0)
     */
    SCEPFailBadAlgorithm(0),
    
    /**
     * (1)
     */
    SCEPFailBadMessageCheck(1),
    
    /**
     * (2)
     */
    SCEPFailBadRequest(2),
    
    /**
     * (3)
     */
    SCEPFailBadTime(3),
    
    /**
     * (4)
     */
    SCEPFailBadCertId(4),
    ;

    private X509SCEPFailInfo(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}