package de.trustable.ca3s.adcs.proxy.web.dto;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.trustable.ca3s.adcsCertUtil.ADCSInstanceDetails;

/**
 * CertificateEnrollmentResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-30T11:55:34.168Z[GMT]")
public class ADCSInstanceDetailsResponse   {
	
	  @JsonProperty("caName")
	  private String caName = null;

	  @JsonProperty("caType")
	  private String caType = null;

	  @JsonProperty("parentCaName")
	  private String parentCaName = null;

	  @JsonProperty("productVersion")
	  private String productVersion = null;

	  @JsonProperty("fileVersion")
	  private String fileVersion = null;

	  @JsonProperty("dnsName")
	  private String dnsName = null;

	  @JsonProperty("signingCerts")
	  private String[] signingCerts = null;

	  @JsonProperty("signingCertChains")
	  private String[] signingCertChains = null;

	  @JsonProperty("templates")
	  private String[] templates = null;

	  @JsonProperty("templateOIDs")
	  private String[] templateOIDs = null;

	  @JsonProperty("subjectTemplateOIDs")
	  private String[] subjectTemplateOIDs = null;

	  /**
	   * 
	   */
	  public ADCSInstanceDetailsResponse() {}
	  
	  
	public ADCSInstanceDetailsResponse(ADCSInstanceDetails details) {
		  caName = details.getCaName();

		  this.caType = details.getCaType();

		  this.parentCaName = details.getParentCaName();

		  this.productVersion = details.getProductVersion();

		  this.fileVersion = details.getFileVersion();

		  this.dnsName = details.getDnsName();

		  this.signingCerts = details.getSigningCerts();

		  this.signingCertChains = details.getSigningCertChains();

		  this.templates = details.getTemplates();

		  this.templateOIDs = details.getTemplateOIDs();

		  this.subjectTemplateOIDs = details.getSubjectTemplateOIDs();
	}


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


	public String[] getSigningCerts() {
		return signingCerts;
	}


	public void setSigningCerts(String[] signingCerts) {
		this.signingCerts = signingCerts;
	}


	  
}
