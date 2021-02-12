
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * X.509 Endorsement Key Class
 *
 * <p>uuid({11A25A1D-B9A3-4EDD-AF83-3B59ADBED361})</p>
 * <p>interface(IX509EndorsementKey)</p>
 */
@ComObject(clsId = "{11A25A1D-B9A3-4EDD-AF83-3B59ADBED361}")
public interface CX509EndorsementKey extends IUnknown
    ,IX509EndorsementKey
{

}