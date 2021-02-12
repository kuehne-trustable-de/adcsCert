
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum InnerRequestLevel implements IComEnum {
    
    /**
     * (0)
     */
    LevelInnermost(0),
    
    /**
     * (1)
     */
    LevelNext(1),
    ;

    private InnerRequestLevel(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}