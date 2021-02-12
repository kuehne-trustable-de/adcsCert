
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.509 Certificate Request Pkcs10 Interface v4
 *
 * <p>uuid({728AB363-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB363-217D-11DA-B2A4-000E7BBB2B09}")
public interface IX509CertificateRequestPkcs10V4 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param Context [in] {@code X509CertificateEnrollmentContext}
     */
    @ComMethod(name = "Initialize", dispId = 0x60020000)
    void Initialize(X509CertificateEnrollmentContext Context);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComMethod(name = "Encode", dispId = 0x60020001)
    void Encode();
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "ResetForEncode", dispId = 0x60020002)
    void ResetForEncode();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     * @param Level [in] {@code InnerRequestLevel}
     */
    @ComMethod(name = "GetInnerRequest", dispId = 0x60020003)
    IX509CertificateRequest GetInnerRequest(InnerRequestLevel Level);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Type", dispId = 0x60020004)
    X509RequestType getType();
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "EnrollmentContext", dispId = 0x60020005)
    X509CertificateEnrollmentContext getEnrollmentContext();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Silent", dispId = 0x60020006)
    Boolean getSilent();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Silent", dispId = 0x60020006)
    void setSilent(Boolean param0);
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "ParentWindow", dispId = 0x60020008)
    Integer getParentWindow();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ParentWindow", dispId = 0x60020008)
    void setParentWindow(Integer param0);
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "UIContextMessage", dispId = 0x6002000a)
    String getUIContextMessage();
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "UIContextMessage", dispId = 0x6002000a)
    void setUIContextMessage(String param0);
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "SuppressDefaults", dispId = 0x6002000c)
    Boolean getSuppressDefaults();
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SuppressDefaults", dispId = 0x6002000c)
    void setSuppressDefaults(Boolean param0);
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(21)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "RenewalCertificate", dispId = 0x6002000e)
    String getRenewalCertificate(EncodingType Encoding);
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(22)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     * @param param1 [in] {@code String}
     */
    @ComProperty(name = "RenewalCertificate", dispId = 0x6002000e)
    void setRenewalCertificate(EncodingType Encoding,
            String param1);
            
    /**
     * <p>id(0x60020010)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "ClientId", dispId = 0x60020010)
    RequestClientInfoClientId getClientId();
            
    /**
     * <p>id(0x60020010)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code RequestClientInfoClientId}
     */
    @ComProperty(name = "ClientId", dispId = 0x60020010)
    void setClientId(RequestClientInfoClientId param0);
            
    /**
     * <p>id(0x60020012)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "CspInformations", dispId = 0x60020012)
    ICspInformations getCspInformations();
            
    /**
     * <p>id(0x60020012)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code ICspInformations}
     */
    @ComProperty(name = "CspInformations", dispId = 0x60020012)
    void setCspInformations(ICspInformations param0);
            
    /**
     * <p>id(0x60020014)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "HashAlgorithm", dispId = 0x60020014)
    IObjectId getHashAlgorithm();
            
    /**
     * <p>id(0x60020014)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code IObjectId}
     */
    @ComProperty(name = "HashAlgorithm", dispId = 0x60020014)
    void setHashAlgorithm(IObjectId param0);
            
    /**
     * <p>id(0x60020016)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "AlternateSignatureAlgorithm", dispId = 0x60020016)
    Boolean getAlternateSignatureAlgorithm();
            
    /**
     * <p>id(0x60020016)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AlternateSignatureAlgorithm", dispId = 0x60020016)
    void setAlternateSignatureAlgorithm(Boolean param0);
            
    /**
     * <p>id(0x60020018)</p>
     * <p>vtableId(31)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "RawData", dispId = 0x60020018)
    String getRawData(EncodingType Encoding);
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(32)</p>
     * @param Context [in] {@code X509CertificateEnrollmentContext}
     * @param strTemplateName [in] {@code String}
     */
    @ComMethod(name = "InitializeFromTemplateName", dispId = 0x60030000)
    void InitializeFromTemplateName(X509CertificateEnrollmentContext Context,
            String strTemplateName);
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(33)</p>
     * @param Context [in] {@code X509CertificateEnrollmentContext}
     * @param pPrivateKey [in] {@code IX509PrivateKey}
     * @param strTemplateName [in] {@code String}
     */
    @ComMethod(name = "InitializeFromPrivateKey", dispId = 0x60030001)
    void InitializeFromPrivateKey(X509CertificateEnrollmentContext Context,
            IX509PrivateKey pPrivateKey,
            String strTemplateName);
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(34)</p>
     * @param Context [in] {@code X509CertificateEnrollmentContext}
     * @param pPublicKey [in] {@code IX509PublicKey}
     * @param strTemplateName [in] {@code String}
     */
    @ComMethod(name = "InitializeFromPublicKey", dispId = 0x60030002)
    void InitializeFromPublicKey(X509CertificateEnrollmentContext Context,
            IX509PublicKey pPublicKey,
            String strTemplateName);
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(35)</p>
     * @param Context [in] {@code X509CertificateEnrollmentContext}
     * @param strCertificate [in] {@code String}
     * @param Encoding [in, optional] {@code EncodingType}
     * @param InheritOptions [in, optional] {@code X509RequestInheritOptions}
     */
    @ComMethod(name = "InitializeFromCertificate", dispId = 0x60030003)
    void InitializeFromCertificate(X509CertificateEnrollmentContext Context,
            String strCertificate,
            EncodingType Encoding,
            X509RequestInheritOptions InheritOptions);
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(36)</p>
     * @param strEncodedData [in] {@code String}
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComMethod(name = "InitializeDecode", dispId = 0x60030004)
    void InitializeDecode(String strEncodedData,
            EncodingType Encoding);
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(37)</p>
     * @param AllowedSignatureTypes [in, optional] {@code Pkcs10AllowedSignatureTypes}
     */
    @ComMethod(name = "CheckSignature", dispId = 0x60030005)
    void CheckSignature(Pkcs10AllowedSignatureTypes AllowedSignatureTypes);
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(38)</p>
     */
    @ComMethod(name = "IsSmartCard", dispId = 0x60030006)
    Boolean IsSmartCard();
            
    /**
     * <p>id(0x60030007)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "TemplateObjectId", dispId = 0x60030007)
    IObjectId getTemplateObjectId();
            
    /**
     * <p>id(0x60030008)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "PublicKey", dispId = 0x60030008)
    IX509PublicKey getPublicKey();
            
    /**
     * <p>id(0x60030009)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "PrivateKey", dispId = 0x60030009)
    IX509PrivateKey getPrivateKey();
            
    /**
     * <p>id(0x6003000a)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "NullSigned", dispId = 0x6003000a)
    Boolean getNullSigned();
            
    /**
     * <p>id(0x6003000b)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "ReuseKey", dispId = 0x6003000b)
    Boolean getReuseKey();
            
    /**
     * <p>id(0x6003000c)</p>
     * <p>vtableId(44)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "OldCertificate", dispId = 0x6003000c)
    String getOldCertificate(EncodingType Encoding);
            
    /**
     * <p>id(0x6003000d)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x6003000d)
    IX500DistinguishedName getSubject();
            
    /**
     * <p>id(0x6003000d)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code IX500DistinguishedName}
     */
    @ComProperty(name = "Subject", dispId = 0x6003000d)
    void setSubject(IX500DistinguishedName param0);
            
    /**
     * <p>id(0x6003000f)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "CspStatuses", dispId = 0x6003000f)
    ICspStatuses getCspStatuses();
            
    /**
     * <p>id(0x60030010)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "SmimeCapabilities", dispId = 0x60030010)
    Boolean getSmimeCapabilities();
            
    /**
     * <p>id(0x60030010)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SmimeCapabilities", dispId = 0x60030010)
    void setSmimeCapabilities(Boolean param0);
            
    /**
     * <p>id(0x60030012)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "SignatureInformation", dispId = 0x60030012)
    IX509SignatureInformation getSignatureInformation();
            
    /**
     * <p>id(0x60030013)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "KeyContainerNamePrefix", dispId = 0x60030013)
    String getKeyContainerNamePrefix();
            
    /**
     * <p>id(0x60030013)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "KeyContainerNamePrefix", dispId = 0x60030013)
    void setKeyContainerNamePrefix(String param0);
            
    /**
     * <p>id(0x60030015)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "CryptAttributes", dispId = 0x60030015)
    ICryptAttributes getCryptAttributes();
            
    /**
     * <p>id(0x60030016)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "X509Extensions", dispId = 0x60030016)
    IX509Extensions getX509Extensions();
            
    /**
     * <p>id(0x60030017)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "CriticalExtensions", dispId = 0x60030017)
    IObjectIds getCriticalExtensions();
            
    /**
     * <p>id(0x60030018)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "SuppressOids", dispId = 0x60030018)
    IObjectIds getSuppressOids();
            
    /**
     * <p>id(0x60030019)</p>
     * <p>vtableId(57)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "RawDataToBeSigned", dispId = 0x60030019)
    String getRawDataToBeSigned(EncodingType Encoding);
            
    /**
     * <p>id(0x6003001a)</p>
     * <p>vtableId(58)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "Signature", dispId = 0x6003001a)
    String getSignature(EncodingType Encoding);
            
    /**
     * <p>id(0x6003001b)</p>
     * <p>vtableId(59)</p>
     * @param KeySpec [in] {@code X509KeySpec}
     */
    @ComMethod(name = "GetCspStatuses", dispId = 0x6003001b)
    ICspStatuses GetCspStatuses(X509KeySpec KeySpec);
            
    /**
     * <p>id(0x60040000)</p>
     * <p>vtableId(60)</p>
     * @param Context [in] {@code X509CertificateEnrollmentContext}
     * @param pPolicyServer [in] {@code IX509EnrollmentPolicyServer}
     * @param pTemplate [in] {@code IX509CertificateTemplate}
     */
    @ComMethod(name = "InitializeFromTemplate", dispId = 0x60040000)
    void InitializeFromTemplate(X509CertificateEnrollmentContext Context,
            IX509EnrollmentPolicyServer pPolicyServer,
            IX509CertificateTemplate pTemplate);
            
    /**
     * <p>id(0x60040001)</p>
     * <p>vtableId(61)</p>
     * @param Context [in] {@code X509CertificateEnrollmentContext}
     * @param pPrivateKey [in] {@code IX509PrivateKey}
     * @param pPolicyServer [in] {@code IX509EnrollmentPolicyServer}
     * @param pTemplate [in] {@code IX509CertificateTemplate}
     */
    @ComMethod(name = "InitializeFromPrivateKeyTemplate", dispId = 0x60040001)
    void InitializeFromPrivateKeyTemplate(X509CertificateEnrollmentContext Context,
            IX509PrivateKey pPrivateKey,
            IX509EnrollmentPolicyServer pPolicyServer,
            IX509CertificateTemplate pTemplate);
            
    /**
     * <p>id(0x60040002)</p>
     * <p>vtableId(62)</p>
     * @param Context [in] {@code X509CertificateEnrollmentContext}
     * @param pPublicKey [in] {@code IX509PublicKey}
     * @param pPolicyServer [in] {@code IX509EnrollmentPolicyServer}
     * @param pTemplate [in] {@code IX509CertificateTemplate}
     */
    @ComMethod(name = "InitializeFromPublicKeyTemplate", dispId = 0x60040002)
    void InitializeFromPublicKeyTemplate(X509CertificateEnrollmentContext Context,
            IX509PublicKey pPublicKey,
            IX509EnrollmentPolicyServer pPolicyServer,
            IX509CertificateTemplate pTemplate);
            
    /**
     * <p>id(0x60040003)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "PolicyServer", dispId = 0x60040003)
    IX509EnrollmentPolicyServer getPolicyServer();
            
    /**
     * <p>id(0x60040004)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "Template", dispId = 0x60040004)
    IX509CertificateTemplate getTemplate();
            
    /**
     * <p>id(0x60050000)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "AttestPrivateKey", dispId = 0x60050000)
    Boolean getAttestPrivateKey();
            
    /**
     * <p>id(0x60050000)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AttestPrivateKey", dispId = 0x60050000)
    void setAttestPrivateKey(Boolean param0);
            
    /**
     * <p>id(0x60050002)</p>
     * <p>vtableId(67)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "AttestationEncryptionCertificate", dispId = 0x60050002)
    String getAttestationEncryptionCertificate(EncodingType Encoding);
            
    /**
     * <p>id(0x60050002)</p>
     * <p>vtableId(68)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     * @param param1 [in] {@code String}
     */
    @ComProperty(name = "AttestationEncryptionCertificate", dispId = 0x60050002)
    void setAttestationEncryptionCertificate(EncodingType Encoding,
            String param1);
            
    /**
     * <p>id(0x60050004)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "EncryptionAlgorithm", dispId = 0x60050004)
    IObjectId getEncryptionAlgorithm();
            
    /**
     * <p>id(0x60050004)</p>
     * <p>vtableId(70)</p>
     * @param param0 [in] {@code IObjectId}
     */
    @ComProperty(name = "EncryptionAlgorithm", dispId = 0x60050004)
    void setEncryptionAlgorithm(IObjectId param0);
            
    /**
     * <p>id(0x60050006)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "EncryptionStrength", dispId = 0x60050006)
    Integer getEncryptionStrength();
            
    /**
     * <p>id(0x60050006)</p>
     * <p>vtableId(72)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "EncryptionStrength", dispId = 0x60050006)
    void setEncryptionStrength(Integer param0);
            
    /**
     * <p>id(0x60050008)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "ChallengePassword", dispId = 0x60050008)
    String getChallengePassword();
            
    /**
     * <p>id(0x60050008)</p>
     * <p>vtableId(74)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ChallengePassword", dispId = 0x60050008)
    void setChallengePassword(String param0);
            
    /**
     * <p>id(0x6005000a)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "NameValuePairs", dispId = 0x6005000a)
    IX509NameValuePairs getNameValuePairs();
            
    /**
     * <p>id(0x60060000)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "ClaimType", dispId = 0x60060000)
    KeyAttestationClaimType getClaimType();
            
    /**
     * <p>id(0x60060000)</p>
     * <p>vtableId(77)</p>
     * @param param0 [in] {@code KeyAttestationClaimType}
     */
    @ComProperty(name = "ClaimType", dispId = 0x60060000)
    void setClaimType(KeyAttestationClaimType param0);
            
    /**
     * <p>id(0x60060002)</p>
     * <p>vtableId(78)</p>
     */
    @ComProperty(name = "AttestPrivateKeyPreferred", dispId = 0x60060002)
    Boolean getAttestPrivateKeyPreferred();
            
    /**
     * <p>id(0x60060002)</p>
     * <p>vtableId(79)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AttestPrivateKeyPreferred", dispId = 0x60060002)
    void setAttestPrivateKeyPreferred(Boolean param0);
            
    
}