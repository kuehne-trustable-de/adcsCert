
package de.trustable.ca3s.adcsCertCli;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * CertServerExit Class
 *
 * <p>uuid({4C4A5E40-732C-11D0-8816-00A0C903B83C})</p>
 * <p>interface(ICertServerExit)</p>
 */
@ComObject(clsId = "{4C4A5E40-732C-11D0-8816-00A0C903B83C}")
public interface CCertServerExit extends IUnknown
    ,ICertServerExit
{

}