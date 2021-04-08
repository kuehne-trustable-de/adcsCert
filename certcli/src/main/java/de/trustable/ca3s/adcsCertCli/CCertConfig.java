
package de.trustable.ca3s.adcsCertCli;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * CertConfig Class
 *
 * <p>uuid({372FCE38-4324-11D0-8810-00A0C903B83C})</p>
 * <p>interface(ICertConfig2)</p>
 */
@ComObject(clsId = "{372FCE38-4324-11D0-8810-00A0C903B83C}")
public interface CCertConfig extends IUnknown
    ,ICertConfig2
{

}