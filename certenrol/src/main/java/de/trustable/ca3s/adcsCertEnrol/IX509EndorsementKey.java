
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.509 Endorsement Key Interface
 *
 * <p>uuid({B11CD855-F4C4-4FC6-B710-4422237F09E9})</p>
 */
@ComInterface(iid="{B11CD855-F4C4-4FC6-B710-4422237F09E9}")
public interface IX509EndorsementKey extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "ProviderName", dispId = 0x60020000)
    String getProviderName();
            
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ProviderName", dispId = 0x60020000)
    void setProviderName(String param0);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Length", dispId = 0x60020002)
    Integer getLength();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Opened", dispId = 0x60020003)
    Boolean getOpened();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param Encoding [in] {@code EncodingType}
     * @param strCertificate [in] {@code String}
     */
    @ComMethod(name = "AddCertificate", dispId = 0x60020004)
    void AddCertificate(EncodingType Encoding,
            String strCertificate);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     * @param Encoding [in] {@code EncodingType}
     * @param strCertificate [in] {@code String}
     */
    @ComMethod(name = "RemoveCertificate", dispId = 0x60020005)
    void RemoveCertificate(EncodingType Encoding,
            String strCertificate);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param ManufacturerOnly [in] {@code Boolean}
     * @param dwIndex [in] {@code Integer}
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComMethod(name = "GetCertificateByIndex", dispId = 0x60020006)
    String GetCertificateByIndex(Boolean ManufacturerOnly,
            Integer dwIndex,
            EncodingType Encoding);
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     * @param ManufacturerOnly [in] {@code Boolean}
     */
    @ComMethod(name = "GetCertificateCount", dispId = 0x60020007)
    Integer GetCertificateCount(Boolean ManufacturerOnly);
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "ExportPublicKey", dispId = 0x60020008)
    IX509PublicKey ExportPublicKey();
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Open", dispId = 0x60020009)
    void Open();
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "Close", dispId = 0x6002000a)
    void Close();
            
    
}