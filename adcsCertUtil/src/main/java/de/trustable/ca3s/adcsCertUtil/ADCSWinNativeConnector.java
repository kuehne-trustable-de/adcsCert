package de.trustable.ca3s.adcsCertUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface ADCSWinNativeConnector {

	public static int CR_DISP_INCOMPLETE = 0;
	public static int CR_DISP_ERROR = 0x1;
	public static int CR_DISP_DENIED = 0x2;
	public static int CR_DISP_ISSUED = 0x3;
	public static int CR_DISP_ISSUED_OUT_OF_BAND = 0x4;
	public static int CR_DISP_UNDER_SUBMISSION = 0x5;
	public static int CR_DISP_REVOKED = 0x6;
	public static int CR_CRL_UNAVAILABLE = 0x80092013;
	public static int CR_FILE_NOT_FOUND = 0x80070002;
	public static int ERROR_NO_MORE_ITEMS = 0x80070103;

	/**
	 * submit a certificate request and retrieve an enrollment response object
	 *
	 * @param b64Csr a PKCS10 request, base64 encoded
	 * @param attributeMap a map of attributes, usually a template name
	 * @return an enrollment object, in case of success containing the created certificate
	 * @throws ADCSException inormation about problems
	 */
	CertificateEnrollmentResponse submitRequest(String b64Csr, Map<String, String> attributeMap) throws ADCSException;

	/**
	 * revoke a certificate identified by the serila number
	 * @param serial the serial number of the certificate. This is sufficient as the serial is unique for an ADCS instance
	 * @param reason the number representing the revocation reason
	 * @param revocationDate date of revocation
	 * @throws ADCSException inormation about problems
	 */
	void revokeCertifcate(String serial, int reason, Date revocationDate) throws ADCSException;

	/**
	 * get a list of certificates selected by the given parameters
	 * @param limit maximum number of returned certificates
	 * @param offset offset of request identifier
	 * @param resolvedWhenTimestamp select only certificates resolves after the given timestamp
	 * @param revokedEffectiveWhen select only certificates revoked after the given timestamp
	 * @return a list of request ids
	 * @throws ADCSException inormation about problems
	 */
	List<String> getRequesIdList(int limit, int offset, long resolvedWhenTimestamp, long revokedEffectiveWhen) throws ADCSException;

	/**
	 * get details of a given certificate identified by a request id
	 * @param reqId the request id selecting a single cerificate
	 * @return a name / value map with details of the certificate
	 * @throws ADCSException inormation about problems
	 */
	GetCertificateResponse getCertificateByRequestId(String reqId) throws ADCSException;

	/**
	 * get the name of this ADCS instance
	 * @return the strig describing this instance
	 * @throws ADCSException inormation about problems
	 */
	String getInfo() throws ADCSException;

	/**
	 * get the list of available templates
	 * @return an array of template names
	 * @throws ADCSException inormation about problems
	 */
    String[] getCATemplates() throws ADCSException ;

	/**
	 * Get a set of details regarding the represented ADCS instance
	 *
	 * For details about the used API see
	 * https://docs.microsoft.com/en-us/openspecs/windows_protocols/ms-wcce/7c715f9f-db50-41c3-abfc-0021c6390d4e
	 *
	 * The JNI parameter are slightly different from the method signature prpopsed by the documentation. When implementing additional calls
	 * check back with the proven code below.
	 *
	 * @return an object describing ADCS instance details
	 * @throws ADCSException inormation about problems
	 */
	public ADCSInstanceDetails getCAInstanceDetails() throws ADCSException;

}