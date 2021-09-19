
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * X.509 Certificate Request Pkcs7 Class
 *
 * <p>uuid({884E2044-217D-11DA-B2A4-000E7BBB2B09})</p>
 * <p>interface(IX509CertificateRequestPkcs7V2)</p>
 */
@ComObject(clsId = "{884E2044-217D-11DA-B2A4-000E7BBB2B09}")
public interface CX509CertificateRequestPkcs7 extends IUnknown
    ,IX509CertificateRequestPkcs7V2
{

}