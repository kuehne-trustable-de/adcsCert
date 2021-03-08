
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Binary Converter 2 Interface
 *
 * <p>uuid({8D7928B4-4E17-428D-9A17-728DF00D1B2B})</p>
 */
@ComInterface(iid="{8D7928B4-4E17-428D-9A17-728DF00D1B2B}")
public interface IBinaryConverter2 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param strEncodedIn [in] {@code String}
     * @param EncodingIn [in] {@code EncodingType}
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComMethod(name = "StringToString", dispId = 0x60020000)
    String StringToString(String strEncodedIn,
            EncodingType EncodingIn,
            EncodingType Encoding);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param pvarByteArray [in] {@code Object}
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComMethod(name = "VariantByteArrayToString", dispId = 0x60020001)
    String VariantByteArrayToString(Object pvarByteArray,
            EncodingType Encoding);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param strEncoded [in] {@code String}
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComMethod(name = "StringToVariantByteArray", dispId = 0x60020002)
    Object StringToVariantByteArray(String strEncoded,
            EncodingType Encoding);
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(10)</p>
     * @param pvarStringArray [in] {@code Object}
     */
    @ComMethod(name = "StringArrayToVariantArray", dispId = 0x60030000)
    Object StringArrayToVariantArray(Object pvarStringArray);
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(11)</p>
     * @param pvarVariantArray [in] {@code Object}
     */
    @ComMethod(name = "VariantArrayToStringArray", dispId = 0x60030001)
    Object VariantArrayToStringArray(Object pvarVariantArray);
            
    
}