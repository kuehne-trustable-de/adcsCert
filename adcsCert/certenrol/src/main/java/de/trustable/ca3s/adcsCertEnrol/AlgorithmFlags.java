
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum AlgorithmFlags implements IComEnum {
    
    /**
     * (0)
     */
    AlgorithmFlagsNone(0),
    
    /**
     * (1)
     */
    AlgorithmFlagsWrap(1),
    ;

    private AlgorithmFlags(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}