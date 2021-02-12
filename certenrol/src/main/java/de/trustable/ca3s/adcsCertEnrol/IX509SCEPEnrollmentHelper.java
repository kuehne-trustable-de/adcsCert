
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.509 Simple Computer Enrollment Protocol Interface
 *
 * <p>uuid({728AB365-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB365-217D-11DA-B2A4-000E7BBB2B09}")
public interface IX509SCEPEnrollmentHelper extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param strServerUrl [in] {@code String}
     * @param strRequestHeaders [in] {@code String}
     * @param pRequest [in] {@code IX509CertificateRequestPkcs10}
     * @param strCACertificateThumbprint [in] {@code String}
     */
    @ComMethod(name = "Initialize", dispId = 0x60020000)
    void Initialize(String strServerUrl,
            String strRequestHeaders,
            IX509CertificateRequestPkcs10 pRequest,
            String strCACertificateThumbprint);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param strServerUrl [in] {@code String}
     * @param strRequestHeaders [in] {@code String}
     * @param Context [in] {@code X509CertificateEnrollmentContext}
     * @param strTransactionId [in] {@code String}
     */
    @ComMethod(name = "InitializeForPending", dispId = 0x60020001)
    void InitializeForPending(String strServerUrl,
            String strRequestHeaders,
            X509CertificateEnrollmentContext Context,
            String strTransactionId);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param ProcessFlags [in] {@code X509SCEPProcessMessageFlags}
     */
    @ComMethod(name = "Enroll", dispId = 0x60020002)
    X509SCEPDisposition Enroll(X509SCEPProcessMessageFlags ProcessFlags);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     * @param ProcessFlags [in] {@code X509SCEPProcessMessageFlags}
     */
    @ComMethod(name = "FetchPending", dispId = 0x60020003)
    X509SCEPDisposition FetchPending(X509SCEPProcessMessageFlags ProcessFlags);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "X509SCEPEnrollment", dispId = 0x60020004)
    IX509SCEPEnrollment getX509SCEPEnrollment();
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ResultMessageText", dispId = 0x60020005)
    String getResultMessageText();
            
    
}