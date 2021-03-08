
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum Pkcs10AllowedSignatureTypes implements IComEnum {
    
    /**
     * (1)
     */
    AllowedKeySignature(1),
    
    /**
     * (2)
     */
    AllowedNullSignature(2),
    ;

    private Pkcs10AllowedSignatureTypes(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}