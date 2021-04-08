
package de.trustable.ca3s.adcsCertAdmin;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OCSPRequestFlag implements IComEnum {
    
    /**
     * (1)
     */
    OCSP_RF_REJECT_SIGNED_REQUESTS(1),
    ;

    private OCSPRequestFlag(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}