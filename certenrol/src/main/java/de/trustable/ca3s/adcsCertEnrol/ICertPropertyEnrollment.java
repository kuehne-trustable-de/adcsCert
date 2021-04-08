
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * ICertPropertyEnrollment Interface
 *
 * <p>uuid({728AB339-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB339-217D-11DA-B2A4-000E7BBB2B09}")
public interface ICertPropertyEnrollment extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * @param RequestId [in] {@code Integer}
     * @param strCADnsName [in] {@code String}
     * @param strCAName [in] {@code String}
     * @param strFriendlyName [in, optional] {@code String}
     */
    @ComMethod(name = "Initialize", dispId = 0x60030000)
    void Initialize(Integer RequestId,
            String strCADnsName,
            String strCAName,
            String strFriendlyName);
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "RequestId", dispId = 0x60030001)
    Integer getRequestId();
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "CADnsName", dispId = 0x60030002)
    String getCADnsName();
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "CAName", dispId = 0x60030003)
    String getCAName();
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "FriendlyName", dispId = 0x60030004)
    String getFriendlyName();
            
    
}