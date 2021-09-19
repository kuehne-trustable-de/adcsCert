
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum EnrollmentSelectionStatus implements IComEnum {
    
    /**
     * (0)
     */
    SelectedNo(0),
    
    /**
     * (1)
     */
    SelectedYes(1),
    ;

    private EnrollmentSelectionStatus(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}