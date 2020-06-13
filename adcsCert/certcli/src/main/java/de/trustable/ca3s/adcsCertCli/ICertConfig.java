
package de.trustable.ca3s.adcsCertCli;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * ICertConfig Interface
 *
 * <p>uuid({372FCE34-4324-11D0-8810-00A0C903B83C})</p>
 */
@ComInterface(iid="{372FCE34-4324-11D0-8810-00A0C903B83C}")
public interface ICertConfig extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Reset", dispId = 0x60020000)
    Integer Reset(Integer Index);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComMethod(name = "Next", dispId = 0x60020001)
    Integer Next();
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param strFieldName [in] {@code String}
     */
    @ComMethod(name = "GetField", dispId = 0x60020002)
    String GetField(String strFieldName);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     * @param Flags [in] {@code Integer}
     */
    @ComMethod(name = "GetConfig", dispId = 0x60020003)
    String GetConfig(Integer Flags);
            
    
}