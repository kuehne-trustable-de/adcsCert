
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509CertificateTemplateSubjectNameFlag implements IComEnum {
    
    /**
     * (1)
     */
    SubjectNameEnrolleeSupplies(1),
    
    /**
     * (-2147483648)
     */
    SubjectNameRequireDirectoryPath(-2147483648),
    
    /**
     * (1073741824)
     */
    SubjectNameRequireCommonName(1073741824),
    
    /**
     * (536870912)
     */
    SubjectNameRequireEmail(536870912),
    
    /**
     * (268435456)
     */
    SubjectNameRequireDNS(268435456),
    
    /**
     * (8)
     */
    SubjectNameAndAlternativeNameOldCertSupplies(8),
    
    /**
     * (65536)
     */
    SubjectAlternativeNameEnrolleeSupplies(65536),
    
    /**
     * (16777216)
     */
    SubjectAlternativeNameRequireDirectoryGUID(16777216),
    
    /**
     * (33554432)
     */
    SubjectAlternativeNameRequireUPN(33554432),
    
    /**
     * (67108864)
     */
    SubjectAlternativeNameRequireEmail(67108864),
    
    /**
     * (8388608)
     */
    SubjectAlternativeNameRequireSPN(8388608),
    
    /**
     * (134217728)
     */
    SubjectAlternativeNameRequireDNS(134217728),
    
    /**
     * (4194304)
     */
    SubjectAlternativeNameRequireDomainDNS(4194304),
    ;

    private X509CertificateTemplateSubjectNameFlag(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}