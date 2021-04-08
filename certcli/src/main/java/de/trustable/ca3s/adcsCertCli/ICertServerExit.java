
package de.trustable.ca3s.adcsCertCli;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * ICertServerExit Interface
 *
 * <p>uuid({4BA9EB90-732C-11D0-8816-00A0C903B83C})</p>
 */
@ComInterface(iid="{4BA9EB90-732C-11D0-8816-00A0C903B83C}")
public interface ICertServerExit extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param Context [in] {@code Integer}
     */
    @ComMethod(name = "SetContext", dispId = 0x60020000)
    void SetContext(Integer Context);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param strPropertyName [in] {@code String}
     * @param PropertyType [in] {@code Integer}
     */
    @ComMethod(name = "GetRequestProperty", dispId = 0x60020001)
    Object GetRequestProperty(String strPropertyName,
            Integer PropertyType);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param strAttributeName [in] {@code String}
     */
    @ComMethod(name = "GetRequestAttribute", dispId = 0x60020002)
    String GetRequestAttribute(String strAttributeName);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     * @param strPropertyName [in] {@code String}
     * @param PropertyType [in] {@code Integer}
     */
    @ComMethod(name = "GetCertificateProperty", dispId = 0x60020003)
    Object GetCertificateProperty(String strPropertyName,
            Integer PropertyType);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param strExtensionName [in] {@code String}
     * @param Type [in] {@code Integer}
     */
    @ComMethod(name = "GetCertificateExtension", dispId = 0x60020004)
    Object GetCertificateExtension(String strExtensionName,
            Integer Type);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "GetCertificateExtensionFlags", dispId = 0x60020005)
    Integer GetCertificateExtensionFlags();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param Flags [in] {@code Integer}
     */
    @ComMethod(name = "EnumerateExtensionsSetup", dispId = 0x60020006)
    void EnumerateExtensionsSetup(Integer Flags);
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "EnumerateExtensions", dispId = 0x60020007)
    String EnumerateExtensions();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "EnumerateExtensionsClose", dispId = 0x60020008)
    void EnumerateExtensionsClose();
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(16)</p>
     * @param Flags [in] {@code Integer}
     */
    @ComMethod(name = "EnumerateAttributesSetup", dispId = 0x60020009)
    void EnumerateAttributesSetup(Integer Flags);
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "EnumerateAttributes", dispId = 0x6002000a)
    String EnumerateAttributes();
            
    /**
     * <p>id(0x6002000b)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "EnumerateAttributesClose", dispId = 0x6002000b)
    void EnumerateAttributesClose();
            
    
}