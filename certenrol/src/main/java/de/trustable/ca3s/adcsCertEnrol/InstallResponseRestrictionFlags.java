
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum InstallResponseRestrictionFlags implements IComEnum {
    
    /**
     * (0)
     */
    AllowNone(0),
    
    /**
     * (1)
     */
    AllowNoOutstandingRequest(1),
    
    /**
     * (2)
     */
    AllowUntrustedCertificate(2),
    
    /**
     * (4)
     */
    AllowUntrustedRoot(4),
    ;

    private InstallResponseRestrictionFlags(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}