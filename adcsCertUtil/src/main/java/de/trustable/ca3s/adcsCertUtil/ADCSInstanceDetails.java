package de.trustable.ca3s.adcsCertUtil;

/**
 * CertificateEnrollmentResponse
 */
public class ADCSInstanceDetails   {
	
	  private String caName = null;

	  private String caType = null;

	  private String parentCaName = null;

	  private String productVersion = null;

	  private String fileVersion = null;

	  private String dnsName = null;

	  private String[] signingCerts = null;

	  private String[] signingCertChains = null;

	  private String[] templates = null;

	  private String[] templateOIDs = null;

	  private String[] subjectTemplateOIDs = null;

	  /**
	   * 
	   */
	  public ADCSInstanceDetails() {}
	  
	  
	/**
	 * @return the caName
	 */
	public String getCaName() {
		return caName;
	}

	/**
	 * @return the caType
	 */
	public String getCaType() {
		return caType;
	}

	/**
	 * @return the parentCaName
	 */
	public String getParentCaName() {
		return parentCaName;
	}

	/**
	 * @return the productVersion
	 */
	public String getProductVersion() {
		return productVersion;
	}

	/**
	 * @return the fileVersion
	 */
	public String getFileVersion() {
		return fileVersion;
	}

	/**
	 * @return the dnsName
	 */
	public String getDnsName() {
		return dnsName;
	}

	/**
	 * @return the signingCertChains
	 */
	public String[] getSigningCertChains() {
		return signingCertChains;
	}

	/**
	 * @return the templates
	 */
	public String[] getTemplates() {
		return templates;
	}

	/**
	 * @return the templateOIDs
	 */
	public String[] getTemplateOIDs() {
		return templateOIDs;
	}

	/**
	 * @return the subjectTemplateOIDs
	 */
	public String[] getSubjectTemplateOIDs() {
		return subjectTemplateOIDs;
	}

	/**
	 * @param caName the caName to set
	 */
	public void setCaName(String caName) {
		this.caName = caName;
	}

	/**
	 * @param caType the caType to set
	 */
	public void setCaType(String caType) {
		this.caType = caType;
	}

	/**
	 * @param parentCaName the parentCaName to set
	 */
	public void setParentCaName(String parentCaName) {
		this.parentCaName = parentCaName;
	}

	/**
	 * @param productVersion the productVersion to set
	 */
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

	/**
	 * @param fileVersion the fileVersion to set
	 */
	public void setFileVersion(String fileVersion) {
		this.fileVersion = fileVersion;
	}

	/**
	 * @param dnsName the dnsName to set
	 */
	public void setDnsName(String dnsName) {
		this.dnsName = dnsName;
	}

	/**
	 * @param signingCertChains the signingCertChains to set
	 */
	public void setSigningCertChains(String[] signingCertChains) {
		this.signingCertChains = signingCertChains;
	}

	/**
	 * @param templates the templates to set
	 */
	public void setTemplates(String[] templates) {
		this.templates = templates;
	}

	/**
	 * @param templateOIDs the templateOIDs to set
	 */
	public void setTemplateOIDs(String[] templateOIDs) {
		this.templateOIDs = templateOIDs;
	}

	/**
	 * @param subjectTemplateOIDs the subjectTemplateOIDs to set
	 */
	public void setSubjectTemplateOIDs(String[] subjectTemplateOIDs) {
		this.subjectTemplateOIDs = subjectTemplateOIDs;
	}


	/**
	 * @return the signingCerts
	 */
	public String[] getSigningCerts() {
		return signingCerts;
	}


	/**
	 * @param signingCerts the signingCerts to set
	 */
	public void setSigningCerts(String[] signingCerts) {
		this.signingCerts = signingCerts;
	}


	  
}
