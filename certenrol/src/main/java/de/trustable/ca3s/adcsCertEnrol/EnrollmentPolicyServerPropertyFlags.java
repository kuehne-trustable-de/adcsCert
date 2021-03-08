
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum EnrollmentPolicyServerPropertyFlags implements IComEnum {
    
    /**
     * (0)
     */
    DefaultNone(0),
    
    /**
     * (1)
     */
    DefaultPolicyServer(1),
    ;

    private EnrollmentPolicyServerPropertyFlags(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}