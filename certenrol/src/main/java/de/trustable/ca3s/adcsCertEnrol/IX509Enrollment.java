
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.509 Enrollment Interface
 *
 * <p>uuid({728AB346-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB346-217D-11DA-B2A4-000E7BBB2B09}")
public interface IX509Enrollment extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * @param Context [in] {@code X509CertificateEnrollmentContext}
     * @param strTemplateName [in] {@code String}
     */
    @ComMethod(name = "InitializeFromTemplateName", dispId = 0x60020001)
    void InitializeFromTemplateName(X509CertificateEnrollmentContext Context,
            String strTemplateName);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param pRequest [in] {@code IX509CertificateRequest}
     */
    @ComMethod(name = "InitializeFromRequest", dispId = 0x60020002)
    void InitializeFromRequest(IX509CertificateRequest pRequest);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComMethod(name = "CreateRequest", dispId = 0x60020003)
    String CreateRequest(EncodingType Encoding);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Enroll", dispId = 0x60020004)
    void Enroll();
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     * @param Restrictions [in] {@code InstallResponseRestrictionFlags}
     * @param strResponse [in] {@code String}
     * @param Encoding [in] {@code EncodingType}
     * @param strPassword [in] {@code String}
     */
    @ComMethod(name = "InstallResponse", dispId = 0x60020005)
    void InstallResponse(InstallResponseRestrictionFlags Restrictions,
            String strResponse,
            EncodingType Encoding,
            String strPassword);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param strPassword [in] {@code String}
     * @param ExportOptions [in] {@code PFXExportOptions}
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComMethod(name = "CreatePFX", dispId = 0x60020006)
    String CreatePFX(String strPassword,
            PFXExportOptions ExportOptions,
            EncodingType Encoding);
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Request", dispId = 0x60020007)
    IX509CertificateRequest getRequest();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Silent", dispId = 0x60020008)
    Boolean getSilent();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Silent", dispId = 0x60020008)
    void setSilent(Boolean param0);
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "ParentWindow", dispId = 0x6002000a)
    Integer getParentWindow();
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ParentWindow", dispId = 0x6002000a)
    void setParentWindow(Integer param0);
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "NameValuePairs", dispId = 0x6002000c)
    IX509NameValuePairs getNameValuePairs();
            
    /**
     * <p>id(0x6002000d)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "EnrollmentContext", dispId = 0x6002000d)
    X509CertificateEnrollmentContext getEnrollmentContext();
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Status", dispId = 0x6002000e)
    IX509EnrollmentStatus getStatus();
            
    /**
     * <p>id(0x6002000f)</p>
     * <p>vtableId(22)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "Certificate", dispId = 0x6002000f)
    String getCertificate(EncodingType Encoding);
            
    /**
     * <p>id(0x60020010)</p>
     * <p>vtableId(23)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "Response", dispId = 0x60020010)
    String getResponse(EncodingType Encoding);
            
    /**
     * <p>id(0x60020011)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "CertificateFriendlyName", dispId = 0x60020011)
    String getCertificateFriendlyName();
            
    /**
     * <p>id(0x60020011)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "CertificateFriendlyName", dispId = 0x60020011)
    void setCertificateFriendlyName(String param0);
            
    /**
     * <p>id(0x60020013)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "CertificateDescription", dispId = 0x60020013)
    String getCertificateDescription();
            
    /**
     * <p>id(0x60020013)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "CertificateDescription", dispId = 0x60020013)
    void setCertificateDescription(String param0);
            
    /**
     * <p>id(0x60020015)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "RequestId", dispId = 0x60020015)
    Integer getRequestId();
            
    /**
     * <p>id(0x60020016)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "CAConfigString", dispId = 0x60020016)
    String getCAConfigString();
            
    
}