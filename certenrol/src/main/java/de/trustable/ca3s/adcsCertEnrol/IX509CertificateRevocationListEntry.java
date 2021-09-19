
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.509 Certificate Revocation List Entry Interface
 *
 * <p>uuid({728AB35E-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB35E-217D-11DA-B2A4-000E7BBB2B09}")
public interface IX509CertificateRevocationListEntry extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param Encoding [in] {@code EncodingType}
     * @param SerialNumber [in] {@code String}
     * @param RevocationDate [in] {@code java.util.Date}
     */
    @ComMethod(name = "Initialize", dispId = 0x60020000)
    void Initialize(EncodingType Encoding,
            String SerialNumber,
            java.util.Date RevocationDate);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "SerialNumber", dispId = 0x60020001)
    String getSerialNumber(EncodingType Encoding);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "RevocationDate", dispId = 0x60020002)
    java.util.Date getRevocationDate();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "RevocationReason", dispId = 0x60020003)
    CRLRevocationReason getRevocationReason();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code CRLRevocationReason}
     */
    @ComProperty(name = "RevocationReason", dispId = 0x60020003)
    void setRevocationReason(CRLRevocationReason param0);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "X509Extensions", dispId = 0x60020005)
    IX509Extensions getX509Extensions();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "CriticalExtensions", dispId = 0x60020006)
    IObjectIds getCriticalExtensions();
            
    
}