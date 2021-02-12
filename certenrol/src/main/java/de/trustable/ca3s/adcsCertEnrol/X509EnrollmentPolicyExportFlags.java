
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509EnrollmentPolicyExportFlags implements IComEnum {
    
    /**
     * (1)
     */
    ExportTemplates(1),
    
    /**
     * (2)
     */
    ExportOIDs(2),
    
    /**
     * (4)
     */
    ExportCAs(4),
    ;

    private X509EnrollmentPolicyExportFlags(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}