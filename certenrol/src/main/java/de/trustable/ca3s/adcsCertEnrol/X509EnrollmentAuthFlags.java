
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509EnrollmentAuthFlags implements IComEnum {
    
    /**
     * (0)
     */
    X509AuthNone(0),
    
    /**
     * (1)
     */
    X509AuthAnonymous(1),
    
    /**
     * (2)
     */
    X509AuthKerberos(2),
    
    /**
     * (4)
     */
    X509AuthUsername(4),
    
    /**
     * (8)
     */
    X509AuthCertificate(8),
    ;

    private X509EnrollmentAuthFlags(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}