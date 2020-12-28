
package de.trustable.ca3s.adcsCertAdmin;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * CertAdmin Class
 *
 * <p>uuid({37EABAF0-7FB6-11D0-8817-00A0C903B83C})</p>
 * <p>interface(ICertAdmin2)</p>
 */
@ComObject(clsId = "{37EABAF0-7FB6-11D0-8817-00A0C903B83C}")
public interface CCertAdmin extends IUnknown
    ,ICertAdmin2
{

}