
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.509 MachineEnrollmentFactory Interface
 *
 * <p>uuid({728AB352-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB352-217D-11DA-B2A4-000E7BBB2B09}")
public interface IX509MachineEnrollmentFactory extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param strProgID [in] {@code String}
     */
    @ComMethod(name = "CreateObject", dispId = 0x60020000)
    IX509EnrollmentHelper CreateObject(String strProgID);
            
    
}