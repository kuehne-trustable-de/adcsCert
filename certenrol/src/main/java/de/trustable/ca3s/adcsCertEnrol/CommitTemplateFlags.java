
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum CommitTemplateFlags implements IComEnum {
    
    /**
     * (1)
     */
    CommitFlagSaveTemplateGenerateOID(1),
    
    /**
     * (2)
     */
    CommitFlagSaveTemplateUseCurrentOID(2),
    
    /**
     * (3)
     */
    CommitFlagSaveTemplateOverwrite(3),
    
    /**
     * (4)
     */
    CommitFlagDeleteTemplate(4),
    ;

    private CommitTemplateFlags(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}