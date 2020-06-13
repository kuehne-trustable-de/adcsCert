
package de.trustable.ca3s.adcsCertCli;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * CertServerPolicy Class
 *
 * <p>uuid({AA000926-FFBE-11CF-8800-00A0C903B83C})</p>
 * <p>interface(ICertServerPolicy)</p>
 */
@ComObject(clsId = "{AA000926-FFBE-11CF-8800-00A0C903B83C}")
public interface CCertServerPolicy extends IUnknown
    ,ICertServerPolicy
{

}