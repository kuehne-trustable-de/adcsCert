
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509RequestInheritOptions implements IComEnum {
    
    /**
     * (0)
     */
    InheritDefault(0),
    
    /**
     * (1)
     */
    InheritNewDefaultKey(1),
    
    /**
     * (2)
     */
    InheritNewSimilarKey(2),
    
    /**
     * (3)
     */
    InheritPrivateKey(3),
    
    /**
     * (4)
     */
    InheritPublicKey(4),
    
    /**
     * (15)
     */
    InheritKeyMask(15),
    
    /**
     * (16)
     */
    InheritNone(16),
    
    /**
     * (32)
     */
    InheritRenewalCertificateFlag(32),
    
    /**
     * (64)
     */
    InheritTemplateFlag(64),
    
    /**
     * (128)
     */
    InheritSubjectFlag(128),
    
    /**
     * (256)
     */
    InheritExtensionsFlag(256),
    
    /**
     * (512)
     */
    InheritSubjectAltNameFlag(512),
    
    /**
     * (1024)
     */
    InheritValidityPeriodFlag(1024),
    
    /**
     * (-2147483648)
     */
    InheritReserved80000000(-2147483648),
    ;

    private X509RequestInheritOptions(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}