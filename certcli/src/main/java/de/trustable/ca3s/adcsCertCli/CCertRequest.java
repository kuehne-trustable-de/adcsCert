
package de.trustable.ca3s.adcsCertCli;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * CertRequest Class
 *
 * <p>uuid({98AFF3F0-5524-11D0-8812-00A0C903B83C})</p>
 * <p>interface(ICertRequest3)</p>
 */
@ComObject(clsId = "{98AFF3F0-5524-11D0-8812-00A0C903B83C}")
public interface CCertRequest extends IUnknown
    ,ICertRequest3
{

}