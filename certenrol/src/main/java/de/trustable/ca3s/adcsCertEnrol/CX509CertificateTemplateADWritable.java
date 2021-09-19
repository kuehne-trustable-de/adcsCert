
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * X.509 Certificate Template AD Writable Class
 *
 * <p>uuid({8336E323-2E6A-4A04-937C-548F681839B3})</p>
 * <p>interface(IX509CertificateTemplateWritable)</p>
 */
@ComObject(clsId = "{8336E323-2E6A-4A04-937C-548F681839B3}")
public interface CX509CertificateTemplateADWritable extends IUnknown
    ,IX509CertificateTemplateWritable
{

}