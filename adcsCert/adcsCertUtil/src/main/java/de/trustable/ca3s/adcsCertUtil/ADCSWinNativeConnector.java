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
	 * 
	 * @param b64Csr
	 * @return
	 * @throws ADCSException
	 */
	CertificateEnrollmentResponse submitRequest(String b64Csr, Map<String, String> attributeMap) throws ADCSException;

	void revokeCertifcate(String serial, int reason, Date revocationDate) throws ADCSException;
	
	List<String> getRequesIdList(int limit, int offset, long resolvedWhenTimestamp, long revokedEffectiveWhen) throws ADCSException;

	GetCertificateResponse getCertificateByRequestId(String reqId) throws ADCSException;

	String getInfo() throws ADCSException;

    String[] getCATemplates() throws ADCSException ;

    public ADCSInstanceDetails getCAInstanceDetails() throws ADCSException;

}