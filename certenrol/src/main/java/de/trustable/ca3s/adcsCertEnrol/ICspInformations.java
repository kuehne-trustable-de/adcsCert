
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Csp Information Collection Interface
 *
 * <p>uuid({728AB308-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB308-217D-11DA-B2A4-000E7BBB2B09}")
public interface ICspInformations extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Property Item.
     *
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "ItemByIndex", dispId = 0x0)
    ICspInformation getItemByIndex(Integer Index);
            
    /**
     * Property Count.
     *
     * <p>id(0x1)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * Method Add.
     *
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     * @param pVal [in] {@code ICspInformation}
     */
    @ComMethod(name = "Add", dispId = 0x2)
    void Add(ICspInformation pVal);
            
    /**
     * Method Remove.
     *
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Remove", dispId = 0x3)
    void Remove(Integer Index);
            
    /**
     * Method Clear.
     *
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Clear", dispId = 0x4)
    void Clear();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "AddAvailableCsps", dispId = 0x60020006)
    void AddAvailableCsps();
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     * @param strName [in] {@code String}
     */
    @ComProperty(name = "ItemByName", dispId = 0x60020007)
    ICspInformation getItemByName(String strName);
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     * @param strProviderName [in] {@code String}
     * @param LegacyKeySpec [in] {@code X509KeySpec}
     */
    @ComMethod(name = "GetCspStatusFromProviderName", dispId = 0x60020008)
    ICspStatus GetCspStatusFromProviderName(String strProviderName,
            X509KeySpec LegacyKeySpec);
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(16)</p>
     * @param Operations [in] {@code AlgorithmOperationFlags}
     * @param pCspInformation [in] {@code ICspInformation}
     */
    @ComMethod(name = "GetCspStatusesFromOperations", dispId = 0x60020009)
    ICspStatuses GetCspStatusesFromOperations(AlgorithmOperationFlags Operations,
            ICspInformation pCspInformation);
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     * @param pCspInformation [in] {@code ICspInformation}
     */
    @ComMethod(name = "GetEncryptionCspAlgorithms", dispId = 0x6002000a)
    ICspAlgorithms GetEncryptionCspAlgorithms(ICspInformation pCspInformation);
            
    /**
     * <p>id(0x6002000b)</p>
     * <p>vtableId(18)</p>
     * @param pCspInformation [in] {@code ICspInformation}
     */
    @ComMethod(name = "GetHashAlgorithms", dispId = 0x6002000b)
    IObjectIds GetHashAlgorithms(ICspInformation pCspInformation);
            
    
}