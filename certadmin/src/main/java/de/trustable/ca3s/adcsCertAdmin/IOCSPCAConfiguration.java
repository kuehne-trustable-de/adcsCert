
package de.trustable.ca3s.adcsCertAdmin;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IOCSPCAConfiguration Interface
 *
 * <p>uuid({AEC92B40-3D46-433F-87D1-B84D5C1E790D})</p>
 */
@ComInterface(iid="{AEC92B40-3D46-433F-87D1-B84D5C1E790D}")
public interface IOCSPCAConfiguration extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * property Identifier
     *
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Identifier", dispId = 0x1)
    String getIdentifier();
            
    /**
     * property CACertificate
     *
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "CACertificate", dispId = 0x2)
    Object getCACertificate();
            
    /**
     * property HashAlgorithm
     *
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "HashAlgorithm", dispId = 0x3)
    String getHashAlgorithm();
            
    /**
     * property HashAlgorithm
     *
     * <p>id(0x3)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "HashAlgorithm", dispId = 0x3)
    void setHashAlgorithm(String param0);
            
    /**
     * property SigningFlags
     *
     * <p>id(0x4)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "SigningFlags", dispId = 0x4)
    Integer getSigningFlags();
            
    /**
     * property SigningFlags
     *
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SigningFlags", dispId = 0x4)
    void setSigningFlags(Integer param0);
            
    /**
     * property SigningCertificate
     *
     * <p>id(0x5)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "SigningCertificate", dispId = 0x5)
    Object getSigningCertificate();
            
    /**
     * property SigningCertificate
     *
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "SigningCertificate", dispId = 0x5)
    void setSigningCertificate(Object param0);
            
    /**
     * property ReminderDuration
     *
     * <p>id(0x6)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "ReminderDuration", dispId = 0x6)
    Integer getReminderDuration();
            
    /**
     * property ReminderDuration
     *
     * <p>id(0x6)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ReminderDuration", dispId = 0x6)
    void setReminderDuration(Integer param0);
            
    /**
     * property ErrorCode
     *
     * <p>id(0x7)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "ErrorCode", dispId = 0x7)
    Integer getErrorCode();
            
    /**
     * property CSPName
     *
     * <p>id(0x8)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "CSPName", dispId = 0x8)
    String getCSPName();
            
    /**
     * property KeySpec
     *
     * <p>id(0x9)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "KeySpec", dispId = 0x9)
    Integer getKeySpec();
            
    /**
     * property ProviderCLSID
     *
     * <p>id(0xa)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "ProviderCLSID", dispId = 0xa)
    String getProviderCLSID();
            
    /**
     * property ProviderCLSID
     *
     * <p>id(0xa)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ProviderCLSID", dispId = 0xa)
    void setProviderCLSID(String param0);
            
    /**
     * property ProviderProperties
     *
     * <p>id(0xb)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "ProviderProperties", dispId = 0xb)
    Object getProviderProperties();
            
    /**
     * property ProviderProperties
     *
     * <p>id(0xb)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ProviderProperties", dispId = 0xb)
    void setProviderProperties(Object param0);
            
    /**
     * property Modified
     *
     * <p>id(0xc)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Modified", dispId = 0xc)
    Boolean getModified();
            
    /**
     * property LocalRevocationInformation
     *
     * <p>id(0xd)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "LocalRevocationInformation", dispId = 0xd)
    Object getLocalRevocationInformation();
            
    /**
     * property LocalRevocationInformation
     *
     * <p>id(0xd)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "LocalRevocationInformation", dispId = 0xd)
    void setLocalRevocationInformation(Object param0);
            
    /**
     * property SigningCertificateTemplate
     *
     * <p>id(0xe)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "SigningCertificateTemplate", dispId = 0xe)
    String getSigningCertificateTemplate();
            
    /**
     * property SigningCertificateTemplate
     *
     * <p>id(0xe)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SigningCertificateTemplate", dispId = 0xe)
    void setSigningCertificateTemplate(String param0);
            
    /**
     * property CAConfig
     *
     * <p>id(0xf)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "CAConfig", dispId = 0xf)
    String getCAConfig();
            
    /**
     * property CAConfig
     *
     * <p>id(0xf)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "CAConfig", dispId = 0xf)
    void setCAConfig(String param0);
            
    
}