
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum CERTENROLL_PROPERTYID implements IComEnum {
    
    /**
     * (0)
     */
    XCN_PROPERTYID_NONE(0),
    
    /**
     * (1)
     */
    XCN_CERT_KEY_PROV_HANDLE_PROP_ID(1),
    
    /**
     * (2)
     */
    XCN_CERT_KEY_PROV_INFO_PROP_ID(2),
    
    /**
     * (3)
     */
    XCN_CERT_SHA1_HASH_PROP_ID(3),
    
    /**
     * (4)
     */
    XCN_CERT_MD5_HASH_PROP_ID(4),
    
    /**
     * (3)
     */
    XCN_CERT_HASH_PROP_ID(3),
    
    /**
     * (5)
     */
    XCN_CERT_KEY_CONTEXT_PROP_ID(5),
    
    /**
     * (6)
     */
    XCN_CERT_KEY_SPEC_PROP_ID(6),
    
    /**
     * (7)
     */
    XCN_CERT_IE30_RESERVED_PROP_ID(7),
    
    /**
     * (8)
     */
    XCN_CERT_PUBKEY_HASH_RESERVED_PROP_ID(8),
    
    /**
     * (9)
     */
    XCN_CERT_ENHKEY_USAGE_PROP_ID(9),
    
    /**
     * (9)
     */
    XCN_CERT_CTL_USAGE_PROP_ID(9),
    
    /**
     * (10)
     */
    XCN_CERT_NEXT_UPDATE_LOCATION_PROP_ID(10),
    
    /**
     * (11)
     */
    XCN_CERT_FRIENDLY_NAME_PROP_ID(11),
    
    /**
     * (12)
     */
    XCN_CERT_PVK_FILE_PROP_ID(12),
    
    /**
     * (13)
     */
    XCN_CERT_DESCRIPTION_PROP_ID(13),
    
    /**
     * (14)
     */
    XCN_CERT_ACCESS_STATE_PROP_ID(14),
    
    /**
     * (15)
     */
    XCN_CERT_SIGNATURE_HASH_PROP_ID(15),
    
    /**
     * (16)
     */
    XCN_CERT_SMART_CARD_DATA_PROP_ID(16),
    
    /**
     * (17)
     */
    XCN_CERT_EFS_PROP_ID(17),
    
    /**
     * (18)
     */
    XCN_CERT_FORTEZZA_DATA_PROP_ID(18),
    
    /**
     * (19)
     */
    XCN_CERT_ARCHIVED_PROP_ID(19),
    
    /**
     * (20)
     */
    XCN_CERT_KEY_IDENTIFIER_PROP_ID(20),
    
    /**
     * (21)
     */
    XCN_CERT_AUTO_ENROLL_PROP_ID(21),
    
    /**
     * (22)
     */
    XCN_CERT_PUBKEY_ALG_PARA_PROP_ID(22),
    
    /**
     * (23)
     */
    XCN_CERT_CROSS_CERT_DIST_POINTS_PROP_ID(23),
    
    /**
     * (24)
     */
    XCN_CERT_ISSUER_PUBLIC_KEY_MD5_HASH_PROP_ID(24),
    
    /**
     * (25)
     */
    XCN_CERT_SUBJECT_PUBLIC_KEY_MD5_HASH_PROP_ID(25),
    
    /**
     * (26)
     */
    XCN_CERT_ENROLLMENT_PROP_ID(26),
    
    /**
     * (27)
     */
    XCN_CERT_DATE_STAMP_PROP_ID(27),
    
    /**
     * (28)
     */
    XCN_CERT_ISSUER_SERIAL_NUMBER_MD5_HASH_PROP_ID(28),
    
    /**
     * (29)
     */
    XCN_CERT_SUBJECT_NAME_MD5_HASH_PROP_ID(29),
    
    /**
     * (30)
     */
    XCN_CERT_EXTENDED_ERROR_INFO_PROP_ID(30),
    
    /**
     * (64)
     */
    XCN_CERT_RENEWAL_PROP_ID(64),
    
    /**
     * (65)
     */
    XCN_CERT_ARCHIVED_KEY_HASH_PROP_ID(65),
    
    /**
     * (66)
     */
    XCN_CERT_AUTO_ENROLL_RETRY_PROP_ID(66),
    
    /**
     * (67)
     */
    XCN_CERT_AIA_URL_RETRIEVED_PROP_ID(67),
    
    /**
     * (68)
     */
    XCN_CERT_AUTHORITY_INFO_ACCESS_PROP_ID(68),
    
    /**
     * (69)
     */
    XCN_CERT_BACKED_UP_PROP_ID(69),
    
    /**
     * (70)
     */
    XCN_CERT_OCSP_RESPONSE_PROP_ID(70),
    
    /**
     * (71)
     */
    XCN_CERT_REQUEST_ORIGINATOR_PROP_ID(71),
    
    /**
     * (72)
     */
    XCN_CERT_SOURCE_LOCATION_PROP_ID(72),
    
    /**
     * (73)
     */
    XCN_CERT_SOURCE_URL_PROP_ID(73),
    
    /**
     * (74)
     */
    XCN_CERT_NEW_KEY_PROP_ID(74),
    
    /**
     * (75)
     */
    XCN_CERT_OCSP_CACHE_PREFIX_PROP_ID(75),
    
    /**
     * (76)
     */
    XCN_CERT_SMART_CARD_ROOT_INFO_PROP_ID(76),
    
    /**
     * (77)
     */
    XCN_CERT_NO_AUTO_EXPIRE_CHECK_PROP_ID(77),
    
    /**
     * (78)
     */
    XCN_CERT_NCRYPT_KEY_HANDLE_PROP_ID(78),
    
    /**
     * (79)
     */
    XCN_CERT_HCRYPTPROV_OR_NCRYPT_KEY_HANDLE_PROP_ID(79),
    
    /**
     * (80)
     */
    XCN_CERT_SUBJECT_INFO_ACCESS_PROP_ID(80),
    
    /**
     * (81)
     */
    XCN_CERT_CA_OCSP_AUTHORITY_INFO_ACCESS_PROP_ID(81),
    
    /**
     * (82)
     */
    XCN_CERT_CA_DISABLE_CRL_PROP_ID(82),
    
    /**
     * (83)
     */
    XCN_CERT_ROOT_PROGRAM_CERT_POLICIES_PROP_ID(83),
    
    /**
     * (84)
     */
    XCN_CERT_ROOT_PROGRAM_NAME_CONSTRAINTS_PROP_ID(84),
    
    /**
     * (85)
     */
    XCN_CERT_SUBJECT_OCSP_AUTHORITY_INFO_ACCESS_PROP_ID(85),
    
    /**
     * (86)
     */
    XCN_CERT_SUBJECT_DISABLE_CRL_PROP_ID(86),
    
    /**
     * (87)
     */
    XCN_CERT_CEP_PROP_ID(87),
    
    /**
     * (89)
     */
    XCN_CERT_SIGN_HASH_CNG_ALG_PROP_ID(89),
    
    /**
     * (90)
     */
    XCN_CERT_SCARD_PIN_ID_PROP_ID(90),
    
    /**
     * (91)
     */
    XCN_CERT_SCARD_PIN_INFO_PROP_ID(91),
    
    /**
     * (92)
     */
    XCN_CERT_SUBJECT_PUB_KEY_BIT_LENGTH_PROP_ID(92),
    
    /**
     * (93)
     */
    XCN_CERT_PUB_KEY_CNG_ALG_BIT_LENGTH_PROP_ID(93),
    
    /**
     * (94)
     */
    XCN_CERT_ISSUER_PUB_KEY_BIT_LENGTH_PROP_ID(94),
    
    /**
     * (95)
     */
    XCN_CERT_ISSUER_CHAIN_SIGN_HASH_CNG_ALG_PROP_ID(95),
    
    /**
     * (96)
     */
    XCN_CERT_ISSUER_CHAIN_PUB_KEY_CNG_ALG_BIT_LENGTH_PROP_ID(96),
    
    /**
     * (97)
     */
    XCN_CERT_NO_EXPIRE_NOTIFICATION_PROP_ID(97),
    
    /**
     * (98)
     */
    XCN_CERT_AUTH_ROOT_SHA256_HASH_PROP_ID(98),
    
    /**
     * (99)
     */
    XCN_CERT_NCRYPT_KEY_HANDLE_TRANSFER_PROP_ID(99),
    
    /**
     * (100)
     */
    XCN_CERT_HCRYPTPROV_TRANSFER_PROP_ID(100),
    
    /**
     * (101)
     */
    XCN_CERT_SMART_CARD_READER_PROP_ID(101),
    
    /**
     * (102)
     */
    XCN_CERT_SEND_AS_TRUSTED_ISSUER_PROP_ID(102),
    
    /**
     * (103)
     */
    XCN_CERT_KEY_REPAIR_ATTEMPTED_PROP_ID(103),
    
    /**
     * (104)
     */
    XCN_CERT_DISALLOWED_FILETIME_PROP_ID(104),
    
    /**
     * (105)
     */
    XCN_CERT_ROOT_PROGRAM_CHAIN_POLICIES_PROP_ID(105),
    
    /**
     * (106)
     */
    XCN_CERT_SMART_CARD_READER_NON_REMOVABLE_PROP_ID(106),
    
    /**
     * (107)
     */
    XCN_CERT_SHA256_HASH_PROP_ID(107),
    
    /**
     * (108)
     */
    XCN_CERT_SCEP_SERVER_CERTS_PROP_ID(108),
    
    /**
     * (109)
     */
    XCN_CERT_SCEP_RA_SIGNATURE_CERT_PROP_ID(109),
    
    /**
     * (110)
     */
    XCN_CERT_SCEP_RA_ENCRYPTION_CERT_PROP_ID(110),
    
    /**
     * (111)
     */
    XCN_CERT_SCEP_CA_CERT_PROP_ID(111),
    
    /**
     * (112)
     */
    XCN_CERT_SCEP_SIGNER_CERT_PROP_ID(112),
    
    /**
     * (113)
     */
    XCN_CERT_SCEP_NONCE_PROP_ID(113),
    
    /**
     * (114)
     */
    XCN_CERT_SCEP_ENCRYPT_HASH_CNG_ALG_PROP_ID(114),
    
    /**
     * (115)
     */
    XCN_CERT_SCEP_FLAGS_PROP_ID(115),
    
    /**
     * (116)
     */
    XCN_CERT_SCEP_GUID_PROP_ID(116),
    
    /**
     * (117)
     */
    XCN_CERT_SERIALIZABLE_KEY_CONTEXT_PROP_ID(117),
    
    /**
     * (118)
     */
    XCN_CERT_ISOLATED_KEY_PROP_ID(118),
    
    /**
     * (119)
     */
    XCN_CERT_SERIAL_CHAIN_PROP_ID(119),
    
    /**
     * (120)
     */
    XCN_CERT_KEY_CLASSIFICATION_PROP_ID(120),
    
    /**
     * (122)
     */
    XCN_CERT_DISALLOWED_ENHKEY_USAGE_PROP_ID(122),
    
    /**
     * (123)
     */
    XCN_CERT_NONCOMPLIANT_ROOT_URL_PROP_ID(123),
    
    /**
     * (124)
     */
    XCN_CERT_PIN_SHA256_HASH_PROP_ID(124),
    
    /**
     * (125)
     */
    XCN_CERT_CLR_DELETE_KEY_PROP_ID(125),
    
    /**
     * (126)
     */
    XCN_CERT_NOT_BEFORE_FILETIME_PROP_ID(126),
    
    /**
     * (127)
     */
    XCN_CERT_CERT_NOT_BEFORE_ENHKEY_USAGE_PROP_ID(127),
    
    /**
     * (128)
     */
    XCN_CERT_FIRST_RESERVED_PROP_ID(128),
    
    /**
     * (32767)
     */
    XCN_CERT_LAST_RESERVED_PROP_ID(32767),
    
    /**
     * (32768)
     */
    XCN_CERT_FIRST_USER_PROP_ID(32768),
    
    /**
     * (65535)
     */
    XCN_CERT_LAST_USER_PROP_ID(65535),
    
    /**
     * (4096)
     */
    XCN_CERT_STORE_LOCALIZED_NAME_PROP_ID(4096),
    ;

    private CERTENROLL_PROPERTYID(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}