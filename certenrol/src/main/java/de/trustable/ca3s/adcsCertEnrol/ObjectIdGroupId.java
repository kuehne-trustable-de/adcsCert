
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum ObjectIdGroupId implements IComEnum {
    
    /**
     * (0)
     */
    XCN_CRYPT_ANY_GROUP_ID(0),
    
    /**
     * (1)
     */
    XCN_CRYPT_HASH_ALG_OID_GROUP_ID(1),
    
    /**
     * (2)
     */
    XCN_CRYPT_ENCRYPT_ALG_OID_GROUP_ID(2),
    
    /**
     * (3)
     */
    XCN_CRYPT_PUBKEY_ALG_OID_GROUP_ID(3),
    
    /**
     * (4)
     */
    XCN_CRYPT_SIGN_ALG_OID_GROUP_ID(4),
    
    /**
     * (5)
     */
    XCN_CRYPT_RDN_ATTR_OID_GROUP_ID(5),
    
    /**
     * (6)
     */
    XCN_CRYPT_EXT_OR_ATTR_OID_GROUP_ID(6),
    
    /**
     * (7)
     */
    XCN_CRYPT_ENHKEY_USAGE_OID_GROUP_ID(7),
    
    /**
     * (8)
     */
    XCN_CRYPT_POLICY_OID_GROUP_ID(8),
    
    /**
     * (9)
     */
    XCN_CRYPT_TEMPLATE_OID_GROUP_ID(9),
    
    /**
     * (10)
     */
    XCN_CRYPT_KDF_OID_GROUP_ID(10),
    
    /**
     * (10)
     */
    XCN_CRYPT_LAST_OID_GROUP_ID(10),
    
    /**
     * (1)
     */
    XCN_CRYPT_FIRST_ALG_OID_GROUP_ID(1),
    
    /**
     * (4)
     */
    XCN_CRYPT_LAST_ALG_OID_GROUP_ID(4),
    
    /**
     * (65535)
     */
    XCN_CRYPT_GROUP_ID_MASK(65535),
    
    /**
     * (1073741824)
     */
    XCN_CRYPT_OID_PREFER_CNG_ALGID_FLAG(1073741824),
    
    /**
     * (-2147483648)
     */
    XCN_CRYPT_OID_DISABLE_SEARCH_DS_FLAG(-2147483648),
    
    /**
     * (268369920)
     */
    XCN_CRYPT_OID_INFO_OID_GROUP_BIT_LEN_MASK(268369920),
    
    /**
     * (16)
     */
    XCN_CRYPT_OID_INFO_OID_GROUP_BIT_LEN_SHIFT(16),
    
    /**
     * (268369920)
     */
    XCN_CRYPT_KEY_LENGTH_MASK(268369920),
    ;

    private ObjectIdGroupId(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}