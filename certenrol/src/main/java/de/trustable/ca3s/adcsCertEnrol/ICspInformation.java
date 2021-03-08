
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Csp Information Interface
 *
 * <p>uuid({728AB307-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB307-217D-11DA-B2A4-000E7BBB2B09}")
public interface ICspInformation extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param strName [in] {@code String}
     */
    @ComMethod(name = "InitializeFromName", dispId = 0x60020000)
    void InitializeFromName(String strName);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param Type [in] {@code X509ProviderType}
     * @param pAlgorithm [in] {@code IObjectId}
     * @param MachineContext [in] {@code Boolean}
     */
    @ComMethod(name = "InitializeFromType", dispId = 0x60020001)
    void InitializeFromType(X509ProviderType Type,
            IObjectId pAlgorithm,
            Boolean MachineContext);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "CspAlgorithms", dispId = 0x60020002)
    ICspAlgorithms getCspAlgorithms();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "HasHardwareRandomNumberGenerator", dispId = 0x60020003)
    Boolean getHasHardwareRandomNumberGenerator();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "IsHardwareDevice", dispId = 0x60020004)
    Boolean getIsHardwareDevice();
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "IsRemovable", dispId = 0x60020005)
    Boolean getIsRemovable();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "IsSoftwareDevice", dispId = 0x60020006)
    Boolean getIsSoftwareDevice();
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Valid", dispId = 0x60020007)
    Boolean getValid();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "MaxKeyContainerNameLength", dispId = 0x60020008)
    Integer getMaxKeyContainerNameLength();
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60020009)
    String getName();
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6002000a)
    X509ProviderType getType();
            
    /**
     * <p>id(0x6002000b)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Version", dispId = 0x6002000b)
    Integer getVersion();
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "KeySpec", dispId = 0x6002000c)
    X509KeySpec getKeySpec();
            
    /**
     * <p>id(0x6002000d)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "IsSmartCard", dispId = 0x6002000d)
    Boolean getIsSmartCard();
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(21)</p>
     * @param MachineContext [in] {@code Boolean}
     */
    @ComMethod(name = "GetDefaultSecurityDescriptor", dispId = 0x6002000e)
    String GetDefaultSecurityDescriptor(Boolean MachineContext);
            
    /**
     * <p>id(0x6002000f)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "LegacyCsp", dispId = 0x6002000f)
    Boolean getLegacyCsp();
            
    /**
     * <p>id(0x60020010)</p>
     * <p>vtableId(23)</p>
     * @param pAlgorithm [in] {@code IObjectId}
     * @param Operations [in] {@code AlgorithmOperationFlags}
     */
    @ComMethod(name = "GetCspStatusFromOperations", dispId = 0x60020010)
    ICspStatus GetCspStatusFromOperations(IObjectId pAlgorithm,
            AlgorithmOperationFlags Operations);
            
    
}