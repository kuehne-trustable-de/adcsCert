package de.trustable.ca3s.adcs.proxy.web.dto;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CertificateEnrollmentResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-30T11:55:34.168Z[GMT]")
public class CertificateEnrollmentResponse   {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("reqId")
  private Integer reqId = null;

  @JsonProperty("cert")
  private String cert = null;

  @JsonProperty("certCA")
  private String certCA = null;

  public CertificateEnrollmentResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CertificateEnrollmentResponse reqId(Integer reqId) {
    this.reqId = reqId;
    return this;
  }

  /**
   * Get reqId
   * @return reqId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public Integer getReqId() {
    return reqId;
  }

  public void setReqId(Integer reqId) {
    this.reqId = reqId;
  }

  public CertificateEnrollmentResponse cert(String cert) {
    this.cert = cert;
    return this;
  }

  /**
   * Get cert
   * @return cert
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getCert() {
    return cert;
  }

  public void setCert(String cert) {
    this.cert = cert;
  }

  public CertificateEnrollmentResponse certCA(String certCA) {
    this.certCA = certCA;
    return this;
  }

  /**
   * Get certCA
   * @return certCA
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getCertCA() {
    return certCA;
  }

  public void setCertCA(String certCA) {
    this.certCA = certCA;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateEnrollmentResponse certificateEnrollmentResponse = (CertificateEnrollmentResponse) o;
    return Objects.equals(this.status, certificateEnrollmentResponse.status) &&
        Objects.equals(this.reqId, certificateEnrollmentResponse.reqId) &&
        Objects.equals(this.cert, certificateEnrollmentResponse.cert) &&
        Objects.equals(this.certCA, certificateEnrollmentResponse.certCA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, reqId, cert, certCA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateEnrollmentResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reqId: ").append(toIndentedString(reqId)).append("\n");
    sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
    sb.append("    certCA: ").append(toIndentedString(certCA)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
