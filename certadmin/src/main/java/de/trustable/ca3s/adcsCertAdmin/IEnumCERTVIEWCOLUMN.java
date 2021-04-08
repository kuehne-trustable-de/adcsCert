
package de.trustable.ca3s.adcsCertAdmin;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IEnumCERTVIEWCOLUMN Interface
 *
 * <p>uuid({9C735BE2-57A5-11D1-9BDB-00C04FB683FA})</p>
 */
@ComInterface(iid="{9C735BE2-57A5-11D1-9BDB-00C04FB683FA}")
public interface IEnumCERTVIEWCOLUMN extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComMethod(name = "GetDisplayName", dispId = 0x60020002)
    String GetDisplayName();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "GetType", dispId = 0x60020003)
    Integer GetType();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "IsIndexed", dispId = 0x60020004)
    Integer IsIndexed();
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "GetMaxLength", dispId = 0x60020005)
    Integer GetMaxLength();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param Flags [in] {@code Integer}
     */
    @ComMethod(name = "GetValue", dispId = 0x60020006)
    Object GetValue(Integer Flags);
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     * @param celt [in] {@code Integer}
     */
    @ComMethod(name = "Skip", dispId = 0x60020007)
    void Skip(Integer celt);
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x60020008)
    void Reset();
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Clone", dispId = 0x60020009)
    IEnumCERTVIEWCOLUMN Clone();
            
    
}