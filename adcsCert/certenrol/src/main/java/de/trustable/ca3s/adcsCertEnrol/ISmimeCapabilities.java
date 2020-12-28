
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * ISmimeCapabilities Interface
 *
 * <p>uuid({728AB31A-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB31A-217D-11DA-B2A4-000E7BBB2B09}")
public interface ISmimeCapabilities extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Property Item.
     *
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "ItemByIndex", dispId = 0x0)
    ISmimeCapability getItemByIndex(Integer Index);
            
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
     * @param pVal [in] {@code ISmimeCapability}
     */
    @ComMethod(name = "Add", dispId = 0x2)
    void Add(ISmimeCapability pVal);
            
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
     * @param pValue [in] {@code ICspInformation}
     */
    @ComMethod(name = "AddFromCsp", dispId = 0x60020006)
    void AddFromCsp(ICspInformation pValue);
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     * @param MachineContext [in] {@code Boolean}
     */
    @ComMethod(name = "AddAvailableSmimeCapabilities", dispId = 0x60020007)
    void AddAvailableSmimeCapabilities(Boolean MachineContext);
            
    
}