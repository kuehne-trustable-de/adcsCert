
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.509 Policy Server Interface
 *
 * <p>uuid({13B79026-2181-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{13B79026-2181-11DA-B2A4-000E7BBB2B09}")
public interface IX509EnrollmentPolicyServer extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param bstrPolicyServerUrl [in] {@code String}
     * @param bstrPolicyServerId [in] {@code String}
     * @param AuthFlags [in] {@code X509EnrollmentAuthFlags}
     * @param fIsUnTrusted [in] {@code Boolean}
     * @param Context [in] {@code X509CertificateEnrollmentContext}
     */
    @ComMethod(name = "Initialize", dispId = 0x60020000)
    void Initialize(String bstrPolicyServerUrl,
            String bstrPolicyServerId,
            X509EnrollmentAuthFlags AuthFlags,
            Boolean fIsUnTrusted,
            X509CertificateEnrollmentContext Context);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param option [in] {@code X509EnrollmentPolicyLoadOption}
     */
    @ComMethod(name = "LoadPolicy", dispId = 0x60020001)
    void LoadPolicy(X509EnrollmentPolicyLoadOption option);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "GetTemplates", dispId = 0x60020002)
    IX509CertificateTemplates GetTemplates();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     * @param pTemplate [in] {@code IX509CertificateTemplate}
     */
    @ComMethod(name = "GetCAsForTemplate", dispId = 0x60020003)
    ICertificationAuthorities GetCAsForTemplate(IX509CertificateTemplate pTemplate);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "GetCAs", dispId = 0x60020004)
    ICertificationAuthorities GetCAs();
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Validate", dispId = 0x60020005)
    void Validate();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "GetCustomOids", dispId = 0x60020006)
    IObjectIds GetCustomOids();
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "GetNextUpdateTime", dispId = 0x60020007)
    java.util.Date GetNextUpdateTime();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "GetLastUpdateTime", dispId = 0x60020008)
    java.util.Date GetLastUpdateTime();
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "GetPolicyServerUrl", dispId = 0x60020009)
    String GetPolicyServerUrl();
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "GetPolicyServerId", dispId = 0x6002000a)
    String GetPolicyServerId();
            
    /**
     * <p>id(0x6002000b)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "GetFriendlyName", dispId = 0x6002000b)
    String GetFriendlyName();
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "GetIsDefaultCEP", dispId = 0x6002000c)
    Boolean GetIsDefaultCEP();
            
    /**
     * <p>id(0x6002000d)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "GetUseClientId", dispId = 0x6002000d)
    Boolean GetUseClientId();
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "GetAllowUnTrustedCA", dispId = 0x6002000e)
    Boolean GetAllowUnTrustedCA();
            
    /**
     * <p>id(0x6002000f)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "GetCachePath", dispId = 0x6002000f)
    String GetCachePath();
            
    /**
     * <p>id(0x60020010)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "GetCacheDir", dispId = 0x60020010)
    String GetCacheDir();
            
    /**
     * <p>id(0x60020011)</p>
     * <p>vtableId(24)</p>
     */
    @ComMethod(name = "GetAuthFlags", dispId = 0x60020011)
    X509EnrollmentAuthFlags GetAuthFlags();
            
    /**
     * <p>id(0x60020012)</p>
     * <p>vtableId(25)</p>
     * @param hWndParent [in] {@code Integer}
     * @param flag [in] {@code X509EnrollmentAuthFlags}
     * @param strCredential [in] {@code String}
     * @param strPassword [in] {@code String}
     */
    @ComMethod(name = "SetCredential", dispId = 0x60020012)
    void SetCredential(Integer hWndParent,
            X509EnrollmentAuthFlags flag,
            String strCredential,
            String strPassword);
            
    /**
     * <p>id(0x60020013)</p>
     * <p>vtableId(26)</p>
     */
    @ComMethod(name = "QueryChanges", dispId = 0x60020013)
    Boolean QueryChanges();
            
    /**
     * <p>id(0x60020014)</p>
     * <p>vtableId(27)</p>
     * @param val [in] {@code Object}
     */
    @ComMethod(name = "InitializeImport", dispId = 0x60020014)
    void InitializeImport(Object val);
            
    /**
     * <p>id(0x60020015)</p>
     * <p>vtableId(28)</p>
     * @param exportFlags [in] {@code X509EnrollmentPolicyExportFlags}
     */
    @ComMethod(name = "Export", dispId = 0x60020015)
    Object Export(X509EnrollmentPolicyExportFlags exportFlags);
            
    /**
     * <p>id(0x60020016)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Cost", dispId = 0x60020016)
    Integer getCost();
            
    /**
     * <p>id(0x60020016)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Cost", dispId = 0x60020016)
    void setCost(Integer param0);
            
    
}