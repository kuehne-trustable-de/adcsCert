
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.509 Policy Server URL Interface
 *
 * <p>uuid({884E204A-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{884E204A-217D-11DA-B2A4-000E7BBB2B09}")
public interface IX509PolicyServerUrl extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Url", dispId = 0x60020001)
    String getUrl();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Url", dispId = 0x60020001)
    void setUrl(String param0);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Default", dispId = 0x60020003)
    Boolean get_Default();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Default", dispId = 0x60020003)
    void set_Default(Boolean param0);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Flags", dispId = 0x60020005)
    PolicyServerUrlFlags getFlags();
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code PolicyServerUrlFlags}
     */
    @ComProperty(name = "Flags", dispId = 0x60020005)
    void setFlags(PolicyServerUrlFlags param0);
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "AuthFlags", dispId = 0x60020007)
    X509EnrollmentAuthFlags getAuthFlags();
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code X509EnrollmentAuthFlags}
     */
    @ComProperty(name = "AuthFlags", dispId = 0x60020007)
    void setAuthFlags(X509EnrollmentAuthFlags param0);
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Cost", dispId = 0x60020009)
    Integer getCost();
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Cost", dispId = 0x60020009)
    void setCost(Integer param0);
            
    /**
     * <p>id(0x6002000b)</p>
     * <p>vtableId(18)</p>
     * @param PropertyId [in] {@code PolicyServerUrlPropertyID}
     */
    @ComMethod(name = "GetStringProperty", dispId = 0x6002000b)
    String GetStringProperty(PolicyServerUrlPropertyID PropertyId);
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(19)</p>
     * @param PropertyId [in] {@code PolicyServerUrlPropertyID}
     * @param pValue [in] {@code String}
     */
    @ComMethod(name = "SetStringProperty", dispId = 0x6002000c)
    void SetStringProperty(PolicyServerUrlPropertyID PropertyId,
            String pValue);
            
    /**
     * <p>id(0x6002000d)</p>
     * <p>vtableId(20)</p>
     * @param Context [in] {@code X509CertificateEnrollmentContext}
     */
    @ComMethod(name = "UpdateRegistry", dispId = 0x6002000d)
    void UpdateRegistry(X509CertificateEnrollmentContext Context);
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(21)</p>
     * @param Context [in] {@code X509CertificateEnrollmentContext}
     */
    @ComMethod(name = "RemoveFromRegistry", dispId = 0x6002000e)
    void RemoveFromRegistry(X509CertificateEnrollmentContext Context);
            
    
}