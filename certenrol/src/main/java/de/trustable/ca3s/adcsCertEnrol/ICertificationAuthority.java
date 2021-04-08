
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Certification Authority Interface
 *
 * <p>uuid({835D1F61-1E95-4BC8-B4D3-976C42B968F7})</p>
 */
@ComInterface(iid="{835D1F61-1E95-4BC8-B4D3-976C42B968F7}")
public interface ICertificationAuthority extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param Property [in] {@code EnrollmentCAProperty}
     */
    @ComProperty(name = "Property", dispId = 0x60020000)
    Object getProperty(EnrollmentCAProperty Property);
            
    
}