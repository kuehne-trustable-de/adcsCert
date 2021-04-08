
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509SCEPDisposition implements IComEnum {
    
    /**
     * (-1)
     */
    SCEPDispositionUnknown(-1),
    
    /**
     * (0)
     */
    SCEPDispositionSuccess(0),
    
    /**
     * (2)
     */
    SCEPDispositionFailure(2),
    
    /**
     * (3)
     */
    SCEPDispositionPending(3),
    
    /**
     * (11)
     */
    SCEPDispositionPendingChallenge(11),
    ;

    private X509SCEPDisposition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}