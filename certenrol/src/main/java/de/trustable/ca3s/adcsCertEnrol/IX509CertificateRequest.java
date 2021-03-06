
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.509 Certificate Request Interface
 *
 * <p>uuid({728AB341-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB341-217D-11DA-B2A4-000E7BBB2B09}")
public interface IX509CertificateRequest extends IUnknown, IRawDispatchHandle, IDispatch {
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
            
    
}