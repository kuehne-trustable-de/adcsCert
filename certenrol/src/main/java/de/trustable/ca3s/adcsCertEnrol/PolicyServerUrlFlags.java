
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum PolicyServerUrlFlags implements IComEnum {
    
    /**
     * (0)
     */
    PsfNone(0),
    
    /**
     * (1)
     */
    PsfLocationGroupPolicy(1),
    
    /**
     * (2)
     */
    PsfLocationRegistry(2),
    
    /**
     * (4)
     */
    PsfUseClientId(4),
    
    /**
     * (16)
     */
    PsfAutoEnrollmentEnabled(16),
    
    /**
     * (32)
     */
    PsfAllowUnTrustedCA(32),
    ;

    private PolicyServerUrlFlags(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}