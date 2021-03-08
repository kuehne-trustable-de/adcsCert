package de.trustable.ca3s.adcsCertUtil;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CertificateEnrollmentResponse {

	@JsonProperty("status")
    private SubmitStatus status = SubmitStatus.ERROR;
	
	@JsonProperty("reqId")
    private long reqId = -1;
	
	@JsonProperty("cert")
    private String b64Cert = null;
	
	@JsonProperty("caCert")
    private String b64CACert = null;
	
	public CertificateEnrollmentResponse() {}
	
	public CertificateEnrollmentResponse(final SubmitStatus status, final long reqId) {
		this.status = status;
		this.reqId = reqId;
	}

	public CertificateEnrollmentResponse(final SubmitStatus status, final long reqId, final String b64Cert) {
		this(status,reqId);
		this.b64Cert = b64Cert;
	}

	public CertificateEnrollmentResponse(final SubmitStatus status, final long reqId, final String b64Cert, final String b64CACert) {
		this(status,reqId, b64Cert);
		this.b64CACert = b64CACert;
	}

	/**
	 * @return the status
	 */
	public SubmitStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(SubmitStatus status) {
		this.status = status;
	}

	/**
	 * @return the reqId
	 */
	public long getReqId() {
		return reqId;
	}

	/**
	 * @param reqId the reqId to set
	 */
	public void setReqId(long reqId) {
		this.reqId = reqId;
	}

	/**
	 * @return the b64Cert
	 */
	public String getB64Cert() {
		return b64Cert;
	}

	/**
	 * @param b64Cert the b64Cert to set
	 */
	public void setB64Cert(String b64Cert) {
		this.b64Cert = b64Cert;
	}

	/**
	 * @return the b64CACert
	 */
	public String getB64CACert() {
		return b64CACert;
	}

	/**
	 * @param b64caCert the b64CACert to set
	 */
	public void setB64CACert(String b64caCert) {
		b64CACert = b64caCert;
	}

	
}
