
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.509 Certificate Template Interface
 *
 * <p>uuid({54244A13-555A-4E22-896D-1B0E52F76406})</p>
 */
@ComInterface(iid="{54244A13-555A-4E22-896D-1B0E52F76406}")
public interface IX509CertificateTemplate extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param Property [in] {@code EnrollmentTemplateProperty}
     */
    @ComProperty(name = "Property", dispId = 0x60020000)
    Object getProperty(EnrollmentTemplateProperty Property);
            
    
}