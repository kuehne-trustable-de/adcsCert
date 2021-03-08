
package de.trustable.ca3s.adcsCertAdmin;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * ICertAdmin Interface
 *
 * <p>uuid({34DF6950-7FB6-11D0-8817-00A0C903B83C})</p>
 */
@ComInterface(iid="{34DF6950-7FB6-11D0-8817-00A0C903B83C}")
public interface ICertAdmin extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param strConfig [in] {@code String}
     * @param strSerialNumber [in] {@code String}
     */
    @ComMethod(name = "IsValidCertificate", dispId = 0x60020000)
    Integer IsValidCertificate(String strConfig,
            String strSerialNumber);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComMethod(name = "GetRevocationReason", dispId = 0x60020001)
    Integer GetRevocationReason();
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param strConfig [in] {@code String}
     * @param strSerialNumber [in] {@code String}
     * @param Reason [in] {@code Integer}
     * @param Date [in] {@code java.util.Date}
     */
    @ComMethod(name = "RevokeCertificate", dispId = 0x60020002)
    void RevokeCertificate(String strConfig,
            String strSerialNumber,
            Integer Reason,
            java.util.Date Date);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     * @param strConfig [in] {@code String}
     * @param RequestId [in] {@code Integer}
     * @param strAttributes [in] {@code String}
     */
    @ComMethod(name = "SetRequestAttributes", dispId = 0x60020003)
    void SetRequestAttributes(String strConfig,
            Integer RequestId,
            String strAttributes);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param strConfig [in] {@code String}
     * @param RequestId [in] {@code Integer}
     * @param strExtensionName [in] {@code String}
     * @param Type [in] {@code Integer}
     * @param Flags [in] {@code Integer}
     * @param pvarValue [in] {@code Object}
     */
    @ComMethod(name = "SetCertificateExtension", dispId = 0x60020004)
    void SetCertificateExtension(String strConfig,
            Integer RequestId,
            String strExtensionName,
            Integer Type,
            Integer Flags,
            Object pvarValue);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     * @param strConfig [in] {@code String}
     * @param RequestId [in] {@code Integer}
     */
    @ComMethod(name = "DenyRequest", dispId = 0x60020005)
    void DenyRequest(String strConfig,
            Integer RequestId);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param strConfig [in] {@code String}
     * @param RequestId [in] {@code Integer}
     */
    @ComMethod(name = "ResubmitRequest", dispId = 0x60020006)
    Integer ResubmitRequest(String strConfig,
            Integer RequestId);
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     * @param strConfig [in] {@code String}
     * @param Date [in] {@code java.util.Date}
     */
    @ComMethod(name = "PublishCRL", dispId = 0x60020007)
    void PublishCRL(String strConfig,
            java.util.Date Date);
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     * @param strConfig [in] {@code String}
     * @param Flags [in] {@code Integer}
     */
    @ComMethod(name = "GetCRL", dispId = 0x60020008)
    String GetCRL(String strConfig,
            Integer Flags);
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(16)</p>
     * @param strConfig [in] {@code String}
     * @param strCertificate [in] {@code String}
     * @param Flags [in] {@code Integer}
     */
    @ComMethod(name = "ImportCertificate", dispId = 0x60020009)
    Integer ImportCertificate(String strConfig,
            String strCertificate,
            Integer Flags);
            
    
}