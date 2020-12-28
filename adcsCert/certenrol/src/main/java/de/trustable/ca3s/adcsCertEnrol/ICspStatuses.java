
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Csp Status Collection Interface
 *
 * <p>uuid({728AB30A-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB30A-217D-11DA-B2A4-000E7BBB2B09}")
public interface ICspStatuses extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Property Item.
     *
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "ItemByIndex", dispId = 0x0)
    ICspStatus getItemByIndex(Integer Index);
            
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
     * @param pVal [in] {@code ICspStatus}
     */
    @ComMethod(name = "Add", dispId = 0x2)
    void Add(ICspStatus pVal);
            
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
     * Property Item.
     *
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param strCspName [in] {@code String}
     * @param strAlgorithmName [in] {@code String}
     */
    @ComProperty(name = "ItemByName", dispId = 0x60020006)
    ICspStatus getItemByName(String strCspName,
            String strAlgorithmName);
            
    /**
     * Property Item.
     *
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     * @param Ordinal [in] {@code Integer}
     */
    @ComProperty(name = "ItemByOrdinal", dispId = 0x60020007)
    ICspStatus getItemByOrdinal(Integer Ordinal);
            
    /**
     * Property Item.
     *
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     * @param strCspName [in] {@code String}
     * @param strAlgorithmName [in] {@code String}
     * @param Operations [in] {@code AlgorithmOperationFlags}
     */
    @ComProperty(name = "ItemByOperations", dispId = 0x60020008)
    ICspStatus getItemByOperations(String strCspName,
            String strAlgorithmName,
            AlgorithmOperationFlags Operations);
            
    /**
     * Property Item.
     *
     * <p>id(0x60020009)</p>
     * <p>vtableId(16)</p>
     * @param pCspStatus [in] {@code ICspStatus}
     */
    @ComProperty(name = "ItemByProvider", dispId = 0x60020009)
    ICspStatus getItemByProvider(ICspStatus pCspStatus);
            
    
}