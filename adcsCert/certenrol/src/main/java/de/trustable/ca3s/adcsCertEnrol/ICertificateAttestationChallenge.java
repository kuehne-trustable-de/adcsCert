
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Certificate Attestation Challenge Interface
 *
 * <p>uuid({6F175A7C-4A3A-40AE-9DBA-592FD6BBF9B8})</p>
 */
@ComInterface(iid="{6F175A7C-4A3A-40AE-9DBA-592FD6BBF9B8}")
public interface ICertificateAttestationChallenge extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param Encoding [in] {@code EncodingType}
     * @param strPendingFullCmcResponseWithChallenge [in] {@code String}
     */
    @ComMethod(name = "Initialize", dispId = 0x60020000)
    void Initialize(EncodingType Encoding,
            String strPendingFullCmcResponseWithChallenge);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param Encoding [in] {@code EncodingType}
     */
    @ComMethod(name = "DecryptChallenge", dispId = 0x60020001)
    String DecryptChallenge(EncodingType Encoding);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "RequestId", dispId = 0x60020002)
    String getRequestId();
            
    
}