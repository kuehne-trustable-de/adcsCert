
package de.trustable.ca3s.adcsCertAdmin;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * ICertAdmin2 Interface
 *
 * <p>uuid({F7C3AC41-B8CE-4FB4-AA58-3D1DC0E36B39})</p>
 */
@ComInterface(iid="{F7C3AC41-B8CE-4FB4-AA58-3D1DC0E36B39}")
public interface ICertAdmin2 extends IUnknown, IRawDispatchHandle, IDispatch {
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
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(17)</p>
     * @param strConfig [in] {@code String}
     * @param Date [in] {@code java.util.Date}
     * @param CRLFlags [in] {@code Integer}
     */
    @ComMethod(name = "PublishCRLs", dispId = 0x60030000)
    void PublishCRLs(String strConfig,
            java.util.Date Date,
            Integer CRLFlags);
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(18)</p>
     * @param strConfig [in] {@code String}
     * @param PropId [in] {@code Integer}
     * @param PropIndex [in] {@code Integer}
     * @param PropType [in] {@code Integer}
     * @param Flags [in] {@code Integer}
     */
    @ComMethod(name = "GetCAProperty", dispId = 0x60030001)
    Object GetCAProperty(String strConfig,
            Integer PropId,
            Integer PropIndex,
            Integer PropType,
            Integer Flags);
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(19)</p>
     * @param strConfig [in] {@code String}
     * @param PropId [in] {@code Integer}
     * @param PropIndex [in] {@code Integer}
     * @param PropType [in] {@code Integer}
     * @param pvarPropertyValue [in] {@code Object}
     */
    @ComMethod(name = "SetCAProperty", dispId = 0x60030002)
    void SetCAProperty(String strConfig,
            Integer PropId,
            Integer PropIndex,
            Integer PropType,
            Object pvarPropertyValue);
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(20)</p>
     * @param strConfig [in] {@code String}
     * @param PropId [in] {@code Integer}
     */
    @ComMethod(name = "GetCAPropertyFlags", dispId = 0x60030003)
    Integer GetCAPropertyFlags(String strConfig,
            Integer PropId);
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(21)</p>
     * @param strConfig [in] {@code String}
     * @param PropId [in] {@code Integer}
     */
    @ComMethod(name = "GetCAPropertyDisplayName", dispId = 0x60030004)
    String GetCAPropertyDisplayName(String strConfig,
            Integer PropId);
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(22)</p>
     * @param strConfig [in] {@code String}
     * @param RequestId [in] {@code Integer}
     * @param Flags [in] {@code Integer}
     */
    @ComMethod(name = "GetArchivedKey", dispId = 0x60030005)
    String GetArchivedKey(String strConfig,
            Integer RequestId,
            Integer Flags);
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(23)</p>
     * @param strConfig [in] {@code String}
     * @param strNodePath [in] {@code String}
     * @param strEntryName [in] {@code String}
     */
    @ComMethod(name = "GetConfigEntry", dispId = 0x60030006)
    Object GetConfigEntry(String strConfig,
            String strNodePath,
            String strEntryName);
            
    /**
     * <p>id(0x60030007)</p>
     * <p>vtableId(24)</p>
     * @param strConfig [in] {@code String}
     * @param strNodePath [in] {@code String}
     * @param strEntryName [in] {@code String}
     * @param pvarEntry [in] {@code Object}
     */
    @ComMethod(name = "SetConfigEntry", dispId = 0x60030007)
    void SetConfigEntry(String strConfig,
            String strNodePath,
            String strEntryName,
            Object pvarEntry);
            
    /**
     * <p>id(0x60030008)</p>
     * <p>vtableId(25)</p>
     * @param strConfig [in] {@code String}
     * @param RequestId [in] {@code Integer}
     * @param strCertHash [in] {@code String}
     * @param Flags [in] {@code Integer}
     * @param strKey [in] {@code String}
     */
    @ComMethod(name = "ImportKey", dispId = 0x60030008)
    void ImportKey(String strConfig,
            Integer RequestId,
            String strCertHash,
            Integer Flags,
            String strKey);
            
    /**
     * <p>id(0x60030009)</p>
     * <p>vtableId(26)</p>
     * @param strConfig [in] {@code String}
     */
    @ComMethod(name = "GetMyRoles", dispId = 0x60030009)
    Integer GetMyRoles(String strConfig);
            
    /**
     * <p>id(0x6003000a)</p>
     * <p>vtableId(27)</p>
     * @param strConfig [in] {@code String}
     * @param Flags [in] {@code Integer}
     * @param Date [in] {@code java.util.Date}
     * @param Table [in] {@code Integer}
     * @param RowId [in] {@code Integer}
     */
    @ComMethod(name = "DeleteRow", dispId = 0x6003000a)
    Integer DeleteRow(String strConfig,
            Integer Flags,
            java.util.Date Date,
            Integer Table,
            Integer RowId);
            
    
}