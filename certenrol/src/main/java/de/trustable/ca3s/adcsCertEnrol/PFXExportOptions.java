
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum PFXExportOptions implements IComEnum {
    
    /**
     * (0)
     */
    PFXExportEEOnly(0),
    
    /**
     * (1)
     */
    PFXExportChainNoRoot(1),
    
    /**
     * (2)
     */
    PFXExportChainWithRoot(2),
    ;

    private PFXExportOptions(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}