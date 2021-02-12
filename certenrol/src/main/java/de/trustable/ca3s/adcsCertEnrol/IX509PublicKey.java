
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.509 Public Key Interface
 *
 * <p>uuid({728AB30B-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB30B-217D-11DA-B2A4-000E7BBB2B09}")
public interface IX509PublicKey extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param pObjectId [in] {@code IObjectId}
     * @param strEncodedKey [in] {@code String}
     * @param strEncodedParameters [in] {@code String}
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComMethod(name = "Initialize", dispId = 0x60020000)
    void Initialize(IObjectId pObjectId,
            String strEncodedKey,
            String strEncodedParameters,
            EncodingType Encoding);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param strEncodedPublicKeyInfo [in] {@code String}
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComMethod(name = "InitializeFromEncodedPublicKeyInfo", dispId = 0x60020001)
    void InitializeFromEncodedPublicKeyInfo(String strEncodedPublicKeyInfo,
            EncodingType Encoding);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Algorithm", dispId = 0x60020002)
    IObjectId getAlgorithm();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Length", dispId = 0x60020003)
    Integer getLength();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "EncodedKey", dispId = 0x60020004)
    String getEncodedKey(EncodingType Encoding);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "EncodedParameters", dispId = 0x60020005)
    String getEncodedParameters(EncodingType Encoding);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param Algorithm [in] {@code KeyIdentifierHashAlgorithm}
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComMethod(name = "ComputeKeyIdentifier", dispId = 0x60020006)
    String ComputeKeyIdentifier(KeyIdentifierHashAlgorithm Algorithm,
            EncodingType Encoding);
            
    
}