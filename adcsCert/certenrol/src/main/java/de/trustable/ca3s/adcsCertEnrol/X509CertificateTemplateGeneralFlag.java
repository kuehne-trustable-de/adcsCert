
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509CertificateTemplateGeneralFlag implements IComEnum {
    
    /**
     * (64)
     */
    GeneralMachineType(64),
    
    /**
     * (128)
     */
    GeneralCA(128),
    
    /**
     * (2048)
     */
    GeneralCrossCA(2048),
    
    /**
     * (65536)
     */
    GeneralDefault(65536),
    
    /**
     * (131072)
     */
    GeneralModified(131072),
    
    /**
     * (4096)
     */
    GeneralDonotPersist(4096),
    ;

    private X509CertificateTemplateGeneralFlag(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}