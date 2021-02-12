
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509SCEPProcessMessageFlags implements IComEnum {
    
    /**
     * (0)
     */
    SCEPProcessDefault(0),
    
    /**
     * (1)
     */
    SCEPProcessSkipCertInstall(1),
    ;

    private X509SCEPProcessMessageFlags(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}