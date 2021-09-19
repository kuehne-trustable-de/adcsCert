
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509KeySpec implements IComEnum {
    
    /**
     * (0)
     */
    XCN_AT_NONE(0),
    
    /**
     * (1)
     */
    XCN_AT_KEYEXCHANGE(1),
    
    /**
     * (2)
     */
    XCN_AT_SIGNATURE(2),
    ;

    private X509KeySpec(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}