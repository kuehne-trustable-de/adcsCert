
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum RequestClientInfoClientId implements IComEnum {
    
    /**
     * (0)
     */
    ClientIdNone(0),
    
    /**
     * (1)
     */
    ClientIdXEnroll2003(1),
    
    /**
     * (2)
     */
    ClientIdAutoEnroll2003(2),
    
    /**
     * (3)
     */
    ClientIdWizard2003(3),
    
    /**
     * (4)
     */
    ClientIdCertReq2003(4),
    
    /**
     * (5)
     */
    ClientIdDefaultRequest(5),
    
    /**
     * (6)
     */
    ClientIdAutoEnroll(6),
    
    /**
     * (7)
     */
    ClientIdRequestWizard(7),
    
    /**
     * (8)
     */
    ClientIdEOBO(8),
    
    /**
     * (9)
     */
    ClientIdCertReq(9),
    
    /**
     * (10)
     */
    ClientIdTest(10),
    
    /**
     * (11)
     */
    ClientIdWinRT(11),
    
    /**
     * (1000)
     */
    ClientIdUserStart(1000),
    ;

    private RequestClientInfoClientId(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}