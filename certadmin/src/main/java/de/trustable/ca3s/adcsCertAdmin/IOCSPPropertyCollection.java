
package de.trustable.ca3s.adcsCertAdmin;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IOCSPPropertyCollection Interface
 *
 * <p>uuid({2597C18D-54E6-4B74-9FA9-A6BFDA99CBBE})</p>
 */
@ComInterface(iid="{2597C18D-54E6-4B74-9FA9-A6BFDA99CBBE}")
public interface IOCSPPropertyCollection extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * property Item
     *
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "Item", dispId = 0x0)
    Object getItem(Integer Index);
            
    /**
     * property Count
     *
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * property ItemByName
     *
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     * @param bstrPropName [in] {@code String}
     */
    @ComProperty(name = "ItemByName", dispId = 0x2)
    Object getItemByName(String bstrPropName);
            
    /**
     * method CreateProperty
     *
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     * @param bstrPropName [in] {@code String}
     * @param pVarPropValue [in] {@code Object}
     */
    @ComMethod(name = "CreateProperty", dispId = 0x3)
    IOCSPProperty CreateProperty(String bstrPropName,
            Object pVarPropValue);
            
    /**
     * method DeleteProperty
     *
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     * @param bstrPropName [in] {@code String}
     */
    @ComMethod(name = "DeleteProperty", dispId = 0x4)
    void DeleteProperty(String bstrPropName);
            
    /**
     * method InitializeFromProperties
     *
     * <p>id(0x5)</p>
     * <p>vtableId(13)</p>
     * @param pVarProperties [in] {@code Object}
     */
    @ComMethod(name = "InitializeFromProperties", dispId = 0x5)
    void InitializeFromProperties(Object pVarProperties);
            
    /**
     * method GetAllProperties
     *
     * <p>id(0x6)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "GetAllProperties", dispId = 0x6)
    Object GetAllProperties();
            
    
}