
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509ProviderType implements IComEnum {
    
    /**
     * (0)
     */
    XCN_PROV_NONE(0),
    
    /**
     * (1)
     */
    XCN_PROV_RSA_FULL(1),
    
    /**
     * (2)
     */
    XCN_PROV_RSA_SIG(2),
    
    /**
     * (3)
     */
    XCN_PROV_DSS(3),
    
    /**
     * (4)
     */
    XCN_PROV_FORTEZZA(4),
    
    /**
     * (5)
     */
    XCN_PROV_MS_EXCHANGE(5),
    
    /**
     * (6)
     */
    XCN_PROV_SSL(6),
    
    /**
     * (12)
     */
    XCN_PROV_RSA_SCHANNEL(12),
    
    /**
     * (13)
     */
    XCN_PROV_DSS_DH(13),
    
    /**
     * (14)
     */
    XCN_PROV_EC_ECDSA_SIG(14),
    
    /**
     * (15)
     */
    XCN_PROV_EC_ECNRA_SIG(15),
    
    /**
     * (16)
     */
    XCN_PROV_EC_ECDSA_FULL(16),
    
    /**
     * (17)
     */
    XCN_PROV_EC_ECNRA_FULL(17),
    
    /**
     * (18)
     */
    XCN_PROV_DH_SCHANNEL(18),
    
    /**
     * (20)
     */
    XCN_PROV_SPYRUS_LYNKS(20),
    
    /**
     * (21)
     */
    XCN_PROV_RNG(21),
    
    /**
     * (22)
     */
    XCN_PROV_INTEL_SEC(22),
    
    /**
     * (23)
     */
    XCN_PROV_REPLACE_OWF(23),
    
    /**
     * (24)
     */
    XCN_PROV_RSA_AES(24),
    ;

    private X509ProviderType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}