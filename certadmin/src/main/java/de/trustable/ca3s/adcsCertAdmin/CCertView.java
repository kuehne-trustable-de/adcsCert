
package de.trustable.ca3s.adcsCertAdmin;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * CertView Class
 *
 * <p>uuid({A12D0F7A-1E84-11D1-9BD6-00C04FB683FA})</p>
 * <p>interface(ICertView2)</p>
 */
@ComObject(clsId = "{A12D0F7A-1E84-11D1-9BD6-00C04FB683FA}")
public interface CCertView extends IUnknown
    ,ICertView2
{

}