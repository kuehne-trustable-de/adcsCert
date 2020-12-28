
package de.trustable.ca3s.adcsCertAdmin;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IOCSPAdmin Interface
 *
 * <p>uuid({322E830D-67DB-4FE9-9577-4596D9F09294})</p>
 */
@ComInterface(iid="{322E830D-67DB-4FE9-9577-4596D9F09294}")
public interface IOCSPAdmin extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * property OCSPServiceProperties
     *
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "OCSPServiceProperties", dispId = 0x1)
    IOCSPPropertyCollection getOCSPServiceProperties();
            
    /**
     * property OCSPCAConfigurationCollection
     *
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "OCSPCAConfigurationCollection", dispId = 0x2)
    IOCSPCAConfigurationCollection getOCSPCAConfigurationCollection();
            
    /**
     * method GetConfiguration
     *
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     * @param bstrServerName [in] {@code String}
     * @param bForce [in] {@code Boolean}
     */
    @ComMethod(name = "GetConfiguration", dispId = 0x3)
    void GetConfiguration(String bstrServerName,
            Boolean bForce);
            
    /**
     * method SetConfiguration
     *
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     * @param bstrServerName [in] {@code String}
     * @param bForce [in] {@code Boolean}
     */
    @ComMethod(name = "SetConfiguration", dispId = 0x4)
    void SetConfiguration(String bstrServerName,
            Boolean bForce);
            
    /**
     * method GetMyRoles
     *
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     * @param bstrServerName [in] {@code String}
     */
    @ComMethod(name = "GetMyRoles", dispId = 0x5)
    Integer GetMyRoles(String bstrServerName);
            
    /**
     * method Ping
     *
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
     * @param bstrServerName [in] {@code String}
     */
    @ComMethod(name = "Ping", dispId = 0x6)
    void Ping(String bstrServerName);
            
    /**
     * method SetSecurity
     *
     * <p>id(0x7)</p>
     * <p>vtableId(13)</p>
     * @param bstrServerName [in] {@code String}
     * @param bstrVal [in] {@code String}
     */
    @ComMethod(name = "SetSecurity", dispId = 0x7)
    void SetSecurity(String bstrServerName,
            String bstrVal);
            
    /**
     * method GetSecurity
     *
     * <p>id(0x8)</p>
     * <p>vtableId(14)</p>
     * @param bstrServerName [in] {@code String}
     */
    @ComMethod(name = "GetSecurity", dispId = 0x8)
    String GetSecurity(String bstrServerName);
            
    /**
     * method GetSigningCertificates
     *
     * <p>id(0x9)</p>
     * <p>vtableId(15)</p>
     * @param bstrServerName [in] {@code String}
     * @param pCACertVar [in] {@code Object}
     */
    @ComMethod(name = "GetSigningCertificates", dispId = 0x9)
    Object GetSigningCertificates(String bstrServerName,
            Object pCACertVar);
            
    /**
     * method GetHashAlgorithms
     *
     * <p>id(0xa)</p>
     * <p>vtableId(16)</p>
     * @param bstrServerName [in] {@code String}
     * @param bstrCAId [in] {@code String}
     */
    @ComMethod(name = "GetHashAlgorithms", dispId = 0xa)
    Object GetHashAlgorithms(String bstrServerName,
            String bstrCAId);
            
    
}