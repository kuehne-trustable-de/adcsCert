
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum PolicyServerUrlPropertyID implements IComEnum {
    
    /**
     * (0)
     */
    PsPolicyID(0),
    
    /**
     * (1)
     */
    PsFriendlyName(1),
    ;

    private PolicyServerUrlPropertyID(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}