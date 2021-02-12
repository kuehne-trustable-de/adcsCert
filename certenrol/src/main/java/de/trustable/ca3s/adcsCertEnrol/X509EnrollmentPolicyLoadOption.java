
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509EnrollmentPolicyLoadOption implements IComEnum {
    
    /**
     * (0)
     */
    LoadOptionDefault(0),
    
    /**
     * (1)
     */
    LoadOptionCacheOnly(1),
    
    /**
     * (2)
     */
    LoadOptionReload(2),
    
    /**
     * (4)
     */
    LoadOptionRegisterForADChanges(4),
    ;

    private X509EnrollmentPolicyLoadOption(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}