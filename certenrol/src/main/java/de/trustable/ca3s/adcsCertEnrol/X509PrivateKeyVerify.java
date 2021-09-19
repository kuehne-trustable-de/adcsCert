
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509PrivateKeyVerify implements IComEnum {
    
    /**
     * (0)
     */
    VerifyNone(0),
    
    /**
     * (1)
     */
    VerifySilent(1),
    
    /**
     * (2)
     */
    VerifySmartCardNone(2),
    
    /**
     * (3)
     */
    VerifySmartCardSilent(3),
    
    /**
     * (4)
     */
    VerifyAllowUI(4),
    ;

    private X509PrivateKeyVerify(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}