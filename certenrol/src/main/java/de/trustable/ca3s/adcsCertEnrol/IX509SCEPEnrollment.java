
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
 * <p>uuid({728AB361-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB361-217D-11DA-B2A4-000E7BBB2B09}")
public interface IX509SCEPEnrollment extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param pRequest [in] {@code IX509CertificateRequestPkcs10}
     * @param strThumbprint [in] {@code String}
     * @param ThumprintEncoding [in] {@code EncodingType}
     * @param strServerCertificates [in] {@code String}
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComMethod(name = "Initialize", dispId = 0x60020000)
    void Initialize(IX509CertificateRequestPkcs10 pRequest,
            String strThumbprint,
            EncodingType ThumprintEncoding,
            String strServerCertificates,
            EncodingType Encoding);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param Context [in] {@code X509CertificateEnrollmentContext}
     */
    @ComMethod(name = "InitializeForPending", dispId = 0x60020001)
    void InitializeForPending(X509CertificateEnrollmentContext Context);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComMethod(name = "CreateRequestMessage", dispId = 0x60020002)
    String CreateRequestMessage(EncodingType Encoding);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComMethod(name = "CreateRetrievePendingMessage", dispId = 0x60020003)
    String CreateRetrievePendingMessage(EncodingType Encoding);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param Context [in] {@code X509CertificateEnrollmentContext}
     * @param strIssuer [in] {@code String}
     * @param IssuerEncoding [in] {@code EncodingType}
     * @param strSerialNumber [in] {@code String}
     * @param SerialNumberEncoding [in, optional] {@code EncodingType}
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComMethod(name = "CreateRetrieveCertificateMessage", dispId = 0x60020004)
    String CreateRetrieveCertificateMessage(X509CertificateEnrollmentContext Context,
            String strIssuer,
            EncodingType IssuerEncoding,
            String strSerialNumber,
            EncodingType SerialNumberEncoding,
            EncodingType Encoding);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     * @param strResponse [in] {@code String}
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComMethod(name = "ProcessResponseMessage", dispId = 0x60020005)
    X509SCEPDisposition ProcessResponseMessage(String strResponse,
            EncodingType Encoding);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ServerCapabilities", dispId = 0x60020006)
    void setServerCapabilities(String param0);
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "FailInfo", dispId = 0x60020007)
    X509SCEPFailInfo getFailInfo();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "SignerCertificate", dispId = 0x60020008)
    ISignerCertificate getSignerCertificate();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code ISignerCertificate}
     */
    @ComProperty(name = "SignerCertificate", dispId = 0x60020008)
    void setSignerCertificate(ISignerCertificate param0);
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "OldCertificate", dispId = 0x6002000a)
    ISignerCertificate getOldCertificate();
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code ISignerCertificate}
     */
    @ComProperty(name = "OldCertificate", dispId = 0x6002000a)
    void setOldCertificate(ISignerCertificate param0);
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(19)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "TransactionId", dispId = 0x6002000c)
    String getTransactionId(EncodingType Encoding);
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(20)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     * @param param1 [in] {@code String}
     */
    @ComProperty(name = "TransactionId", dispId = 0x6002000c)
    void setTransactionId(EncodingType Encoding,
            String param1);
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Request", dispId = 0x6002000e)
    IX509CertificateRequestPkcs10 getRequest();
            
    /**
     * <p>id(0x6002000f)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "CertificateFriendlyName", dispId = 0x6002000f)
    String getCertificateFriendlyName();
            
    /**
     * <p>id(0x6002000f)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "CertificateFriendlyName", dispId = 0x6002000f)
    void setCertificateFriendlyName(String param0);
            
    /**
     * <p>id(0x60020011)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Status", dispId = 0x60020011)
    IX509EnrollmentStatus getStatus();
            
    /**
     * <p>id(0x60020012)</p>
     * <p>vtableId(25)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "Certificate", dispId = 0x60020012)
    String getCertificate(EncodingType Encoding);
            
    /**
     * <p>id(0x60020013)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Silent", dispId = 0x60020013)
    Boolean getSilent();
            
    /**
     * <p>id(0x60020013)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Silent", dispId = 0x60020013)
    void setSilent(Boolean param0);
            
    /**
     * <p>id(0x60020015)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "DeleteRequest", dispId = 0x60020015)
    void DeleteRequest();
            
    
}