
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Csp Status Interface
 *
 * <p>uuid({728AB309-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB309-217D-11DA-B2A4-000E7BBB2B09}")
public interface ICspStatus extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param pCsp [in] {@code ICspInformation}
     * @param pAlgorithm [in] {@code ICspAlgorithm}
     */
    @ComMethod(name = "Initialize", dispId = 0x60020000)
    void Initialize(ICspInformation pCsp,
            ICspAlgorithm pAlgorithm);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Ordinal", dispId = 0x60020001)
    Integer getOrdinal();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Ordinal", dispId = 0x60020001)
    void setOrdinal(Integer param0);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "CspAlgorithm", dispId = 0x60020003)
    ICspAlgorithm getCspAlgorithm();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "CspInformation", dispId = 0x60020004)
    ICspInformation getCspInformation();
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "EnrollmentStatus", dispId = 0x60020005)
    IX509EnrollmentStatus getEnrollmentStatus();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "DisplayName", dispId = 0x60020006)
    String getDisplayName();
            
    
}