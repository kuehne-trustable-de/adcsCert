
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * Crypt Attribute Collection Class
 *
 * <p>uuid({884E202D-217D-11DA-B2A4-000E7BBB2B09})</p>
 * <p>interface(ICryptAttributes)</p>
 */
@ComObject(clsId = "{884E202D-217D-11DA-B2A4-000E7BBB2B09}")
public interface CCryptAttributes extends IUnknown
    ,ICryptAttributes
{

}