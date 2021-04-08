
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * X.509 Web Service Policy Server Class
 *
 * <p>uuid({91F39028-217F-11DA-B2A4-000E7BBB2B09})</p>
 * <p>interface(IX509EnrollmentPolicyServer)</p>
 */
@ComObject(clsId = "{91F39028-217F-11DA-B2A4-000E7BBB2B09}")
public interface CX509EnrollmentPolicyWebService extends IUnknown
    ,IX509EnrollmentPolicyServer
{

}