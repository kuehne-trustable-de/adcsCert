
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * ICertPropertyEnrollmentPolicyServer Interface
 *
 * <p>uuid({728AB34A-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB34A-217D-11DA-B2A4-000E7BBB2B09}")
public interface ICertPropertyEnrollmentPolicyServer extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param MachineContext [in] {@code Boolean}
     * @param Encoding [in] {@code EncodingType}
     * @param strCertificate [in] {@code String}
     */
    @ComMethod(name = "InitializeFromCertificate", dispId = 0x60020000)
    void InitializeFromCertificate(Boolean MachineContext,
            EncodingType Encoding,
            String strCertificate);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param Encoding [in] {@code EncodingType}
     * @param strEncodedData [in] {@code String}
     */
    @ComMethod(name = "InitializeDecode", dispId = 0x60020001)
    void InitializeDecode(EncodingType Encoding,
            String strEncodedData);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "PropertyId", dispId = 0x60020002)
    CERTENROLL_PROPERTYID getPropertyId();
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code CERTENROLL_PROPERTYID}
     */
    @ComProperty(name = "PropertyId", dispId = 0x60020002)
    void setPropertyId(CERTENROLL_PROPERTYID param0);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param Encoding [in] {@code EncodingType}
     */
    @ComProperty(name = "RawData", dispId = 0x60020004)
    String getRawData(EncodingType Encoding);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     * @param MachineContext [in] {@code Boolean}
     * @param Encoding [in] {@code EncodingType}
     * @param strCertificate [in] {@code String}
     */
    @ComMethod(name = "RemoveFromCertificate", dispId = 0x60020005)
    void RemoveFromCertificate(Boolean MachineContext,
            EncodingType Encoding,
            String strCertificate);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param MachineContext [in] {@code Boolean}
     * @param Encoding [in] {@code EncodingType}
     * @param strCertificate [in] {@code String}
     */
    @ComMethod(name = "SetValueOnCertificate", dispId = 0x60020006)
    void SetValueOnCertificate(Boolean MachineContext,
            EncodingType Encoding,
            String strCertificate);
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(14)</p>
     * @param PropertyFlags [in] {@code EnrollmentPolicyServerPropertyFlags}
     * @param AuthFlags [in] {@code X509EnrollmentAuthFlags}
     * @param EnrollmentServerAuthFlags [in] {@code X509EnrollmentAuthFlags}
     * @param UrlFlags [in] {@code PolicyServerUrlFlags}
     * @param strRequestId [in] {@code String}
     * @param strUrl [in] {@code String}
     * @param strId [in] {@code String}
     * @param strEnrollmentServerUrl [in] {@code String}
     */
    @ComMethod(name = "Initialize", dispId = 0x60030000)
    void Initialize(EnrollmentPolicyServerPropertyFlags PropertyFlags,
            X509EnrollmentAuthFlags AuthFlags,
            X509EnrollmentAuthFlags EnrollmentServerAuthFlags,
            PolicyServerUrlFlags UrlFlags,
            String strRequestId,
            String strUrl,
            String strId,
            String strEnrollmentServerUrl);
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "GetPolicyServerUrl", dispId = 0x60030001)
    String GetPolicyServerUrl();
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "GetPolicyServerId", dispId = 0x60030002)
    String GetPolicyServerId();
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "GetEnrollmentServerUrl", dispId = 0x60030003)
    String GetEnrollmentServerUrl();
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "GetRequestIdString", dispId = 0x60030004)
    String GetRequestIdString();
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "GetPropertyFlags", dispId = 0x60030005)
    EnrollmentPolicyServerPropertyFlags GetPropertyFlags();
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "GetUrlFlags", dispId = 0x60030006)
    PolicyServerUrlFlags GetUrlFlags();
            
    /**
     * <p>id(0x60030007)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "GetAuthentication", dispId = 0x60030007)
    X509EnrollmentAuthFlags GetAuthentication();
            
    /**
     * <p>id(0x60030008)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "GetEnrollmentServerAuthentication", dispId = 0x60030008)
    X509EnrollmentAuthFlags GetEnrollmentServerAuthentication();
            
    
}