
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IX509ExtensionSubjectKeyIdentifier Interface
 *
 * <p>uuid({728AB317-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB317-217D-11DA-B2A4-000E7BBB2B09}")
public interface IX509ExtensionSubjectKeyIdentifier extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Critical", dispId = 0x60020003)
    Boolean getCritical();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Critical", dispId = 0x60020003)
    void setCritical(Boolean param0);
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(12)</p>
     * @param Encoding [in] {@code EncodingType}
     * @param strKeyIdentifier [in] {@code String}
     */
    @ComMethod(name = "InitializeEncode", dispId = 0x60030000)
    void InitializeEncode(EncodingType Encoding,
            String strKeyIdentifier);
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(13)</p>
     * @param Encoding [in] {@code EncodingType}
     * @param strEncodedData [in] {@code String}
     */
    @ComMethod(name = "InitializeDecode", dispId = 0x60030001)
    void InitializeDecode(EncodingType Encoding,
            String strEncodedData);
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(14)</p>
     * @param Encoding [in] {@code EncodingType}
     */
    @ComProperty(name = "SubjectKeyIdentifier", dispId = 0x60030002)
    String getSubjectKeyIdentifier(EncodingType Encoding);
            
    
}