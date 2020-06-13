
package de.trustable.ca3s.adcsCertAdmin;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * OCSPPropertyCollection Class
 *
 * <p>uuid({F935A528-BA8A-4DD9-BA79-F283275CB2DE})</p>
 * <p>interface(IOCSPPropertyCollection)</p>
 */
@ComObject(clsId = "{F935A528-BA8A-4DD9-BA79-F283275CB2DE}")
public interface OCSPPropertyCollection extends IUnknown
    ,IOCSPPropertyCollection
{

}