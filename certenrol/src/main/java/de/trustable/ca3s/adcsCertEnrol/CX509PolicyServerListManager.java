
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * X.509 Policy Server List Manager Class
 *
 * <p>uuid({91F39029-217F-11DA-B2A4-000E7BBB2B09})</p>
 * <p>interface(IX509PolicyServerListManager)</p>
 */
@ComObject(clsId = "{91F39029-217F-11DA-B2A4-000E7BBB2B09}")
public interface CX509PolicyServerListManager extends IUnknown
    ,IX509PolicyServerListManager
{

}