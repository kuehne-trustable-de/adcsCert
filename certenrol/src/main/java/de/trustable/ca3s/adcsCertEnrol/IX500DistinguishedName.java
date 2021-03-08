
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.500 Distinguished Name Interface
 *
 * <p>uuid({728AB303-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB303-217D-11DA-B2A4-000E7BBB2B09}")
public interface IX500DistinguishedName extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param strEncodedName [in] {@code String}
     * @param Encoding [in, optional] {@code EncodingType}
     * @param NameFlags [in, optional] {@code X500NameFlags}
     */
    @ComMethod(name = "Decode", dispId = 0x60020000)
    void Decode(String strEncodedName,
            EncodingType Encoding,
            X500NameFlags NameFlags);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param strName [in] {@code String}
     * @param NameFlags [in, optional] {@code X500NameFlags}
     */
    @ComMethod(name = "Encode", dispId = 0x60020001)
    void Encode(String strName,
            X500NameFlags NameFlags);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60020002)
    String getName();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "EncodedName", dispId = 0x60020003)
    String getEncodedName(EncodingType Encoding);
            
    
}