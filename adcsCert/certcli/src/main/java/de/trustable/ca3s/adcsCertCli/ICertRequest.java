
package de.trustable.ca3s.adcsCertCli;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * ICertRequest Interface
 *
 * <p>uuid({014E4840-5523-11D0-8812-00A0C903B83C})</p>
 */
@ComInterface(iid="{014E4840-5523-11D0-8812-00A0C903B83C}")
public interface ICertRequest extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param Flags [in] {@code Integer}
     * @param strRequest [in] {@code String}
     * @param strAttributes [in] {@code String}
     * @param strConfig [in] {@code String}
     */
    @ComMethod(name = "Submit", dispId = 0x60020000)
    Integer Submit(Integer Flags,
            String strRequest,
            String strAttributes,
            String strConfig);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param RequestId [in] {@code Integer}
     * @param strConfig [in] {@code String}
     */
    @ComMethod(name = "RetrievePending", dispId = 0x60020001)
    Integer RetrievePending(Integer RequestId,
            String strConfig);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "GetLastStatus", dispId = 0x60020002)
    Integer GetLastStatus();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "GetRequestId", dispId = 0x60020003)
    Integer GetRequestId();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "GetDispositionMessage", dispId = 0x60020004)
    String GetDispositionMessage();
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     * @param fExchangeCertificate [in] {@code Integer}
     * @param strConfig [in] {@code String}
     * @param Flags [in] {@code Integer}
     */
    @ComMethod(name = "GetCACertificate", dispId = 0x60020005)
    String GetCACertificate(Integer fExchangeCertificate,
            String strConfig,
            Integer Flags);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param Flags [in] {@code Integer}
     */
    @ComMethod(name = "GetCertificate", dispId = 0x60020006)
    String GetCertificate(Integer Flags);
            
    
}