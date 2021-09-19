
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum DelayRetryAction implements IComEnum {
    
    /**
     * (0)
     */
    DelayRetryUnknown(0),
    
    /**
     * (1)
     */
    DelayRetryNone(1),
    
    /**
     * (2)
     */
    DelayRetryShort(2),
    
    /**
     * (3)
     */
    DelayRetryLong(3),
    
    /**
     * (4)
     */
    DelayRetrySuccess(4),
    
    /**
     * (5)
     */
    DelayRetryPastSuccess(5),
    ;

    private DelayRetryAction(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}