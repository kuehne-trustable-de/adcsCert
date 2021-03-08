
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * CertPropertyEnrollmentPolicyServer Class
 *
 * <p>uuid({884E204C-217D-11DA-B2A4-000E7BBB2B09})</p>
 * <p>interface(ICertPropertyEnrollmentPolicyServer)</p>
 */
@ComObject(clsId = "{884E204C-217D-11DA-B2A4-000E7BBB2B09}")
public interface CCertPropertyEnrollmentPolicyServer extends IUnknown
    ,ICertPropertyEnrollmentPolicyServer
{

}