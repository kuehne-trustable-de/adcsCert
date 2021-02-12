
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Crypt Attribute Interface
 *
 * <p>uuid({728AB32C-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB32C-217D-11DA-B2A4-000E7BBB2B09}")
public interface ICryptAttribute extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param pObjectId [in] {@code IObjectId}
     */
    @ComMethod(name = "InitializeFromObjectId", dispId = 0x60020000)
    void InitializeFromObjectId(IObjectId pObjectId);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param pAttributes [in] {@code IX509Attributes}
     */
    @ComMethod(name = "InitializeFromValues", dispId = 0x60020001)
    void InitializeFromValues(IX509Attributes pAttributes);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "ObjectId", dispId = 0x60020002)
    IObjectId getObjectId();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Values", dispId = 0x60020003)
    IX509Attributes getValues();
            
    
}