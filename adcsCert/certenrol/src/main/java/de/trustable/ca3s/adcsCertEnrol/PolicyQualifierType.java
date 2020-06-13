
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum PolicyQualifierType implements IComEnum {
    
    /**
     * (0)
     */
    PolicyQualifierTypeUnknown(0),
    
    /**
     * (1)
     */
    PolicyQualifierTypeUrl(1),
    
    /**
     * (2)
     */
    PolicyQualifierTypeUserNotice(2),
    
    /**
     * (3)
     */
    PolicyQualifierTypeFlags(3),
    ;

    private PolicyQualifierType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}