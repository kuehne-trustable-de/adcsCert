
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X500NameFlags implements IComEnum {
    
    /**
     * (0)
     */
    XCN_CERT_NAME_STR_NONE(0),
    
    /**
     * (1)
     */
    XCN_CERT_SIMPLE_NAME_STR(1),
    
    /**
     * (2)
     */
    XCN_CERT_OID_NAME_STR(2),
    
    /**
     * (3)
     */
    XCN_CERT_X500_NAME_STR(3),
    
    /**
     * (4)
     */
    XCN_CERT_XML_NAME_STR(4),
    
    /**
     * (1073741824)
     */
    XCN_CERT_NAME_STR_SEMICOLON_FLAG(1073741824),
    
    /**
     * (536870912)
     */
    XCN_CERT_NAME_STR_NO_PLUS_FLAG(536870912),
    
    /**
     * (268435456)
     */
    XCN_CERT_NAME_STR_NO_QUOTING_FLAG(268435456),
    
    /**
     * (134217728)
     */
    XCN_CERT_NAME_STR_CRLF_FLAG(134217728),
    
    /**
     * (67108864)
     */
    XCN_CERT_NAME_STR_COMMA_FLAG(67108864),
    
    /**
     * (33554432)
     */
    XCN_CERT_NAME_STR_REVERSE_FLAG(33554432),
    
    /**
     * (16777216)
     */
    XCN_CERT_NAME_STR_FORWARD_FLAG(16777216),
    
    /**
     * (1275068416)
     */
    XCN_CERT_NAME_STR_AMBIGUOUS_SEPARATOR_FLAGS(1275068416),
    
    /**
     * (65536)
     */
    XCN_CERT_NAME_STR_DISABLE_IE4_UTF8_FLAG(65536),
    
    /**
     * (131072)
     */
    XCN_CERT_NAME_STR_ENABLE_T61_UNICODE_FLAG(131072),
    
    /**
     * (262144)
     */
    XCN_CERT_NAME_STR_ENABLE_UTF8_UNICODE_FLAG(262144),
    
    /**
     * (524288)
     */
    XCN_CERT_NAME_STR_FORCE_UTF8_DIR_STR_FLAG(524288),
    
    /**
     * (1048576)
     */
    XCN_CERT_NAME_STR_DISABLE_UTF8_DIR_STR_FLAG(1048576),
    
    /**
     * (2097152)
     */
    XCN_CERT_NAME_STR_ENABLE_PUNYCODE_FLAG(2097152),
    
    /**
     * (8388608)
     */
    XCN_CERT_NAME_STR_DS_ESCAPED(8388608),
    ;

    private X500NameFlags(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}