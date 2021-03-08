
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum X509KeyParametersExportType implements IComEnum {
    
    /**
     * (0)
     */
    XCN_CRYPT_OID_USE_CURVE_NONE(0),
    
    /**
     * (536870912)
     */
    XCN_CRYPT_OID_USE_CURVE_NAME_FOR_ENCODE_FLAG(536870912),
    
    /**
     * (268435456)
     */
    XCN_CRYPT_OID_USE_CURVE_PARAMETERS_FOR_ENCODE_FLAG(268435456),
    ;

    private X509KeyParametersExportType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}