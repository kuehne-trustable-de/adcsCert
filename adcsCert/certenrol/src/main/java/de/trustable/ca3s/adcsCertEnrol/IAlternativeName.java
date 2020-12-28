
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IAlternativeName Interface
 *
 * <p>uuid({728AB313-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB313-217D-11DA-B2A4-000E7BBB2B09}")
public interface IAlternativeName extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param Type [in] {@code AlternativeNameType}
     * @param strValue [in] {@code String}
     */
    @ComMethod(name = "InitializeFromString", dispId = 0x60020000)
    void InitializeFromString(AlternativeNameType Type,
            String strValue);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param Type [in] {@code AlternativeNameType}
     * @param Encoding [in] {@code EncodingType}
     * @param strRawData [in] {@code String}
     */
    @ComMethod(name = "InitializeFromRawData", dispId = 0x60020001)
    void InitializeFromRawData(AlternativeNameType Type,
            EncodingType Encoding,
            String strRawData);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param pObjectId [in] {@code IObjectId}
     * @param Encoding [in] {@code EncodingType}
     * @param strRawData [in] {@code String}
     * @param ToBeWrapped [in] {@code Boolean}
     */
    @ComMethod(name = "InitializeFromOtherName", dispId = 0x60020002)
    void InitializeFromOtherName(IObjectId pObjectId,
            EncodingType Encoding,
            String strRawData,
            Boolean ToBeWrapped);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Type", dispId = 0x60020003)
    AlternativeNameType getType();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "strValue", dispId = 0x60020004)
    String getStrValue();
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ObjectId", dispId = 0x60020005)
    IObjectId getObjectId();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param Encoding [in] {@code EncodingType}
     */
    @ComProperty(name = "RawData", dispId = 0x60020006)
    String getRawData(EncodingType Encoding);
            
    
}