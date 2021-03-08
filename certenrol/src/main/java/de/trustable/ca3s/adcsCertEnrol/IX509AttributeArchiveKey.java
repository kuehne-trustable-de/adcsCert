
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IX509AttributeArchiveKey Interface
 *
 * <p>uuid({728AB327-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB327-217D-11DA-B2A4-000E7BBB2B09}")
public interface IX509AttributeArchiveKey extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param pObjectId [in] {@code IObjectId}
     * @param Encoding [in] {@code EncodingType}
     * @param strEncodedData [in] {@code String}
     */
    @ComMethod(name = "Initialize", dispId = 0x60020000)
    void Initialize(IObjectId pObjectId,
            EncodingType Encoding,
            String strEncodedData);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "ObjectId", dispId = 0x60020001)
    IObjectId getObjectId();
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param Encoding [in] {@code EncodingType}
     */
    @ComProperty(name = "RawData", dispId = 0x60020002)
    String getRawData(EncodingType Encoding);
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(10)</p>
     * @param pKey [in] {@code IX509PrivateKey}
     * @param Encoding [in] {@code EncodingType}
     * @param strCAXCert [in] {@code String}
     * @param pAlgorithm [in] {@code IObjectId}
     * @param EncryptionStrength [in] {@code Integer}
     */
    @ComMethod(name = "InitializeEncode", dispId = 0x60030000)
    void InitializeEncode(IX509PrivateKey pKey,
            EncodingType Encoding,
            String strCAXCert,
            IObjectId pAlgorithm,
            Integer EncryptionStrength);
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(11)</p>
     * @param Encoding [in] {@code EncodingType}
     * @param strEncodedData [in] {@code String}
     */
    @ComMethod(name = "InitializeDecode", dispId = 0x60030001)
    void InitializeDecode(EncodingType Encoding,
            String strEncodedData);
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(12)</p>
     * @param Encoding [in] {@code EncodingType}
     */
    @ComProperty(name = "EncryptedKeyBlob", dispId = 0x60030002)
    String getEncryptedKeyBlob(EncodingType Encoding);
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "EncryptionAlgorithm", dispId = 0x60030003)
    IObjectId getEncryptionAlgorithm();
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "EncryptionStrength", dispId = 0x60030004)
    Integer getEncryptionStrength();
            
    
}