
package de.trustable.ca3s.adcsCertAdmin;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IOCSPProperty Interface
 *
 * <p>uuid({66FB7839-5F04-4C25-AD18-9FF1A8376EE0})</p>
 */
@ComInterface(iid="{66FB7839-5F04-4C25-AD18-9FF1A8376EE0}")
public interface IOCSPProperty extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * property Name
     *
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Name", dispId = 0x1)
    String getName();
            
    /**
     * property Value
     *
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Value", dispId = 0x2)
    Object getValue();
            
    /**
     * property Value
     *
     * <p>id(0x2)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x2)
    void setValue(Object param0);
            
    /**
     * property Modified
     *
     * <p>id(0x3)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Modified", dispId = 0x3)
    Boolean getModified();
            
    
}