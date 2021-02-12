
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.509 Private Key Interface
 *
 * <p>uuid({728AB30C-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB30C-217D-11DA-B2A4-000E7BBB2B09}")
public interface IX509PrivateKey extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComMethod(name = "Open", dispId = 0x60020000)
    void Open();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComMethod(name = "Create", dispId = 0x60020001)
    void Create();
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "Close", dispId = 0x60020002)
    void Close();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x60020003)
    void Delete();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param VerifyType [in] {@code X509PrivateKeyVerify}
     */
    @ComMethod(name = "Verify", dispId = 0x60020004)
    void Verify(X509PrivateKeyVerify VerifyType);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     * @param strExportType [in] {@code String}
     * @param strEncodedKey [in] {@code String}
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComMethod(name = "Import", dispId = 0x60020005)
    void Import(String strExportType,
            String strEncodedKey,
            EncodingType Encoding);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param strExportType [in] {@code String}
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComMethod(name = "Export", dispId = 0x60020006)
    String Export(String strExportType,
            EncodingType Encoding);
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "ExportPublicKey", dispId = 0x60020007)
    IX509PublicKey ExportPublicKey();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "ContainerName", dispId = 0x60020008)
    String getContainerName();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ContainerName", dispId = 0x60020008)
    void setContainerName(String param0);
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "ContainerNamePrefix", dispId = 0x6002000a)
    String getContainerNamePrefix();
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ContainerNamePrefix", dispId = 0x6002000a)
    void setContainerNamePrefix(String param0);
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "ReaderName", dispId = 0x6002000c)
    String getReaderName();
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ReaderName", dispId = 0x6002000c)
    void setReaderName(String param0);
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "CspInformations", dispId = 0x6002000e)
    ICspInformations getCspInformations();
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code ICspInformations}
     */
    @ComProperty(name = "CspInformations", dispId = 0x6002000e)
    void setCspInformations(ICspInformations param0);
            
    /**
     * <p>id(0x60020010)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "CspStatus", dispId = 0x60020010)
    ICspStatus getCspStatus();
            
    /**
     * <p>id(0x60020010)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code ICspStatus}
     */
    @ComProperty(name = "CspStatus", dispId = 0x60020010)
    void setCspStatus(ICspStatus param0);
            
    /**
     * <p>id(0x60020012)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "ProviderName", dispId = 0x60020012)
    String getProviderName();
            
    /**
     * <p>id(0x60020012)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ProviderName", dispId = 0x60020012)
    void setProviderName(String param0);
            
    /**
     * <p>id(0x60020014)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "ProviderType", dispId = 0x60020014)
    X509ProviderType getProviderType();
            
    /**
     * <p>id(0x60020014)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code X509ProviderType}
     */
    @ComProperty(name = "ProviderType", dispId = 0x60020014)
    void setProviderType(X509ProviderType param0);
            
    /**
     * <p>id(0x60020016)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "LegacyCsp", dispId = 0x60020016)
    Boolean getLegacyCsp();
            
    /**
     * <p>id(0x60020016)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "LegacyCsp", dispId = 0x60020016)
    void setLegacyCsp(Boolean param0);
            
    /**
     * <p>id(0x60020018)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Algorithm", dispId = 0x60020018)
    IObjectId getAlgorithm();
            
    /**
     * <p>id(0x60020018)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code IObjectId}
     */
    @ComProperty(name = "Algorithm", dispId = 0x60020018)
    void setAlgorithm(IObjectId param0);
            
    /**
     * <p>id(0x6002001a)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "KeySpec", dispId = 0x6002001a)
    X509KeySpec getKeySpec();
            
    /**
     * <p>id(0x6002001a)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code X509KeySpec}
     */
    @ComProperty(name = "KeySpec", dispId = 0x6002001a)
    void setKeySpec(X509KeySpec param0);
            
    /**
     * <p>id(0x6002001c)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "Length", dispId = 0x6002001c)
    Integer getLength();
            
    /**
     * <p>id(0x6002001c)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Length", dispId = 0x6002001c)
    void setLength(Integer param0);
            
    /**
     * <p>id(0x6002001e)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "ExportPolicy", dispId = 0x6002001e)
    X509PrivateKeyExportFlags getExportPolicy();
            
    /**
     * <p>id(0x6002001e)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code X509PrivateKeyExportFlags}
     */
    @ComProperty(name = "ExportPolicy", dispId = 0x6002001e)
    void setExportPolicy(X509PrivateKeyExportFlags param0);
            
    /**
     * <p>id(0x60020020)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "KeyUsage", dispId = 0x60020020)
    X509PrivateKeyUsageFlags getKeyUsage();
            
    /**
     * <p>id(0x60020020)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code X509PrivateKeyUsageFlags}
     */
    @ComProperty(name = "KeyUsage", dispId = 0x60020020)
    void setKeyUsage(X509PrivateKeyUsageFlags param0);
            
    /**
     * <p>id(0x60020022)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "KeyProtection", dispId = 0x60020022)
    X509PrivateKeyProtection getKeyProtection();
            
    /**
     * <p>id(0x60020022)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code X509PrivateKeyProtection}
     */
    @ComProperty(name = "KeyProtection", dispId = 0x60020022)
    void setKeyProtection(X509PrivateKeyProtection param0);
            
    /**
     * <p>id(0x60020024)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "MachineContext", dispId = 0x60020024)
    Boolean getMachineContext();
            
    /**
     * <p>id(0x60020024)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MachineContext", dispId = 0x60020024)
    void setMachineContext(Boolean param0);
            
    /**
     * <p>id(0x60020026)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "SecurityDescriptor", dispId = 0x60020026)
    String getSecurityDescriptor();
            
    /**
     * <p>id(0x60020026)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SecurityDescriptor", dispId = 0x60020026)
    void setSecurityDescriptor(String param0);
            
    /**
     * <p>id(0x60020028)</p>
     * <p>vtableId(47)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "Certificate", dispId = 0x60020028)
    String getCertificate(EncodingType Encoding);
            
    /**
     * <p>id(0x60020028)</p>
     * <p>vtableId(48)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     * @param param1 [in] {@code String}
     */
    @ComProperty(name = "Certificate", dispId = 0x60020028)
    void setCertificate(EncodingType Encoding,
            String param1);
            
    /**
     * <p>id(0x6002002a)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "UniqueContainerName", dispId = 0x6002002a)
    String getUniqueContainerName();
            
    /**
     * <p>id(0x6002002b)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "Opened", dispId = 0x6002002b)
    Boolean getOpened();
            
    /**
     * <p>id(0x6002002c)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "DefaultContainer", dispId = 0x6002002c)
    Boolean getDefaultContainer();
            
    /**
     * <p>id(0x6002002d)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "Existing", dispId = 0x6002002d)
    Boolean getExisting();
            
    /**
     * <p>id(0x6002002d)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Existing", dispId = 0x6002002d)
    void setExisting(Boolean param0);
            
    /**
     * <p>id(0x6002002f)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "Silent", dispId = 0x6002002f)
    Boolean getSilent();
            
    /**
     * <p>id(0x6002002f)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Silent", dispId = 0x6002002f)
    void setSilent(Boolean param0);
            
    /**
     * <p>id(0x60020031)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "ParentWindow", dispId = 0x60020031)
    Integer getParentWindow();
            
    /**
     * <p>id(0x60020031)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ParentWindow", dispId = 0x60020031)
    void setParentWindow(Integer param0);
            
    /**
     * <p>id(0x60020033)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "UIContextMessage", dispId = 0x60020033)
    String getUIContextMessage();
            
    /**
     * <p>id(0x60020033)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "UIContextMessage", dispId = 0x60020033)
    void setUIContextMessage(String param0);
            
    /**
     * <p>id(0x60020035)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Pin", dispId = 0x60020035)
    void setPin(String param0);
            
    /**
     * <p>id(0x60020036)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "FriendlyName", dispId = 0x60020036)
    String getFriendlyName();
            
    /**
     * <p>id(0x60020036)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FriendlyName", dispId = 0x60020036)
    void setFriendlyName(String param0);
            
    /**
     * <p>id(0x60020038)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "Description", dispId = 0x60020038)
    String getDescription();
            
    /**
     * <p>id(0x60020038)</p>
     * <p>vtableId(64)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Description", dispId = 0x60020038)
    void setDescription(String param0);
            
    
}