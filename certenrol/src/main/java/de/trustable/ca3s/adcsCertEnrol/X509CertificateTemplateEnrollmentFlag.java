
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509CertificateTemplateEnrollmentFlag implements IComEnum {
    
    /**
     * (1)
     */
    EnrollmentIncludeSymmetricAlgorithms(1),
    
    /**
     * (2)
     */
    EnrollmentPendAllRequests(2),
    
    /**
     * (4)
     */
    EnrollmentPublishToKRAContainer(4),
    
    /**
     * (8)
     */
    EnrollmentPublishToDS(8),
    
    /**
     * (16)
     */
    EnrollmentAutoEnrollmentCheckUserDSCertificate(16),
    
    /**
     * (32)
     */
    EnrollmentAutoEnrollment(32),
    
    /**
     * (128)
     */
    EnrollmentDomainAuthenticationNotRequired(128),
    
    /**
     * (64)
     */
    EnrollmentPreviousApprovalValidateReenrollment(64),
    
    /**
     * (256)
     */
    EnrollmentUserInteractionRequired(256),
    
    /**
     * (512)
     */
    EnrollmentAddTemplateName(512),
    
    /**
     * (1024)
     */
    EnrollmentRemoveInvalidCertificateFromPersonalStore(1024),
    
    /**
     * (2048)
     */
    EnrollmentAllowEnrollOnBehalfOf(2048),
    
    /**
     * (4096)
     */
    EnrollmentAddOCSPNoCheck(4096),
    
    /**
     * (8192)
     */
    EnrollmentReuseKeyOnFullSmartCard(8192),
    
    /**
     * (16384)
     */
    EnrollmentNoRevocationInfoInCerts(16384),
    
    /**
     * (32768)
     */
    EnrollmentIncludeBasicConstraintsForEECerts(32768),
    
    /**
     * (65536)
     */
    EnrollmentPreviousApprovalKeyBasedValidateReenrollment(65536),
    
    /**
     * (131072)
     */
    EnrollmentCertificateIssuancePoliciesFromRequest(131072),
    
    /**
     * (262144)
     */
    EnrollmentSkipAutoRenewal(262144),
    ;

    private X509CertificateTemplateEnrollmentFlag(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}