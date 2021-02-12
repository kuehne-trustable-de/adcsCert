
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum EncodingType implements IComEnum {
    
    /**
     * (0)
     */
    XCN_CRYPT_STRING_BASE64HEADER(0),
    
    /**
     * (1)
     */
    XCN_CRYPT_STRING_BASE64(1),
    
    /**
     * (2)
     */
    XCN_CRYPT_STRING_BINARY(2),
    
    /**
     * (3)
     */
    XCN_CRYPT_STRING_BASE64REQUESTHEADER(3),
    
    /**
     * (4)
     */
    XCN_CRYPT_STRING_HEX(4),
    
    /**
     * (5)
     */
    XCN_CRYPT_STRING_HEXASCII(5),
    
    /**
     * (6)
     */
    XCN_CRYPT_STRING_BASE64_ANY(6),
    
    /**
     * (7)
     */
    XCN_CRYPT_STRING_ANY(7),
    
    /**
     * (8)
     */
    XCN_CRYPT_STRING_HEX_ANY(8),
    
    /**
     * (9)
     */
    XCN_CRYPT_STRING_BASE64X509CRLHEADER(9),
    
    /**
     * (10)
     */
    XCN_CRYPT_STRING_HEXADDR(10),
    
    /**
     * (11)
     */
    XCN_CRYPT_STRING_HEXASCIIADDR(11),
    
    /**
     * (12)
     */
    XCN_CRYPT_STRING_HEXRAW(12),
    
    /**
     * (13)
     */
    XCN_CRYPT_STRING_BASE64URI(13),
    
    /**
     * (255)
     */
    XCN_CRYPT_STRING_ENCODEMASK(255),
    
    /**
     * (256)
     */
    XCN_CRYPT_STRING_CHAIN(256),
    
    /**
     * (512)
     */
    XCN_CRYPT_STRING_TEXT(512),
    
    /**
     * (134217728)
     */
    XCN_CRYPT_STRING_PERCENTESCAPE(134217728),
    
    /**
     * (268435456)
     */
    XCN_CRYPT_STRING_HASHDATA(268435456),
    
    /**
     * (536870912)
     */
    XCN_CRYPT_STRING_STRICT(536870912),
    
    /**
     * (1073741824)
     */
    XCN_CRYPT_STRING_NOCRLF(1073741824),
    
    /**
     * (-2147483648)
     */
    XCN_CRYPT_STRING_NOCR(-2147483648),
    ;

    private EncodingType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}