
package de.trustable.ca3s.adcsCertCli;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * ICertRequest2 Interface
 *
 * <p>uuid({A4772988-4A85-4FA9-824E-B5CF5C16405A})</p>
 */
@ComInterface(iid="{A4772988-4A85-4FA9-824E-B5CF5C16405A}")
public interface ICertRequest2 extends IUnknown, IRawDispatchHandle, IDispatch {
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
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(14)</p>
     * @param strConfig [in] {@code String}
     * @param RequestId [in] {@code Integer}
     * @param strSerialNumber [in] {@code String}
     */
    @ComMethod(name = "GetIssuedCertificate", dispId = 0x60030000)
    Integer GetIssuedCertificate(String strConfig,
            Integer RequestId,
            String strSerialNumber);
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(15)</p>
     * @param hrMessage [in] {@code Integer}
     * @param Flags [in] {@code Integer}
     */
    @ComMethod(name = "GetErrorMessageText", dispId = 0x60030001)
    String GetErrorMessageText(Integer hrMessage,
            Integer Flags);
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(16)</p>
     * @param strConfig [in] {@code String}
     * @param PropId [in] {@code Integer}
     * @param PropIndex [in] {@code Integer}
     * @param PropType [in] {@code Integer}
     * @param Flags [in] {@code Integer}
     */
    @ComMethod(name = "GetCAProperty", dispId = 0x60030002)
    Object GetCAProperty(String strConfig,
            Integer PropId,
            Integer PropIndex,
            Integer PropType,
            Integer Flags);
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(17)</p>
     * @param strConfig [in] {@code String}
     * @param PropId [in] {@code Integer}
     */
    @ComMethod(name = "GetCAPropertyFlags", dispId = 0x60030003)
    Integer GetCAPropertyFlags(String strConfig,
            Integer PropId);
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(18)</p>
     * @param strConfig [in] {@code String}
     * @param PropId [in] {@code Integer}
     */
    @ComMethod(name = "GetCAPropertyDisplayName", dispId = 0x60030004)
    String GetCAPropertyDisplayName(String strConfig,
            Integer PropId);
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(19)</p>
     * @param PropId [in] {@code Integer}
     * @param PropIndex [in] {@code Integer}
     * @param PropType [in] {@code Integer}
     * @param Flags [in] {@code Integer}
     */
    @ComMethod(name = "GetFullResponseProperty", dispId = 0x60030005)
    Object GetFullResponseProperty(Integer PropId,
            Integer PropIndex,
            Integer PropType,
            Integer Flags);
            
    
}