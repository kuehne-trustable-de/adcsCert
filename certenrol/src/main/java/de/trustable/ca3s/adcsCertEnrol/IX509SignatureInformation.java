
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.509 Signature Information Interface
 *
 * <p>uuid({728AB33C-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB33C-217D-11DA-B2A4-000E7BBB2B09}")
public interface IX509SignatureInformation extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "HashAlgorithm", dispId = 0x60020000)
    IObjectId getHashAlgorithm();
            
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code IObjectId}
     */
    @ComProperty(name = "HashAlgorithm", dispId = 0x60020000)
    void setHashAlgorithm(IObjectId param0);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "PublicKeyAlgorithm", dispId = 0x60020002)
    IObjectId getPublicKeyAlgorithm();
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code IObjectId}
     */
    @ComProperty(name = "PublicKeyAlgorithm", dispId = 0x60020002)
    void setPublicKeyAlgorithm(IObjectId param0);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "Parameters", dispId = 0x60020004)
    String getParameters(EncodingType Encoding);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(12)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     * @param param1 [in] {@code String}
     */
    @ComProperty(name = "Parameters", dispId = 0x60020004)
    void setParameters(EncodingType Encoding,
            String param1);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "AlternateSignatureAlgorithm", dispId = 0x60020006)
    Boolean getAlternateSignatureAlgorithm();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AlternateSignatureAlgorithm", dispId = 0x60020006)
    void setAlternateSignatureAlgorithm(Boolean param0);
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "AlternateSignatureAlgorithmSet", dispId = 0x60020008)
    Boolean getAlternateSignatureAlgorithmSet();
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "NullSigned", dispId = 0x60020009)
    Boolean getNullSigned();
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "NullSigned", dispId = 0x60020009)
    void setNullSigned(Boolean param0);
            
    /**
     * <p>id(0x6002000b)</p>
     * <p>vtableId(18)</p>
     * @param Pkcs7Signature [in] {@code Boolean}
     * @param SignatureKey [in] {@code Boolean}
     */
    @ComMethod(name = "GetSignatureAlgorithm", dispId = 0x6002000b)
    IObjectId GetSignatureAlgorithm(Boolean Pkcs7Signature,
            Boolean SignatureKey);
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "SetDefaultValues", dispId = 0x6002000c)
    void SetDefaultValues();
            
    
}