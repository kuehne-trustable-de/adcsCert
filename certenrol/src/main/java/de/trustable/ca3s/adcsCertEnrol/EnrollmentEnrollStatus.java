
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum EnrollmentEnrollStatus implements IComEnum {
    
    /**
     * (1)
     */
    Enrolled(1),
    
    /**
     * (2)
     */
    EnrollPended(2),
    
    /**
     * (4)
     */
    EnrollUIDeferredEnrollmentRequired(4),
    
    /**
     * (16)
     */
    EnrollError(16),
    
    /**
     * (32)
     */
    EnrollUnknown(32),
    
    /**
     * (64)
     */
    EnrollSkipped(64),
    
    /**
     * (256)
     */
    EnrollDenied(256),
    ;

    private EnrollmentEnrollStatus(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}