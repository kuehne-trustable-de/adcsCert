
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * Certificate Attestation Challenge Class
 *
 * <p>uuid({1362ADA1-EB60-456A-B6E1-118050DB741B})</p>
 * <p>interface(ICertificateAttestationChallenge2)</p>
 */
@ComObject(clsId = "{1362ADA1-EB60-456A-B6E1-118050DB741B}")
public interface CCertificateAttestationChallenge extends IUnknown
    ,ICertificateAttestationChallenge2
{

}