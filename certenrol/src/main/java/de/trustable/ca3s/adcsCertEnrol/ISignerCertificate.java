
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Signer Certificate Interface
 *
 * <p>uuid({728AB33D-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB33D-217D-11DA-B2A4-000E7BBB2B09}")
public interface ISignerCertificate extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param MachineContext [in] {@code Boolean}
     * @param VerifyType [in] {@code X509PrivateKeyVerify}
     * @param Encoding [in] {@code EncodingType}
     * @param strCertificate [in] {@code String}
     */
    @ComMethod(name = "Initialize", dispId = 0x60020000)
    void Initialize(Boolean MachineContext,
            X509PrivateKeyVerify VerifyType,
            EncodingType Encoding,
            String strCertificate);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param Encoding [in] {@code EncodingType}
     */
    @ComProperty(name = "Certificate", dispId = 0x60020001)
    String getCertificate(EncodingType Encoding);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "PrivateKey", dispId = 0x60020002)
    IX509PrivateKey getPrivateKey();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Silent", dispId = 0x60020003)
    Boolean getSilent();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Silent", dispId = 0x60020003)
    void setSilent(Boolean param0);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ParentWindow", dispId = 0x60020005)
    Integer getParentWindow();
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ParentWindow", dispId = 0x60020005)
    void setParentWindow(Integer param0);
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "UIContextMessage", dispId = 0x60020007)
    String getUIContextMessage();
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "UIContextMessage", dispId = 0x60020007)
    void setUIContextMessage(String param0);
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Pin", dispId = 0x60020009)
    void setPin(String param0);
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "SignatureInformation", dispId = 0x6002000a)
    IX509SignatureInformation getSignatureInformation();
            
    
}