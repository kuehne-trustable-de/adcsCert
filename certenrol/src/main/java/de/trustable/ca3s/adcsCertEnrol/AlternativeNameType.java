
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum AlternativeNameType implements IComEnum {
    
    /**
     * (0)
     */
    XCN_CERT_ALT_NAME_UNKNOWN(0),
    
    /**
     * (1)
     */
    XCN_CERT_ALT_NAME_OTHER_NAME(1),
    
    /**
     * (2)
     */
    XCN_CERT_ALT_NAME_RFC822_NAME(2),
    
    /**
     * (3)
     */
    XCN_CERT_ALT_NAME_DNS_NAME(3),
    
    /**
     * (4)
     */
    XCN_CERT_ALT_NAME_X400_ADDRESS(4),
    
    /**
     * (5)
     */
    XCN_CERT_ALT_NAME_DIRECTORY_NAME(5),
    
    /**
     * (6)
     */
    XCN_CERT_ALT_NAME_EDI_PARTY_NAME(6),
    
    /**
     * (7)
     */
    XCN_CERT_ALT_NAME_URL(7),
    
    /**
     * (8)
     */
    XCN_CERT_ALT_NAME_IP_ADDRESS(8),
    
    /**
     * (9)
     */
    XCN_CERT_ALT_NAME_REGISTERED_ID(9),
    
    /**
     * (10)
     */
    XCN_CERT_ALT_NAME_GUID(10),
    
    /**
     * (11)
     */
    XCN_CERT_ALT_NAME_USER_PRINCIPLE_NAME(11),
    ;

    private AlternativeNameType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}