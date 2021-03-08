
package de.trustable.ca3s.adcsCertCli;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * CertGetConfig Class
 *
 * <p>uuid({C6CC49B0-CE17-11D0-8833-00A0C903B83C})</p>
 * <p>interface(ICertGetConfig)</p>
 */
@ComObject(clsId = "{C6CC49B0-CE17-11D0-8833-00A0C903B83C}")
public interface CCertGetConfig extends IUnknown
    ,ICertGetConfig
{

}