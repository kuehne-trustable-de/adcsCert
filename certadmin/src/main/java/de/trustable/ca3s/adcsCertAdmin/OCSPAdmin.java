
package de.trustable.ca3s.adcsCertAdmin;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * OCSPAdmin Class
 *
 * <p>uuid({D3F73511-92C9-47CB-8FF2-8D891A7C4DE4})</p>
 * <p>interface(IOCSPAdmin)</p>
 */
@ComObject(clsId = "{D3F73511-92C9-47CB-8FF2-8D891A7C4DE4}")
public interface OCSPAdmin extends IUnknown
    ,IOCSPAdmin
{

}