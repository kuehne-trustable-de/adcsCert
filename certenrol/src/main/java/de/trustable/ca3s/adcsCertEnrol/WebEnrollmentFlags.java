
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum WebEnrollmentFlags implements IComEnum {
    
    /**
     * (1)
     */
    EnrollPrompt(1),
    ;

    private WebEnrollmentFlags(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}