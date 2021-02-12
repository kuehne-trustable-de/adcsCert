
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum CERTENROLL_OBJECTID implements IComEnum {
    
    /**
     * (0)
     */
    XCN_OID_NONE(0),
    
    /**
     * (1)
     */
    XCN_OID_RSA(1),
    
    /**
     * (2)
     */
    XCN_OID_PKCS(2),
    
    /**
     * (3)
     */
    XCN_OID_RSA_HASH(3),
    
    /**
     * (4)
     */
    XCN_OID_RSA_ENCRYPT(4),
    
    /**
     * (5)
     */
    XCN_OID_PKCS_1(5),
    
    /**
     * (6)
     */
    XCN_OID_PKCS_2(6),
    
    /**
     * (7)
     */
    XCN_OID_PKCS_3(7),
    
    /**
     * (8)
     */
    XCN_OID_PKCS_4(8),
    
    /**
     * (9)
     */
    XCN_OID_PKCS_5(9),
    
    /**
     * (10)
     */
    XCN_OID_PKCS_6(10),
    
    /**
     * (11)
     */
    XCN_OID_PKCS_7(11),
    
    /**
     * (12)
     */
    XCN_OID_PKCS_8(12),
    
    /**
     * (13)
     */
    XCN_OID_PKCS_9(13),
    
    /**
     * (14)
     */
    XCN_OID_PKCS_10(14),
    
    /**
     * (15)
     */
    XCN_OID_PKCS_12(15),
    
    /**
     * (16)
     */
    XCN_OID_RSA_RSA(16),
    
    /**
     * (17)
     */
    XCN_OID_RSA_MD2RSA(17),
    
    /**
     * (18)
     */
    XCN_OID_RSA_MD4RSA(18),
    
    /**
     * (19)
     */
    XCN_OID_RSA_MD5RSA(19),
    
    /**
     * (20)
     */
    XCN_OID_RSA_SHA1RSA(20),
    
    /**
     * (21)
     */
    XCN_OID_RSA_SETOAEP_RSA(21),
    
    /**
     * (22)
     */
    XCN_OID_RSA_DH(22),
    
    /**
     * (23)
     */
    XCN_OID_RSA_data(23),
    
    /**
     * (24)
     */
    XCN_OID_RSA_signedData(24),
    
    /**
     * (25)
     */
    XCN_OID_RSA_envelopedData(25),
    
    /**
     * (26)
     */
    XCN_OID_RSA_signEnvData(26),
    
    /**
     * (27)
     */
    XCN_OID_RSA_digestedData(27),
    
    /**
     * (28)
     */
    XCN_OID_RSA_hashedData(28),
    
    /**
     * (29)
     */
    XCN_OID_RSA_encryptedData(29),
    
    /**
     * (30)
     */
    XCN_OID_RSA_emailAddr(30),
    
    /**
     * (31)
     */
    XCN_OID_RSA_unstructName(31),
    
    /**
     * (32)
     */
    XCN_OID_RSA_contentType(32),
    
    /**
     * (33)
     */
    XCN_OID_RSA_messageDigest(33),
    
    /**
     * (34)
     */
    XCN_OID_RSA_signingTime(34),
    
    /**
     * (35)
     */
    XCN_OID_RSA_counterSign(35),
    
    /**
     * (36)
     */
    XCN_OID_RSA_challengePwd(36),
    
    /**
     * (37)
     */
    XCN_OID_RSA_unstructAddr(37),
    
    /**
     * (38)
     */
    XCN_OID_RSA_extCertAttrs(38),
    
    /**
     * (39)
     */
    XCN_OID_RSA_certExtensions(39),
    
    /**
     * (40)
     */
    XCN_OID_RSA_SMIMECapabilities(40),
    
    /**
     * (41)
     */
    XCN_OID_RSA_preferSignedData(41),
    
    /**
     * (42)
     */
    XCN_OID_RSA_SMIMEalg(42),
    
    /**
     * (43)
     */
    XCN_OID_RSA_SMIMEalgESDH(43),
    
    /**
     * (44)
     */
    XCN_OID_RSA_SMIMEalgCMS3DESwrap(44),
    
    /**
     * (45)
     */
    XCN_OID_RSA_SMIMEalgCMSRC2wrap(45),
    
    /**
     * (46)
     */
    XCN_OID_RSA_MD2(46),
    
    /**
     * (47)
     */
    XCN_OID_RSA_MD4(47),
    
    /**
     * (48)
     */
    XCN_OID_RSA_MD5(48),
    
    /**
     * (49)
     */
    XCN_OID_RSA_RC2CBC(49),
    
    /**
     * (50)
     */
    XCN_OID_RSA_RC4(50),
    
    /**
     * (51)
     */
    XCN_OID_RSA_DES_EDE3_CBC(51),
    
    /**
     * (52)
     */
    XCN_OID_RSA_RC5_CBCPad(52),
    
    /**
     * (53)
     */
    XCN_OID_ANSI_X942(53),
    
    /**
     * (54)
     */
    XCN_OID_ANSI_X942_DH(54),
    
    /**
     * (55)
     */
    XCN_OID_X957(55),
    
    /**
     * (56)
     */
    XCN_OID_X957_DSA(56),
    
    /**
     * (57)
     */
    XCN_OID_X957_SHA1DSA(57),
    
    /**
     * (58)
     */
    XCN_OID_DS(58),
    
    /**
     * (59)
     */
    XCN_OID_DSALG(59),
    
    /**
     * (60)
     */
    XCN_OID_DSALG_CRPT(60),
    
    /**
     * (61)
     */
    XCN_OID_DSALG_HASH(61),
    
    /**
     * (62)
     */
    XCN_OID_DSALG_SIGN(62),
    
    /**
     * (63)
     */
    XCN_OID_DSALG_RSA(63),
    
    /**
     * (64)
     */
    XCN_OID_OIW(64),
    
    /**
     * (65)
     */
    XCN_OID_OIWSEC(65),
    
    /**
     * (66)
     */
    XCN_OID_OIWSEC_md4RSA(66),
    
    /**
     * (67)
     */
    XCN_OID_OIWSEC_md5RSA(67),
    
    /**
     * (68)
     */
    XCN_OID_OIWSEC_md4RSA2(68),
    
    /**
     * (69)
     */
    XCN_OID_OIWSEC_desECB(69),
    
    /**
     * (70)
     */
    XCN_OID_OIWSEC_desCBC(70),
    
    /**
     * (71)
     */
    XCN_OID_OIWSEC_desOFB(71),
    
    /**
     * (72)
     */
    XCN_OID_OIWSEC_desCFB(72),
    
    /**
     * (73)
     */
    XCN_OID_OIWSEC_desMAC(73),
    
    /**
     * (74)
     */
    XCN_OID_OIWSEC_rsaSign(74),
    
    /**
     * (75)
     */
    XCN_OID_OIWSEC_dsa(75),
    
    /**
     * (76)
     */
    XCN_OID_OIWSEC_shaDSA(76),
    
    /**
     * (77)
     */
    XCN_OID_OIWSEC_mdc2RSA(77),
    
    /**
     * (78)
     */
    XCN_OID_OIWSEC_shaRSA(78),
    
    /**
     * (79)
     */
    XCN_OID_OIWSEC_dhCommMod(79),
    
    /**
     * (80)
     */
    XCN_OID_OIWSEC_desEDE(80),
    
    /**
     * (81)
     */
    XCN_OID_OIWSEC_sha(81),
    
    /**
     * (82)
     */
    XCN_OID_OIWSEC_mdc2(82),
    
    /**
     * (83)
     */
    XCN_OID_OIWSEC_dsaComm(83),
    
    /**
     * (84)
     */
    XCN_OID_OIWSEC_dsaCommSHA(84),
    
    /**
     * (85)
     */
    XCN_OID_OIWSEC_rsaXchg(85),
    
    /**
     * (86)
     */
    XCN_OID_OIWSEC_keyHashSeal(86),
    
    /**
     * (87)
     */
    XCN_OID_OIWSEC_md2RSASign(87),
    
    /**
     * (88)
     */
    XCN_OID_OIWSEC_md5RSASign(88),
    
    /**
     * (89)
     */
    XCN_OID_OIWSEC_sha1(89),
    
    /**
     * (90)
     */
    XCN_OID_OIWSEC_dsaSHA1(90),
    
    /**
     * (91)
     */
    XCN_OID_OIWSEC_dsaCommSHA1(91),
    
    /**
     * (92)
     */
    XCN_OID_OIWSEC_sha1RSASign(92),
    
    /**
     * (93)
     */
    XCN_OID_OIWDIR(93),
    
    /**
     * (94)
     */
    XCN_OID_OIWDIR_CRPT(94),
    
    /**
     * (95)
     */
    XCN_OID_OIWDIR_HASH(95),
    
    /**
     * (96)
     */
    XCN_OID_OIWDIR_SIGN(96),
    
    /**
     * (97)
     */
    XCN_OID_OIWDIR_md2(97),
    
    /**
     * (98)
     */
    XCN_OID_OIWDIR_md2RSA(98),
    
    /**
     * (99)
     */
    XCN_OID_INFOSEC(99),
    
    /**
     * (100)
     */
    XCN_OID_INFOSEC_sdnsSignature(100),
    
    /**
     * (101)
     */
    XCN_OID_INFOSEC_mosaicSignature(101),
    
    /**
     * (102)
     */
    XCN_OID_INFOSEC_sdnsConfidentiality(102),
    
    /**
     * (103)
     */
    XCN_OID_INFOSEC_mosaicConfidentiality(103),
    
    /**
     * (104)
     */
    XCN_OID_INFOSEC_sdnsIntegrity(104),
    
    /**
     * (105)
     */
    XCN_OID_INFOSEC_mosaicIntegrity(105),
    
    /**
     * (106)
     */
    XCN_OID_INFOSEC_sdnsTokenProtection(106),
    
    /**
     * (107)
     */
    XCN_OID_INFOSEC_mosaicTokenProtection(107),
    
    /**
     * (108)
     */
    XCN_OID_INFOSEC_sdnsKeyManagement(108),
    
    /**
     * (109)
     */
    XCN_OID_INFOSEC_mosaicKeyManagement(109),
    
    /**
     * (110)
     */
    XCN_OID_INFOSEC_sdnsKMandSig(110),
    
    /**
     * (111)
     */
    XCN_OID_INFOSEC_mosaicKMandSig(111),
    
    /**
     * (112)
     */
    XCN_OID_INFOSEC_SuiteASignature(112),
    
    /**
     * (113)
     */
    XCN_OID_INFOSEC_SuiteAConfidentiality(113),
    
    /**
     * (114)
     */
    XCN_OID_INFOSEC_SuiteAIntegrity(114),
    
    /**
     * (115)
     */
    XCN_OID_INFOSEC_SuiteATokenProtection(115),
    
    /**
     * (116)
     */
    XCN_OID_INFOSEC_SuiteAKeyManagement(116),
    
    /**
     * (117)
     */
    XCN_OID_INFOSEC_SuiteAKMandSig(117),
    
    /**
     * (118)
     */
    XCN_OID_INFOSEC_mosaicUpdatedSig(118),
    
    /**
     * (119)
     */
    XCN_OID_INFOSEC_mosaicKMandUpdSig(119),
    
    /**
     * (120)
     */
    XCN_OID_INFOSEC_mosaicUpdatedInteg(120),
    
    /**
     * (121)
     */
    XCN_OID_COMMON_NAME(121),
    
    /**
     * (122)
     */
    XCN_OID_SUR_NAME(122),
    
    /**
     * (123)
     */
    XCN_OID_DEVICE_SERIAL_NUMBER(123),
    
    /**
     * (124)
     */
    XCN_OID_COUNTRY_NAME(124),
    
    /**
     * (125)
     */
    XCN_OID_LOCALITY_NAME(125),
    
    /**
     * (126)
     */
    XCN_OID_STATE_OR_PROVINCE_NAME(126),
    
    /**
     * (127)
     */
    XCN_OID_STREET_ADDRESS(127),
    
    /**
     * (128)
     */
    XCN_OID_ORGANIZATION_NAME(128),
    
    /**
     * (129)
     */
    XCN_OID_ORGANIZATIONAL_UNIT_NAME(129),
    
    /**
     * (130)
     */
    XCN_OID_TITLE(130),
    
    /**
     * (131)
     */
    XCN_OID_DESCRIPTION(131),
    
    /**
     * (132)
     */
    XCN_OID_SEARCH_GUIDE(132),
    
    /**
     * (133)
     */
    XCN_OID_BUSINESS_CATEGORY(133),
    
    /**
     * (134)
     */
    XCN_OID_POSTAL_ADDRESS(134),
    
    /**
     * (135)
     */
    XCN_OID_POSTAL_CODE(135),
    
    /**
     * (136)
     */
    XCN_OID_POST_OFFICE_BOX(136),
    
    /**
     * (137)
     */
    XCN_OID_PHYSICAL_DELIVERY_OFFICE_NAME(137),
    
    /**
     * (138)
     */
    XCN_OID_TELEPHONE_NUMBER(138),
    
    /**
     * (139)
     */
    XCN_OID_TELEX_NUMBER(139),
    
    /**
     * (140)
     */
    XCN_OID_TELETEXT_TERMINAL_IDENTIFIER(140),
    
    /**
     * (141)
     */
    XCN_OID_FACSIMILE_TELEPHONE_NUMBER(141),
    
    /**
     * (142)
     */
    XCN_OID_X21_ADDRESS(142),
    
    /**
     * (143)
     */
    XCN_OID_INTERNATIONAL_ISDN_NUMBER(143),
    
    /**
     * (144)
     */
    XCN_OID_REGISTERED_ADDRESS(144),
    
    /**
     * (145)
     */
    XCN_OID_DESTINATION_INDICATOR(145),
    
    /**
     * (146)
     */
    XCN_OID_PREFERRED_DELIVERY_METHOD(146),
    
    /**
     * (147)
     */
    XCN_OID_PRESENTATION_ADDRESS(147),
    
    /**
     * (148)
     */
    XCN_OID_SUPPORTED_APPLICATION_CONTEXT(148),
    
    /**
     * (149)
     */
    XCN_OID_MEMBER(149),
    
    /**
     * (150)
     */
    XCN_OID_OWNER(150),
    
    /**
     * (151)
     */
    XCN_OID_ROLE_OCCUPANT(151),
    
    /**
     * (152)
     */
    XCN_OID_SEE_ALSO(152),
    
    /**
     * (153)
     */
    XCN_OID_USER_PASSWORD(153),
    
    /**
     * (154)
     */
    XCN_OID_USER_CERTIFICATE(154),
    
    /**
     * (155)
     */
    XCN_OID_CA_CERTIFICATE(155),
    
    /**
     * (156)
     */
    XCN_OID_AUTHORITY_REVOCATION_LIST(156),
    
    /**
     * (157)
     */
    XCN_OID_CERTIFICATE_REVOCATION_LIST(157),
    
    /**
     * (158)
     */
    XCN_OID_CROSS_CERTIFICATE_PAIR(158),
    
    /**
     * (159)
     */
    XCN_OID_GIVEN_NAME(159),
    
    /**
     * (160)
     */
    XCN_OID_INITIALS(160),
    
    /**
     * (161)
     */
    XCN_OID_DN_QUALIFIER(161),
    
    /**
     * (162)
     */
    XCN_OID_DOMAIN_COMPONENT(162),
    
    /**
     * (163)
     */
    XCN_OID_PKCS_12_FRIENDLY_NAME_ATTR(163),
    
    /**
     * (164)
     */
    XCN_OID_PKCS_12_LOCAL_KEY_ID(164),
    
    /**
     * (165)
     */
    XCN_OID_PKCS_12_KEY_PROVIDER_NAME_ATTR(165),
    
    /**
     * (166)
     */
    XCN_OID_LOCAL_MACHINE_KEYSET(166),
    
    /**
     * (167)
     */
    XCN_OID_PKCS_12_EXTENDED_ATTRIBUTES(167),
    
    /**
     * (168)
     */
    XCN_OID_KEYID_RDN(168),
    
    /**
     * (169)
     */
    XCN_OID_AUTHORITY_KEY_IDENTIFIER(169),
    
    /**
     * (170)
     */
    XCN_OID_KEY_ATTRIBUTES(170),
    
    /**
     * (171)
     */
    XCN_OID_CERT_POLICIES_95(171),
    
    /**
     * (172)
     */
    XCN_OID_KEY_USAGE_RESTRICTION(172),
    
    /**
     * (173)
     */
    XCN_OID_SUBJECT_ALT_NAME(173),
    
    /**
     * (174)
     */
    XCN_OID_ISSUER_ALT_NAME(174),
    
    /**
     * (175)
     */
    XCN_OID_BASIC_CONSTRAINTS(175),
    
    /**
     * (176)
     */
    XCN_OID_KEY_USAGE(176),
    
    /**
     * (177)
     */
    XCN_OID_PRIVATEKEY_USAGE_PERIOD(177),
    
    /**
     * (178)
     */
    XCN_OID_BASIC_CONSTRAINTS2(178),
    
    /**
     * (179)
     */
    XCN_OID_CERT_POLICIES(179),
    
    /**
     * (180)
     */
    XCN_OID_ANY_CERT_POLICY(180),
    
    /**
     * (181)
     */
    XCN_OID_AUTHORITY_KEY_IDENTIFIER2(181),
    
    /**
     * (182)
     */
    XCN_OID_SUBJECT_KEY_IDENTIFIER(182),
    
    /**
     * (183)
     */
    XCN_OID_SUBJECT_ALT_NAME2(183),
    
    /**
     * (184)
     */
    XCN_OID_ISSUER_ALT_NAME2(184),
    
    /**
     * (185)
     */
    XCN_OID_CRL_REASON_CODE(185),
    
    /**
     * (186)
     */
    XCN_OID_REASON_CODE_HOLD(186),
    
    /**
     * (187)
     */
    XCN_OID_CRL_DIST_POINTS(187),
    
    /**
     * (188)
     */
    XCN_OID_ENHANCED_KEY_USAGE(188),
    
    /**
     * (189)
     */
    XCN_OID_CRL_NUMBER(189),
    
    /**
     * (190)
     */
    XCN_OID_DELTA_CRL_INDICATOR(190),
    
    /**
     * (191)
     */
    XCN_OID_ISSUING_DIST_POINT(191),
    
    /**
     * (192)
     */
    XCN_OID_FRESHEST_CRL(192),
    
    /**
     * (193)
     */
    XCN_OID_NAME_CONSTRAINTS(193),
    
    /**
     * (194)
     */
    XCN_OID_POLICY_MAPPINGS(194),
    
    /**
     * (195)
     */
    XCN_OID_LEGACY_POLICY_MAPPINGS(195),
    
    /**
     * (196)
     */
    XCN_OID_POLICY_CONSTRAINTS(196),
    
    /**
     * (197)
     */
    XCN_OID_RENEWAL_CERTIFICATE(197),
    
    /**
     * (198)
     */
    XCN_OID_ENROLLMENT_NAME_VALUE_PAIR(198),
    
    /**
     * (199)
     */
    XCN_OID_ENROLLMENT_CSP_PROVIDER(199),
    
    /**
     * (200)
     */
    XCN_OID_OS_VERSION(200),
    
    /**
     * (201)
     */
    XCN_OID_ENROLLMENT_AGENT(201),
    
    /**
     * (202)
     */
    XCN_OID_PKIX(202),
    
    /**
     * (203)
     */
    XCN_OID_PKIX_PE(203),
    
    /**
     * (204)
     */
    XCN_OID_AUTHORITY_INFO_ACCESS(204),
    
    /**
     * (205)
     */
    XCN_OID_BIOMETRIC_EXT(205),
    
    /**
     * (206)
     */
    XCN_OID_LOGOTYPE_EXT(206),
    
    /**
     * (207)
     */
    XCN_OID_CERT_EXTENSIONS(207),
    
    /**
     * (208)
     */
    XCN_OID_NEXT_UPDATE_LOCATION(208),
    
    /**
     * (209)
     */
    XCN_OID_REMOVE_CERTIFICATE(209),
    
    /**
     * (210)
     */
    XCN_OID_CROSS_CERT_DIST_POINTS(210),
    
    /**
     * (211)
     */
    XCN_OID_CTL(211),
    
    /**
     * (212)
     */
    XCN_OID_SORTED_CTL(212),
    
    /**
     * (213)
     */
    XCN_OID_SERIALIZED(213),
    
    /**
     * (214)
     */
    XCN_OID_NT_PRINCIPAL_NAME(214),
    
    /**
     * (215)
     */
    XCN_OID_PRODUCT_UPDATE(215),
    
    /**
     * (216)
     */
    XCN_OID_ANY_APPLICATION_POLICY(216),
    
    /**
     * (217)
     */
    XCN_OID_AUTO_ENROLL_CTL_USAGE(217),
    
    /**
     * (218)
     */
    XCN_OID_ENROLL_CERTTYPE_EXTENSION(218),
    
    /**
     * (219)
     */
    XCN_OID_CERT_MANIFOLD(219),
    
    /**
     * (220)
     */
    XCN_OID_CERTSRV_CA_VERSION(220),
    
    /**
     * (221)
     */
    XCN_OID_CERTSRV_PREVIOUS_CERT_HASH(221),
    
    /**
     * (222)
     */
    XCN_OID_CRL_VIRTUAL_BASE(222),
    
    /**
     * (223)
     */
    XCN_OID_CRL_NEXT_PUBLISH(223),
    
    /**
     * (224)
     */
    XCN_OID_KP_CA_EXCHANGE(224),
    
    /**
     * (225)
     */
    XCN_OID_KP_KEY_RECOVERY_AGENT(225),
    
    /**
     * (226)
     */
    XCN_OID_CERTIFICATE_TEMPLATE(226),
    
    /**
     * (227)
     */
    XCN_OID_ENTERPRISE_OID_ROOT(227),
    
    /**
     * (228)
     */
    XCN_OID_RDN_DUMMY_SIGNER(228),
    
    /**
     * (229)
     */
    XCN_OID_APPLICATION_CERT_POLICIES(229),
    
    /**
     * (230)
     */
    XCN_OID_APPLICATION_POLICY_MAPPINGS(230),
    
    /**
     * (231)
     */
    XCN_OID_APPLICATION_POLICY_CONSTRAINTS(231),
    
    /**
     * (232)
     */
    XCN_OID_ARCHIVED_KEY_ATTR(232),
    
    /**
     * (233)
     */
    XCN_OID_CRL_SELF_CDP(233),
    
    /**
     * (234)
     */
    XCN_OID_REQUIRE_CERT_CHAIN_POLICY(234),
    
    /**
     * (235)
     */
    XCN_OID_ARCHIVED_KEY_CERT_HASH(235),
    
    /**
     * (236)
     */
    XCN_OID_ISSUED_CERT_HASH(236),
    
    /**
     * (237)
     */
    XCN_OID_DS_EMAIL_REPLICATION(237),
    
    /**
     * (238)
     */
    XCN_OID_REQUEST_CLIENT_INFO(238),
    
    /**
     * (239)
     */
    XCN_OID_ENCRYPTED_KEY_HASH(239),
    
    /**
     * (240)
     */
    XCN_OID_CERTSRV_CROSSCA_VERSION(240),
    
    /**
     * (241)
     */
    XCN_OID_NTDS_REPLICATION(241),
    
    /**
     * (242)
     */
    XCN_OID_SUBJECT_DIR_ATTRS(242),
    
    /**
     * (243)
     */
    XCN_OID_PKIX_KP(243),
    
    /**
     * (244)
     */
    XCN_OID_PKIX_KP_SERVER_AUTH(244),
    
    /**
     * (245)
     */
    XCN_OID_PKIX_KP_CLIENT_AUTH(245),
    
    /**
     * (246)
     */
    XCN_OID_PKIX_KP_CODE_SIGNING(246),
    
    /**
     * (247)
     */
    XCN_OID_PKIX_KP_EMAIL_PROTECTION(247),
    
    /**
     * (248)
     */
    XCN_OID_PKIX_KP_IPSEC_END_SYSTEM(248),
    
    /**
     * (249)
     */
    XCN_OID_PKIX_KP_IPSEC_TUNNEL(249),
    
    /**
     * (250)
     */
    XCN_OID_PKIX_KP_IPSEC_USER(250),
    
    /**
     * (251)
     */
    XCN_OID_PKIX_KP_TIMESTAMP_SIGNING(251),
    
    /**
     * (252)
     */
    XCN_OID_PKIX_KP_OCSP_SIGNING(252),
    
    /**
     * (253)
     */
    XCN_OID_PKIX_OCSP_NOCHECK(253),
    
    /**
     * (254)
     */
    XCN_OID_IPSEC_KP_IKE_INTERMEDIATE(254),
    
    /**
     * (255)
     */
    XCN_OID_KP_CTL_USAGE_SIGNING(255),
    
    /**
     * (256)
     */
    XCN_OID_KP_TIME_STAMP_SIGNING(256),
    
    /**
     * (257)
     */
    XCN_OID_SERVER_GATED_CRYPTO(257),
    
    /**
     * (258)
     */
    XCN_OID_SGC_NETSCAPE(258),
    
    /**
     * (259)
     */
    XCN_OID_KP_EFS(259),
    
    /**
     * (260)
     */
    XCN_OID_EFS_RECOVERY(260),
    
    /**
     * (261)
     */
    XCN_OID_WHQL_CRYPTO(261),
    
    /**
     * (262)
     */
    XCN_OID_NT5_CRYPTO(262),
    
    /**
     * (263)
     */
    XCN_OID_OEM_WHQL_CRYPTO(263),
    
    /**
     * (264)
     */
    XCN_OID_EMBEDDED_NT_CRYPTO(264),
    
    /**
     * (265)
     */
    XCN_OID_ROOT_LIST_SIGNER(265),
    
    /**
     * (266)
     */
    XCN_OID_KP_QUALIFIED_SUBORDINATION(266),
    
    /**
     * (267)
     */
    XCN_OID_KP_KEY_RECOVERY(267),
    
    /**
     * (268)
     */
    XCN_OID_KP_DOCUMENT_SIGNING(268),
    
    /**
     * (269)
     */
    XCN_OID_KP_LIFETIME_SIGNING(269),
    
    /**
     * (270)
     */
    XCN_OID_KP_MOBILE_DEVICE_SOFTWARE(270),
    
    /**
     * (271)
     */
    XCN_OID_KP_SMART_DISPLAY(271),
    
    /**
     * (272)
     */
    XCN_OID_KP_CSP_SIGNATURE(272),
    
    /**
     * (273)
     */
    XCN_OID_DRM(273),
    
    /**
     * (274)
     */
    XCN_OID_DRM_INDIVIDUALIZATION(274),
    
    /**
     * (275)
     */
    XCN_OID_LICENSES(275),
    
    /**
     * (276)
     */
    XCN_OID_LICENSE_SERVER(276),
    
    /**
     * (277)
     */
    XCN_OID_KP_SMARTCARD_LOGON(277),
    
    /**
     * (278)
     */
    XCN_OID_YESNO_TRUST_ATTR(278),
    
    /**
     * (279)
     */
    XCN_OID_PKIX_POLICY_QUALIFIER_CPS(279),
    
    /**
     * (280)
     */
    XCN_OID_PKIX_POLICY_QUALIFIER_USERNOTICE(280),
    
    /**
     * (281)
     */
    XCN_OID_CERT_POLICIES_95_QUALIFIER1(281),
    
    /**
     * (282)
     */
    XCN_OID_PKIX_ACC_DESCR(282),
    
    /**
     * (283)
     */
    XCN_OID_PKIX_OCSP(283),
    
    /**
     * (284)
     */
    XCN_OID_PKIX_CA_ISSUERS(284),
    
    /**
     * (285)
     */
    XCN_OID_VERISIGN_PRIVATE_6_9(285),
    
    /**
     * (286)
     */
    XCN_OID_VERISIGN_ONSITE_JURISDICTION_HASH(286),
    
    /**
     * (287)
     */
    XCN_OID_VERISIGN_BITSTRING_6_13(287),
    
    /**
     * (288)
     */
    XCN_OID_VERISIGN_ISS_STRONG_CRYPTO(288),
    
    /**
     * (289)
     */
    XCN_OID_NETSCAPE(289),
    
    /**
     * (290)
     */
    XCN_OID_NETSCAPE_CERT_EXTENSION(290),
    
    /**
     * (291)
     */
    XCN_OID_NETSCAPE_CERT_TYPE(291),
    
    /**
     * (292)
     */
    XCN_OID_NETSCAPE_BASE_URL(292),
    
    /**
     * (293)
     */
    XCN_OID_NETSCAPE_REVOCATION_URL(293),
    
    /**
     * (294)
     */
    XCN_OID_NETSCAPE_CA_REVOCATION_URL(294),
    
    /**
     * (295)
     */
    XCN_OID_NETSCAPE_CERT_RENEWAL_URL(295),
    
    /**
     * (296)
     */
    XCN_OID_NETSCAPE_CA_POLICY_URL(296),
    
    /**
     * (297)
     */
    XCN_OID_NETSCAPE_SSL_SERVER_NAME(297),
    
    /**
     * (298)
     */
    XCN_OID_NETSCAPE_COMMENT(298),
    
    /**
     * (299)
     */
    XCN_OID_NETSCAPE_DATA_TYPE(299),
    
    /**
     * (300)
     */
    XCN_OID_NETSCAPE_CERT_SEQUENCE(300),
    
    /**
     * (301)
     */
    XCN_OID_CT_PKI_DATA(301),
    
    /**
     * (302)
     */
    XCN_OID_CT_PKI_RESPONSE(302),
    
    /**
     * (303)
     */
    XCN_OID_PKIX_NO_SIGNATURE(303),
    
    /**
     * (304)
     */
    XCN_OID_CMC(304),
    
    /**
     * (305)
     */
    XCN_OID_CMC_STATUS_INFO(305),
    
    /**
     * (306)
     */
    XCN_OID_CMC_IDENTIFICATION(306),
    
    /**
     * (307)
     */
    XCN_OID_CMC_IDENTITY_PROOF(307),
    
    /**
     * (308)
     */
    XCN_OID_CMC_DATA_RETURN(308),
    
    /**
     * (309)
     */
    XCN_OID_CMC_TRANSACTION_ID(309),
    
    /**
     * (310)
     */
    XCN_OID_CMC_SENDER_NONCE(310),
    
    /**
     * (311)
     */
    XCN_OID_CMC_RECIPIENT_NONCE(311),
    
    /**
     * (312)
     */
    XCN_OID_CMC_ADD_EXTENSIONS(312),
    
    /**
     * (313)
     */
    XCN_OID_CMC_ENCRYPTED_POP(313),
    
    /**
     * (314)
     */
    XCN_OID_CMC_DECRYPTED_POP(314),
    
    /**
     * (315)
     */
    XCN_OID_CMC_LRA_POP_WITNESS(315),
    
    /**
     * (316)
     */
    XCN_OID_CMC_GET_CERT(316),
    
    /**
     * (317)
     */
    XCN_OID_CMC_GET_CRL(317),
    
    /**
     * (318)
     */
    XCN_OID_CMC_REVOKE_REQUEST(318),
    
    /**
     * (319)
     */
    XCN_OID_CMC_REG_INFO(319),
    
    /**
     * (320)
     */
    XCN_OID_CMC_RESPONSE_INFO(320),
    
    /**
     * (321)
     */
    XCN_OID_CMC_QUERY_PENDING(321),
    
    /**
     * (322)
     */
    XCN_OID_CMC_ID_POP_LINK_RANDOM(322),
    
    /**
     * (323)
     */
    XCN_OID_CMC_ID_POP_LINK_WITNESS(323),
    
    /**
     * (324)
     */
    XCN_OID_CMC_ID_CONFIRM_CERT_ACCEPTANCE(324),
    
    /**
     * (325)
     */
    XCN_OID_CMC_ADD_ATTRIBUTES(325),
    
    /**
     * (326)
     */
    XCN_OID_LOYALTY_OTHER_LOGOTYPE(326),
    
    /**
     * (327)
     */
    XCN_OID_BACKGROUND_OTHER_LOGOTYPE(327),
    
    /**
     * (328)
     */
    XCN_OID_PKIX_OCSP_BASIC_SIGNED_RESPONSE(328),
    
    /**
     * (329)
     */
    XCN_OID_PKCS_7_DATA(329),
    
    /**
     * (330)
     */
    XCN_OID_PKCS_7_SIGNED(330),
    
    /**
     * (331)
     */
    XCN_OID_PKCS_7_ENVELOPED(331),
    
    /**
     * (332)
     */
    XCN_OID_PKCS_7_SIGNEDANDENVELOPED(332),
    
    /**
     * (333)
     */
    XCN_OID_PKCS_7_DIGESTED(333),
    
    /**
     * (334)
     */
    XCN_OID_PKCS_7_ENCRYPTED(334),
    
    /**
     * (335)
     */
    XCN_OID_PKCS_9_CONTENT_TYPE(335),
    
    /**
     * (336)
     */
    XCN_OID_PKCS_9_MESSAGE_DIGEST(336),
    
    /**
     * (337)
     */
    XCN_OID_CERT_PROP_ID_PREFIX(337),
    
    /**
     * (338)
     */
    XCN_OID_CERT_KEY_IDENTIFIER_PROP_ID(338),
    
    /**
     * (339)
     */
    XCN_OID_CERT_ISSUER_SERIAL_NUMBER_MD5_HASH_PROP_ID(339),
    
    /**
     * (340)
     */
    XCN_OID_CERT_SUBJECT_NAME_MD5_HASH_PROP_ID(340),
    
    /**
     * (341)
     */
    XCN_OID_CERT_MD5_HASH_PROP_ID(341),
    
    /**
     * (342)
     */
    XCN_OID_RSA_SHA256RSA(342),
    
    /**
     * (343)
     */
    XCN_OID_RSA_SHA384RSA(343),
    
    /**
     * (344)
     */
    XCN_OID_RSA_SHA512RSA(344),
    
    /**
     * (345)
     */
    XCN_OID_NIST_sha256(345),
    
    /**
     * (346)
     */
    XCN_OID_NIST_sha384(346),
    
    /**
     * (347)
     */
    XCN_OID_NIST_sha512(347),
    
    /**
     * (348)
     */
    XCN_OID_RSA_MGF1(348),
    
    /**
     * (349)
     */
    XCN_OID_ECC_PUBLIC_KEY(349),
    
    /**
     * (350)
     */
    XCN_OID_ECDSA_SHA1(350),
    
    /**
     * (351)
     */
    XCN_OID_ECDSA_SPECIFIED(351),
    
    /**
     * (352)
     */
    XCN_OID_ANY_ENHANCED_KEY_USAGE(352),
    
    /**
     * (353)
     */
    XCN_OID_RSA_SSA_PSS(353),
    
    /**
     * (355)
     */
    XCN_OID_ATTR_SUPPORTED_ALGORITHMS(355),
    
    /**
     * (356)
     */
    XCN_OID_ATTR_TPM_SECURITY_ASSERTIONS(356),
    
    /**
     * (357)
     */
    XCN_OID_ATTR_TPM_SPECIFICATION(357),
    
    /**
     * (358)
     */
    XCN_OID_CERT_DISALLOWED_FILETIME_PROP_ID(358),
    
    /**
     * (359)
     */
    XCN_OID_CERT_SIGNATURE_HASH_PROP_ID(359),
    
    /**
     * (360)
     */
    XCN_OID_CERT_STRONG_KEY_OS_1(360),
    
    /**
     * (361)
     */
    XCN_OID_CERT_STRONG_KEY_OS_CURRENT(361),
    
    /**
     * (362)
     */
    XCN_OID_CERT_STRONG_KEY_OS_PREFIX(362),
    
    /**
     * (363)
     */
    XCN_OID_CERT_STRONG_SIGN_OS_1(363),
    
    /**
     * (364)
     */
    XCN_OID_CERT_STRONG_SIGN_OS_CURRENT(364),
    
    /**
     * (365)
     */
    XCN_OID_CERT_STRONG_SIGN_OS_PREFIX(365),
    
    /**
     * (366)
     */
    XCN_OID_DH_SINGLE_PASS_STDDH_SHA1_KDF(366),
    
    /**
     * (367)
     */
    XCN_OID_DH_SINGLE_PASS_STDDH_SHA256_KDF(367),
    
    /**
     * (368)
     */
    XCN_OID_DH_SINGLE_PASS_STDDH_SHA384_KDF(368),
    
    /**
     * (369)
     */
    XCN_OID_DISALLOWED_HASH(369),
    
    /**
     * (370)
     */
    XCN_OID_DISALLOWED_LIST(370),
    
    /**
     * (371)
     */
    XCN_OID_ECC_CURVE_P256(371),
    
    /**
     * (372)
     */
    XCN_OID_ECC_CURVE_P384(372),
    
    /**
     * (373)
     */
    XCN_OID_ECC_CURVE_P521(373),
    
    /**
     * (374)
     */
    XCN_OID_ECDSA_SHA256(374),
    
    /**
     * (375)
     */
    XCN_OID_ECDSA_SHA384(375),
    
    /**
     * (376)
     */
    XCN_OID_ECDSA_SHA512(376),
    
    /**
     * (377)
     */
    XCN_OID_ENROLL_CAXCHGCERT_HASH(377),
    
    /**
     * (378)
     */
    XCN_OID_ENROLL_EK_INFO(378),
    
    /**
     * (379)
     */
    XCN_OID_ENROLL_EKPUB_CHALLENGE(379),
    
    /**
     * (380)
     */
    XCN_OID_ENROLL_EKVERIFYCERT(380),
    
    /**
     * (381)
     */
    XCN_OID_ENROLL_EKVERIFYCREDS(381),
    
    /**
     * (382)
     */
    XCN_OID_ENROLL_EKVERIFYKEY(382),
    
    /**
     * (383)
     */
    XCN_OID_EV_RDN_COUNTRY(383),
    
    /**
     * (384)
     */
    XCN_OID_EV_RDN_LOCALE(384),
    
    /**
     * (385)
     */
    XCN_OID_EV_RDN_STATE_OR_PROVINCE(385),
    
    /**
     * (386)
     */
    XCN_OID_INHIBIT_ANY_POLICY(386),
    
    /**
     * (387)
     */
    XCN_OID_INTERNATIONALIZED_EMAIL_ADDRESS(387),
    
    /**
     * (388)
     */
    XCN_OID_KP_KERNEL_MODE_CODE_SIGNING(388),
    
    /**
     * (389)
     */
    XCN_OID_KP_KERNEL_MODE_HAL_EXTENSION_SIGNING(389),
    
    /**
     * (390)
     */
    XCN_OID_KP_KERNEL_MODE_TRUSTED_BOOT_SIGNING(390),
    
    /**
     * (391)
     */
    XCN_OID_KP_TPM_AIK_CERTIFICATE(391),
    
    /**
     * (392)
     */
    XCN_OID_KP_TPM_EK_CERTIFICATE(392),
    
    /**
     * (393)
     */
    XCN_OID_KP_TPM_PLATFORM_CERTIFICATE(393),
    
    /**
     * (394)
     */
    XCN_OID_NIST_AES128_CBC(394),
    
    /**
     * (395)
     */
    XCN_OID_NIST_AES128_WRAP(395),
    
    /**
     * (396)
     */
    XCN_OID_NIST_AES192_CBC(396),
    
    /**
     * (397)
     */
    XCN_OID_NIST_AES192_WRAP(397),
    
    /**
     * (398)
     */
    XCN_OID_NIST_AES256_CBC(398),
    
    /**
     * (399)
     */
    XCN_OID_NIST_AES256_WRAP(399),
    
    /**
     * (400)
     */
    XCN_OID_PKCS_12_PbeIds(400),
    
    /**
     * (401)
     */
    XCN_OID_PKCS_12_pbeWithSHA1And128BitRC2(401),
    
    /**
     * (402)
     */
    XCN_OID_PKCS_12_pbeWithSHA1And128BitRC4(402),
    
    /**
     * (403)
     */
    XCN_OID_PKCS_12_pbeWithSHA1And2KeyTripleDES(403),
    
    /**
     * (404)
     */
    XCN_OID_PKCS_12_pbeWithSHA1And3KeyTripleDES(404),
    
    /**
     * (405)
     */
    XCN_OID_PKCS_12_pbeWithSHA1And40BitRC2(405),
    
    /**
     * (406)
     */
    XCN_OID_PKCS_12_pbeWithSHA1And40BitRC4(406),
    
    /**
     * (407)
     */
    XCN_OID_PKCS_12_PROTECTED_PASSWORD_SECRET_BAG_TYPE_ID(407),
    
    /**
     * (408)
     */
    XCN_OID_PKINIT_KP_KDC(408),
    
    /**
     * (409)
     */
    XCN_OID_PKIX_CA_REPOSITORY(409),
    
    /**
     * (410)
     */
    XCN_OID_PKIX_OCSP_NONCE(410),
    
    /**
     * (411)
     */
    XCN_OID_PKIX_TIME_STAMPING(411),
    
    /**
     * (412)
     */
    XCN_OID_QC_EU_COMPLIANCE(412),
    
    /**
     * (413)
     */
    XCN_OID_QC_SSCD(413),
    
    /**
     * (414)
     */
    XCN_OID_QC_STATEMENTS_EXT(414),
    
    /**
     * (415)
     */
    XCN_OID_RDN_TPM_MANUFACTURER(415),
    
    /**
     * (416)
     */
    XCN_OID_RDN_TPM_MODEL(416),
    
    /**
     * (417)
     */
    XCN_OID_RDN_TPM_VERSION(417),
    
    /**
     * (418)
     */
    XCN_OID_REVOKED_LIST_SIGNER(418),
    
    /**
     * (419)
     */
    XCN_OID_RFC3161_counterSign(419),
    
    /**
     * (420)
     */
    XCN_OID_ROOT_PROGRAM_AUTO_UPDATE_CA_REVOCATION(420),
    
    /**
     * (421)
     */
    XCN_OID_ROOT_PROGRAM_AUTO_UPDATE_END_REVOCATION(421),
    
    /**
     * (422)
     */
    XCN_OID_ROOT_PROGRAM_FLAGS(422),
    
    /**
     * (423)
     */
    XCN_OID_ROOT_PROGRAM_NO_OCSP_FAILOVER_TO_CRL(423),
    
    /**
     * (424)
     */
    XCN_OID_RSA_PSPECIFIED(424),
    
    /**
     * (425)
     */
    XCN_OID_RSAES_OAEP(425),
    
    /**
     * (426)
     */
    XCN_OID_SUBJECT_INFO_ACCESS(426),
    
    /**
     * (427)
     */
    XCN_OID_TIMESTAMP_TOKEN(427),
    
    /**
     * (428)
     */
    XCN_OID_ENROLL_SCEP_ERROR(428),
    
    /**
     * (429)
     */
    XCN_OIDVerisign_MessageType(429),
    
    /**
     * (430)
     */
    XCN_OIDVerisign_PkiStatus(430),
    
    /**
     * (431)
     */
    XCN_OIDVerisign_FailInfo(431),
    
    /**
     * (432)
     */
    XCN_OIDVerisign_SenderNonce(432),
    
    /**
     * (433)
     */
    XCN_OIDVerisign_RecipientNonce(433),
    
    /**
     * (434)
     */
    XCN_OIDVerisign_TransactionID(434),
    
    /**
     * (435)
     */
    XCN_OID_ENROLL_ATTESTATION_CHALLENGE(435),
    
    /**
     * (436)
     */
    XCN_OID_ENROLL_ATTESTATION_STATEMENT(436),
    
    /**
     * (437)
     */
    XCN_OID_ENROLL_ENCRYPTION_ALGORITHM(437),
    
    /**
     * (438)
     */
    XCN_OID_ENROLL_KSP_NAME(438),
    ;

    private CERTENROLL_OBJECTID(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}