
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IX509AttributeOSVersion Interface
 *
 * <p>uuid({728AB32A-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB32A-217D-11DA-B2A4-000E7BBB2B09}")
public interface IX509AttributeOSVersion extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * @param strOSVersion [in] {@code String}
     */
    @ComMethod(name = "InitializeEncode", dispId = 0x60030000)
    void InitializeEncode(String strOSVersion);
            
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
     */
    @ComProperty(name = "OSVersion", dispId = 0x60030002)
    String getOSVersion();
            
    
}