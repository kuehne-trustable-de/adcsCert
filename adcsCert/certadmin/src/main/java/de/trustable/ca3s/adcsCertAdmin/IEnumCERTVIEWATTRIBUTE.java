
package de.trustable.ca3s.adcsCertAdmin;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IEnumCERTVIEWATTRIBUTE Interface
 *
 * <p>uuid({E77DB656-7653-11D1-9BDE-00C04FB683FA})</p>
 */
@ComInterface(iid="{E77DB656-7653-11D1-9BDE-00C04FB683FA}")
public interface IEnumCERTVIEWATTRIBUTE extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComMethod(name = "Next", dispId = 0x60020000)
    Integer Next();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComMethod(name = "GetName", dispId = 0x60020001)
    String GetName();
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "GetValue", dispId = 0x60020002)
    String GetValue();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     * @param celt [in] {@code Integer}
     */
    @ComMethod(name = "Skip", dispId = 0x60020003)
    void Skip(Integer celt);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x60020004)
    void Reset();
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Clone", dispId = 0x60020005)
    IEnumCERTVIEWATTRIBUTE Clone();
            
    
}