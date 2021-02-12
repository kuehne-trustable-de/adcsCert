
package de.trustable.ca3s.adcsCertCli;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * ICertGetConfig Interface
 *
 * <p>uuid({C7EA09C0-CE17-11D0-8833-00A0C903B83C})</p>
 */
@ComInterface(iid="{C7EA09C0-CE17-11D0-8833-00A0C903B83C}")
public interface ICertGetConfig extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param Flags [in] {@code Integer}
     */
    @ComMethod(name = "GetConfig", dispId = 0x60020000)
    String GetConfig(Integer Flags);
            
    
}