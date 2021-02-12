
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * ISmimeCapability Interface
 *
 * <p>uuid({728AB319-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB319-217D-11DA-B2A4-000E7BBB2B09}")
public interface ISmimeCapability extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param pObjectId [in] {@code IObjectId}
     * @param BitCount [in] {@code Integer}
     */
    @ComMethod(name = "Initialize", dispId = 0x60020000)
    void Initialize(IObjectId pObjectId,
            Integer BitCount);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "ObjectId", dispId = 0x60020001)
    IObjectId getObjectId();
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "BitCount", dispId = 0x60020002)
    Integer getBitCount();
            
    
}