package de.trustable.ca3s.adcsCertUtil;

import com.fasterxml.jackson.annotation.JsonProperty;


public class GetCertificateResponse {

	@JsonProperty("reqId")
    private String reqId = "";
	
	@JsonProperty("cert")
    private String b64Cert = null;
	
	@JsonProperty("template")
    private String template = null;
	
	@JsonProperty("resolvedDate")
    private String resolvedDate = null;
	
	@JsonProperty("revokedDate")
    private String revokedDate = null;
	
	@JsonProperty("revokedReason")
    private String revokedReason = null;
	
	@JsonProperty("disposition")
    private String disposition = null;
	
	@JsonProperty("dispositionMessage")
    private String dispositionMessage = null;
	
	
	public GetCertificateResponse() {}
	
	public GetCertificateResponse(final String requestID, final String b64Cert, final String template, final String resolvedDate, final String revokedDate, String revokedReason, String disposition, String dispositionMessage) {
		this.reqId = requestID;
		this.b64Cert = b64Cert;
		this.template = template;
		this.resolvedDate = resolvedDate;
		this.revokedDate = revokedDate;
		this.revokedReason = revokedReason;
		this.disposition = disposition;
		this.dispositionMessage = dispositionMessage;
		
	}


	/**
	 * @return the reqId
	 */
	public String getReqId() {
		return reqId;
	}

	/**
	 * @param reqId the reqId to set
	 */
	public void setReqId(String reqId) {
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
	 * @return the template
	 */
	public String getTemplate() {
		return template;
	}

	/**
	 * @param template the template to set
	 */
	public void setTemplate(String template) {
		this.template = template;
	}

	/**
	 * @return the resolvedDate
	 */
	public String getResolvedDate() {
		return resolvedDate;
	}

	/**
	 * @param resolvedDate the resolvedDate to set
	 */
	public void setResolvedDate(String resolvedDate) {
		this.resolvedDate = resolvedDate;
	}

	/**
	 * @return the revokedDate
	 */
	public String getRevokedDate() {
		return revokedDate;
	}

	/**
	 * @param revokedDate the revokedDate to set
	 */
	public void setRevokedDate(String revokedDate) {
		this.revokedDate = revokedDate;
	}

	public String getRevokedReason() {
		return revokedReason;
	}

	public void setRevokedReason(String revokedReason) {
		this.revokedReason = revokedReason;
	}

	public String getDisposition() {
		return disposition;
	}

	public String getDispositionMessage() {
		return dispositionMessage;
	}

	public void setDisposition(String disposition) {
		this.disposition = disposition;
	}

	public void setDispositionMessage(String dispositionMessage) {
		this.dispositionMessage = dispositionMessage;
	}	

	
	
}
