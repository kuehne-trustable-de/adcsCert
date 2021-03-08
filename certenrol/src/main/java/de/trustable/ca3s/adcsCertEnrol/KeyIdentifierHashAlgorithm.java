
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum KeyIdentifierHashAlgorithm implements IComEnum {
    
    /**
     * (0)
     */
    SKIHashDefault(0),
    
    /**
     * (1)
     */
    SKIHashSha1(1),
    
    /**
     * (2)
     */
    SKIHashCapiSha1(2),
    
    /**
     * (3)
     */
    SKIHashSha256(3),
    
    /**
     * (5)
     */
    SKIHashHPKP(5),
    ;

    private KeyIdentifierHashAlgorithm(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}