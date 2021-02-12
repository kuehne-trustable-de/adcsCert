
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum EnrollmentTemplateProperty implements IComEnum {
    
    /**
     * (1)
     */
    TemplatePropCommonName(1),
    
    /**
     * (2)
     */
    TemplatePropFriendlyName(2),
    
    /**
     * (3)
     */
    TemplatePropEKUs(3),
    
    /**
     * (4)
     */
    TemplatePropCryptoProviders(4),
    
    /**
     * (5)
     */
    TemplatePropMajorRevision(5),
    
    /**
     * (6)
     */
    TemplatePropDescription(6),
    
    /**
     * (7)
     */
    TemplatePropKeySpec(7),
    
    /**
     * (8)
     */
    TemplatePropSchemaVersion(8),
    
    /**
     * (9)
     */
    TemplatePropMinorRevision(9),
    
    /**
     * (10)
     */
    TemplatePropRASignatureCount(10),
    
    /**
     * (11)
     */
    TemplatePropMinimumKeySize(11),
    
    /**
     * (12)
     */
    TemplatePropOID(12),
    
    /**
     * (13)
     */
    TemplatePropSupersede(13),
    
    /**
     * (14)
     */
    TemplatePropRACertificatePolicies(14),
    
    /**
     * (15)
     */
    TemplatePropRAEKUs(15),
    
    /**
     * (16)
     */
    TemplatePropCertificatePolicies(16),
    
    /**
     * (17)
     */
    TemplatePropV1ApplicationPolicy(17),
    
    /**
     * (18)
     */
    TemplatePropAsymmetricAlgorithm(18),
    
    /**
     * (19)
     */
    TemplatePropKeySecurityDescriptor(19),
    
    /**
     * (20)
     */
    TemplatePropSymmetricAlgorithm(20),
    
    /**
     * (21)
     */
    TemplatePropSymmetricKeyLength(21),
    
    /**
     * (22)
     */
    TemplatePropHashAlgorithm(22),
    
    /**
     * (23)
     */
    TemplatePropKeyUsage(23),
    
    /**
     * (24)
     */
    TemplatePropEnrollmentFlags(24),
    
    /**
     * (25)
     */
    TemplatePropSubjectNameFlags(25),
    
    /**
     * (26)
     */
    TemplatePropPrivateKeyFlags(26),
    
    /**
     * (27)
     */
    TemplatePropGeneralFlags(27),
    
    /**
     * (28)
     */
    TemplatePropSecurityDescriptor(28),
    
    /**
     * (29)
     */
    TemplatePropExtensions(29),
    
    /**
     * (30)
     */
    TemplatePropValidityPeriod(30),
    
    /**
     * (31)
     */
    TemplatePropRenewalPeriod(31),
    ;

    private EnrollmentTemplateProperty(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}