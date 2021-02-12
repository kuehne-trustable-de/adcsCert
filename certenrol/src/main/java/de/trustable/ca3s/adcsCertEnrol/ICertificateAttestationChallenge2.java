
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Certificate Attestation Challenge Interface v2
 *
 * <p>uuid({4631334D-E266-47D6-BD79-BE53CB2E2753})</p>
 */
@ComInterface(iid="{4631334D-E266-47D6-BD79-BE53CB2E2753}")
public interface ICertificateAttestationChallenge2 extends IUnknown, IRawDispatchHandle, IDispatch {
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
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "KeyContainerName", dispId = 0x60030000)
    void setKeyContainerName(String param0);
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(11)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     * @param param1 [in] {@code String}
     */
    @ComProperty(name = "KeyBlob", dispId = 0x60030001)
    void setKeyBlob(EncodingType Encoding,
            String param1);
            
    
}