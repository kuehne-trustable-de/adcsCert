
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.509 Enrollment Helper
 *
 * <p>uuid({728AB351-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB351-217D-11DA-B2A4-000E7BBB2B09}")
public interface IX509EnrollmentHelper extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param strEnrollmentPolicyServerURI [in] {@code String}
     * @param strEnrollmentPolicyID [in] {@code String}
     * @param EnrollmentPolicyServerFlags [in] {@code PolicyServerUrlFlags}
     * @param AuthFlags [in] {@code X509EnrollmentAuthFlags}
     * @param strCredential [in] {@code String}
     * @param strPassword [in] {@code String}
     */
    @ComMethod(name = "AddPolicyServer", dispId = 0x60020000)
    void AddPolicyServer(String strEnrollmentPolicyServerURI,
            String strEnrollmentPolicyID,
            PolicyServerUrlFlags EnrollmentPolicyServerFlags,
            X509EnrollmentAuthFlags AuthFlags,
            String strCredential,
            String strPassword);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param strEnrollmentServerURI [in] {@code String}
     * @param AuthFlags [in] {@code X509EnrollmentAuthFlags}
     * @param strCredential [in] {@code String}
     * @param strPassword [in] {@code String}
     */
    @ComMethod(name = "AddEnrollmentServer", dispId = 0x60020001)
    void AddEnrollmentServer(String strEnrollmentServerURI,
            X509EnrollmentAuthFlags AuthFlags,
            String strCredential,
            String strPassword);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param strEnrollmentPolicyServerURI [in] {@code String}
     * @param strTemplateName [in] {@code String}
     * @param Encoding [in] {@code EncodingType}
     * @param enrollFlags [in] {@code WebEnrollmentFlags}
     */
    @ComMethod(name = "Enroll", dispId = 0x60020002)
    String Enroll(String strEnrollmentPolicyServerURI,
            String strTemplateName,
            EncodingType Encoding,
            WebEnrollmentFlags enrollFlags);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     * @param Context [in] {@code X509CertificateEnrollmentContext}
     */
    @ComMethod(name = "Initialize", dispId = 0x60020003)
    void Initialize(X509CertificateEnrollmentContext Context);
            
    
}