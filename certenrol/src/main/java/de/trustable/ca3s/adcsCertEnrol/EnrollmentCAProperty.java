
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum EnrollmentCAProperty implements IComEnum {
    
    /**
     * (1)
     */
    CAPropCommonName(1),
    
    /**
     * (2)
     */
    CAPropDistinguishedName(2),
    
    /**
     * (3)
     */
    CAPropSanitizedName(3),
    
    /**
     * (4)
     */
    CAPropSanitizedShortName(4),
    
    /**
     * (5)
     */
    CAPropDNSName(5),
    
    /**
     * (6)
     */
    CAPropCertificateTypes(6),
    
    /**
     * (7)
     */
    CAPropCertificate(7),
    
    /**
     * (8)
     */
    CAPropDescription(8),
    
    /**
     * (9)
     */
    CAPropWebServers(9),
    
    /**
     * (10)
     */
    CAPropSiteName(10),
    
    /**
     * (11)
     */
    CAPropSecurity(11),
    
    /**
     * (12)
     */
    CAPropRenewalOnly(12),
    ;

    private EnrollmentCAProperty(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}