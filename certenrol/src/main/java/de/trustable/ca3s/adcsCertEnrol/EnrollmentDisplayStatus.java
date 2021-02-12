
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum EnrollmentDisplayStatus implements IComEnum {
    
    /**
     * (0)
     */
    DisplayNo(0),
    
    /**
     * (1)
     */
    DisplayYes(1),
    ;

    private EnrollmentDisplayStatus(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}