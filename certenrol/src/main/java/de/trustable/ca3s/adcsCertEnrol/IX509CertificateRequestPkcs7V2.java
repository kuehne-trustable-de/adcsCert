
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.509 Certificate Request Pkcs7 Interface v2
 *
 * <p>uuid({728AB35C-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB35C-217D-11DA-B2A4-000E7BBB2B09}")
public interface IX509CertificateRequestPkcs7V2 extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * @param RenewalRequest [in] {@code Boolean}
     * @param strCertificate [in] {@code String}
     * @param Encoding [in, optional] {@code EncodingType}
     * @param InheritOptions [in, optional] {@code X509RequestInheritOptions}
     */
    @ComMethod(name = "InitializeFromCertificate", dispId = 0x60030001)
    void InitializeFromCertificate(X509CertificateEnrollmentContext Context,
            Boolean RenewalRequest,
            String strCertificate,
            EncodingType Encoding,
            X509RequestInheritOptions InheritOptions);
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(34)</p>
     * @param pInnerRequest [in] {@code IX509CertificateRequest}
     */
    @ComMethod(name = "InitializeFromInnerRequest", dispId = 0x60030002)
    void InitializeFromInnerRequest(IX509CertificateRequest pInnerRequest);
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(35)</p>
     * @param strEncodedData [in] {@code String}
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComMethod(name = "InitializeDecode", dispId = 0x60030003)
    void InitializeDecode(String strEncodedData,
            EncodingType Encoding);
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "RequesterName", dispId = 0x60030004)
    String getRequesterName();
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "RequesterName", dispId = 0x60030004)
    void setRequesterName(String param0);
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "SignerCertificate", dispId = 0x60030006)
    ISignerCertificate getSignerCertificate();
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code ISignerCertificate}
     */
    @ComProperty(name = "SignerCertificate", dispId = 0x60030006)
    void setSignerCertificate(ISignerCertificate param0);
            
    /**
     * <p>id(0x60040000)</p>
     * <p>vtableId(40)</p>
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
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "PolicyServer", dispId = 0x60040001)
    IX509EnrollmentPolicyServer getPolicyServer();
            
    /**
     * <p>id(0x60040002)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "Template", dispId = 0x60040002)
    IX509CertificateTemplate getTemplate();
            
    /**
     * <p>id(0x60040003)</p>
     * <p>vtableId(43)</p>
     * @param ValidateCertificateChain [in] {@code Boolean}
     */
    @ComMethod(name = "CheckCertificateSignature", dispId = 0x60040003)
    void CheckCertificateSignature(Boolean ValidateCertificateChain);
            
    
}