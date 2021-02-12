
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.509 Certificate Template Writable Interface
 *
 * <p>uuid({F49466A7-395A-4E9E-B6E7-32B331600DC0})</p>
 */
@ComInterface(iid="{F49466A7-395A-4E9E-B6E7-32B331600DC0}")
public interface IX509CertificateTemplateWritable extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param pValue [in] {@code IX509CertificateTemplate}
     */
    @ComMethod(name = "Initialize", dispId = 0x60020000)
    void Initialize(IX509CertificateTemplate pValue);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param commitFlags [in] {@code CommitTemplateFlags}
     * @param strServerContext [in] {@code String}
     */
    @ComMethod(name = "Commit", dispId = 0x60020001)
    void Commit(CommitTemplateFlags commitFlags,
            String strServerContext);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param Property [in] {@code EnrollmentTemplateProperty}
     */
    @ComProperty(name = "Property", dispId = 0x60020002)
    Object getProperty(EnrollmentTemplateProperty Property);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(10)</p>
     * @param Property [in] {@code EnrollmentTemplateProperty}
     * @param param1 [in] {@code Object}
     */
    @ComProperty(name = "Property", dispId = 0x60020002)
    void setProperty(EnrollmentTemplateProperty Property,
            Object param1);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Template", dispId = 0x60020004)
    IX509CertificateTemplate getTemplate();
            
    
}