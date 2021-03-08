
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.509 Enrollment Status Interface
 *
 * <p>uuid({728AB304-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB304-217D-11DA-B2A4-000E7BBB2B09}")
public interface IX509EnrollmentStatus extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param strText [in] {@code String}
     */
    @ComMethod(name = "AppendText", dispId = 0x60020000)
    void AppendText(String strText);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Text", dispId = 0x60020001)
    String getText();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x60020001)
    void setText(String param0);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Selected", dispId = 0x60020003)
    EnrollmentSelectionStatus getSelected();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code EnrollmentSelectionStatus}
     */
    @ComProperty(name = "Selected", dispId = 0x60020003)
    void setSelected(EnrollmentSelectionStatus param0);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Display", dispId = 0x60020005)
    EnrollmentDisplayStatus getDisplay();
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code EnrollmentDisplayStatus}
     */
    @ComProperty(name = "Display", dispId = 0x60020005)
    void setDisplay(EnrollmentDisplayStatus param0);
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Status", dispId = 0x60020007)
    EnrollmentEnrollStatus getStatus();
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code EnrollmentEnrollStatus}
     */
    @ComProperty(name = "Status", dispId = 0x60020007)
    void setStatus(EnrollmentEnrollStatus param0);
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Error", dispId = 0x60020009)
    com.sun.jna.platform.win32.WinNT.HRESULT getError();
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code com.sun.jna.platform.win32.WinNT.HRESULT}
     */
    @ComProperty(name = "Error", dispId = 0x60020009)
    void setError(com.sun.jna.platform.win32.WinNT.HRESULT param0);
            
    /**
     * <p>id(0x6002000b)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "ErrorText", dispId = 0x6002000b)
    String getErrorText();
            
    
}