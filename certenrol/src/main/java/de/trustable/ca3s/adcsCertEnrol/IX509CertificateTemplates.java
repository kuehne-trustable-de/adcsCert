
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.509 Certificate Templates Interface
 *
 * <p>uuid({13B79003-2181-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{13B79003-2181-11DA-B2A4-000E7BBB2B09}")
public interface IX509CertificateTemplates extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Property Item.
     *
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "ItemByIndex", dispId = 0x0)
    IX509CertificateTemplate getItemByIndex(Integer Index);
            
    /**
     * Property Count.
     *
     * <p>id(0x1)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * Method Add.
     *
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     * @param pVal [in] {@code IX509CertificateTemplate}
     */
    @ComMethod(name = "Add", dispId = 0x2)
    void Add(IX509CertificateTemplate pVal);
            
    /**
     * Method Remove.
     *
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Remove", dispId = 0x3)
    void Remove(Integer Index);
            
    /**
     * Method Clear.
     *
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Clear", dispId = 0x4)
    void Clear();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param bstrName [in] {@code String}
     */
    @ComProperty(name = "ItemByName", dispId = 0x60020006)
    IX509CertificateTemplate getItemByName(String bstrName);
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     * @param pOid [in] {@code IObjectId}
     */
    @ComProperty(name = "ItemByOid", dispId = 0x60020007)
    IX509CertificateTemplate getItemByOid(IObjectId pOid);
            
    
}