
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IPolicyQualifier Interface
 *
 * <p>uuid({728AB31C-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB31C-217D-11DA-B2A4-000E7BBB2B09}")
public interface IPolicyQualifier extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param strQualifier [in] {@code String}
     * @param Type [in] {@code PolicyQualifierType}
     */
    @ComMethod(name = "InitializeEncode", dispId = 0x60020000)
    void InitializeEncode(String strQualifier,
            PolicyQualifierType Type);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "ObjectId", dispId = 0x60020001)
    IObjectId getObjectId();
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Qualifier", dispId = 0x60020002)
    String getQualifier();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Type", dispId = 0x60020003)
    PolicyQualifierType getType();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param Encoding [in] {@code EncodingType}
     */
    @ComProperty(name = "RawData", dispId = 0x60020004)
    String getRawData(EncodingType Encoding);
            
    
}