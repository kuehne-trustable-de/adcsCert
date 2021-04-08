
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509CertificateEnrollmentContext implements IComEnum {
    
    /**
     * (0)
     */
    ContextNone(0),
    
    /**
     * (1)
     */
    ContextUser(1),
    
    /**
     * (2)
     */
    ContextMachine(2),
    
    /**
     * (3)
     */
    ContextAdministratorForceMachine(3),
    ;

    private X509CertificateEnrollmentContext(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}