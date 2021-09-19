
package de.trustable.ca3s.adcsCertAdmin;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IEnumCERTVIEWROW Interface
 *
 * <p>uuid({D1157F4C-5AF2-11D1-9BDC-00C04FB683FA})</p>
 */
@ComInterface(iid="{D1157F4C-5AF2-11D1-9BDC-00C04FB683FA}")
public interface IEnumCERTVIEWROW extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComMethod(name = "EnumCertViewColumn", dispId = 0x60020001)
    IEnumCERTVIEWCOLUMN EnumCertViewColumn();
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param Flags [in] {@code Integer}
     */
    @ComMethod(name = "EnumCertViewAttribute", dispId = 0x60020002)
    IEnumCERTVIEWATTRIBUTE EnumCertViewAttribute(Integer Flags);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     * @param Flags [in] {@code Integer}
     */
    @ComMethod(name = "EnumCertViewExtension", dispId = 0x60020003)
    IEnumCERTVIEWEXTENSION EnumCertViewExtension(Integer Flags);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param celt [in] {@code Integer}
     */
    @ComMethod(name = "Skip", dispId = 0x60020004)
    void Skip(Integer celt);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x60020005)
    void Reset();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "Clone", dispId = 0x60020006)
    IEnumCERTVIEWROW Clone();
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "GetMaxIndex", dispId = 0x60020007)
    Integer GetMaxIndex();
            
    
}