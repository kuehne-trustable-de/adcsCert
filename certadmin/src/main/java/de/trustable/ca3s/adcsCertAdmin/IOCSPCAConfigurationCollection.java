
package de.trustable.ca3s.adcsCertAdmin;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IOCSPCAConfigurationCollection Interface
 *
 * <p>uuid({2BEBEA0B-5ECE-4F28-A91C-86B4BB20F0D3})</p>
 */
@ComInterface(iid="{2BEBEA0B-5ECE-4F28-A91C-86B4BB20F0D3}")
public interface IOCSPCAConfigurationCollection extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * @param bstrIdentifier [in] {@code String}
     */
    @ComProperty(name = "ItemByName", dispId = 0x2)
    Object getItemByName(String bstrIdentifier);
            
    /**
     * method CreateCAConfiguration
     *
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     * @param bstrIdentifier [in] {@code String}
     * @param varCACert [in] {@code Object}
     */
    @ComMethod(name = "CreateCAConfiguration", dispId = 0x3)
    IOCSPCAConfiguration CreateCAConfiguration(String bstrIdentifier,
            Object varCACert);
            
    /**
     * method DeleteCAConfiguration
     *
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     * @param bstrIdentifier [in] {@code String}
     */
    @ComMethod(name = "DeleteCAConfiguration", dispId = 0x4)
    void DeleteCAConfiguration(String bstrIdentifier);
            
    
}