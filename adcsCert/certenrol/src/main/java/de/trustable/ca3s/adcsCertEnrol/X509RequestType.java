
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509RequestType implements IComEnum {
    
    /**
     * (0)
     */
    TypeAny(0),
    
    /**
     * (1)
     */
    TypePkcs10(1),
    
    /**
     * (2)
     */
    TypePkcs7(2),
    
    /**
     * (3)
     */
    TypeCmc(3),
    
    /**
     * (4)
     */
    TypeCertificate(4),
    ;

    private X509RequestType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}