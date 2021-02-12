
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * X.509 Certificate Revocation List Interface
 *
 * <p>uuid({728AB360-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB360-217D-11DA-B2A4-000E7BBB2B09}")
public interface IX509CertificateRevocationList extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComMethod(name = "Initialize", dispId = 0x60020000)
    void Initialize();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param strEncodedData [in] {@code String}
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComMethod(name = "InitializeDecode", dispId = 0x60020001)
    void InitializeDecode(String strEncodedData,
            EncodingType Encoding);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "Encode", dispId = 0x60020002)
    void Encode();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "ResetForEncode", dispId = 0x60020003)
    void ResetForEncode();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param pPublicKey [in] {@code IX509PublicKey}
     */
    @ComMethod(name = "CheckPublicKeySignature", dispId = 0x60020004)
    void CheckPublicKeySignature(IX509PublicKey pPublicKey);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "CheckSignature", dispId = 0x60020005)
    void CheckSignature();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Issuer", dispId = 0x60020006)
    IX500DistinguishedName getIssuer();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code IX500DistinguishedName}
     */
    @ComProperty(name = "Issuer", dispId = 0x60020006)
    void setIssuer(IX500DistinguishedName param0);
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "ThisUpdate", dispId = 0x60020008)
    java.util.Date getThisUpdate();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "ThisUpdate", dispId = 0x60020008)
    void setThisUpdate(java.util.Date param0);
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "NextUpdate", dispId = 0x6002000a)
    java.util.Date getNextUpdate();
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "NextUpdate", dispId = 0x6002000a)
    void setNextUpdate(java.util.Date param0);
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "X509CRLEntries", dispId = 0x6002000c)
    IX509CertificateRevocationListEntries getX509CRLEntries();
            
    /**
     * <p>id(0x6002000d)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "X509Extensions", dispId = 0x6002000d)
    IX509Extensions getX509Extensions();
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "CriticalExtensions", dispId = 0x6002000e)
    IObjectIds getCriticalExtensions();
            
    /**
     * <p>id(0x6002000f)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "SignerCertificate", dispId = 0x6002000f)
    ISignerCertificate getSignerCertificate();
            
    /**
     * <p>id(0x6002000f)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code ISignerCertificate}
     */
    @ComProperty(name = "SignerCertificate", dispId = 0x6002000f)
    void setSignerCertificate(ISignerCertificate param0);
            
    /**
     * <p>id(0x60020011)</p>
     * <p>vtableId(24)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "CRLNumber", dispId = 0x60020011)
    String getCRLNumber(EncodingType Encoding);
            
    /**
     * <p>id(0x60020011)</p>
     * <p>vtableId(25)</p>
     * @param Encoding [in] {@code EncodingType}
     * @param param1 [in] {@code String}
     */
    @ComProperty(name = "CRLNumber", dispId = 0x60020011)
    void setCRLNumber(EncodingType Encoding,
            String param1);
            
    /**
     * <p>id(0x60020013)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "CAVersion", dispId = 0x60020013)
    Integer getCAVersion();
            
    /**
     * <p>id(0x60020013)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "CAVersion", dispId = 0x60020013)
    void setCAVersion(Integer param0);
            
    /**
     * <p>id(0x60020015)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "BaseCRL", dispId = 0x60020015)
    Boolean getBaseCRL();
            
    /**
     * <p>id(0x60020016)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "NullSigned", dispId = 0x60020016)
    Boolean getNullSigned();
            
    /**
     * <p>id(0x60020017)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "HashAlgorithm", dispId = 0x60020017)
    IObjectId getHashAlgorithm();
            
    /**
     * <p>id(0x60020017)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code IObjectId}
     */
    @ComProperty(name = "HashAlgorithm", dispId = 0x60020017)
    void setHashAlgorithm(IObjectId param0);
            
    /**
     * <p>id(0x60020019)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "AlternateSignatureAlgorithm", dispId = 0x60020019)
    Boolean getAlternateSignatureAlgorithm();
            
    /**
     * <p>id(0x60020019)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AlternateSignatureAlgorithm", dispId = 0x60020019)
    void setAlternateSignatureAlgorithm(Boolean param0);
            
    /**
     * <p>id(0x6002001b)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "SignatureInformation", dispId = 0x6002001b)
    IX509SignatureInformation getSignatureInformation();
            
    /**
     * <p>id(0x6002001c)</p>
     * <p>vtableId(35)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "RawData", dispId = 0x6002001c)
    String getRawData(EncodingType Encoding);
            
    /**
     * <p>id(0x6002001d)</p>
     * <p>vtableId(36)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "RawDataToBeSigned", dispId = 0x6002001d)
    String getRawDataToBeSigned(EncodingType Encoding);
            
    /**
     * <p>id(0x6002001e)</p>
     * <p>vtableId(37)</p>
     * @param Encoding [in, optional] {@code EncodingType}
     */
    @ComProperty(name = "Signature", dispId = 0x6002001e)
    String getSignature(EncodingType Encoding);
            
    
}