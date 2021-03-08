package de.trustable.ca3s.adcs.proxy.web.dto;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CertificateRevocationRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-20T21:06:07.917Z[GMT]")
public class CertificateRevocationRequest   {
	
  @JsonProperty("serial")
  private String serial = null;

  @JsonProperty("reason")
  private Integer reason = null;

  @JsonProperty("revTime")
  private long revTime = 0L;

  public CertificateRevocationRequest serial(String serial) {
    this.serial = serial;
    return this;
  }

  /**
   * certificate serial number
   * @return serial
  **/
  @ApiModelProperty(required = true, value = "certificate serial number")
  @NotNull

  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }

  public CertificateRevocationRequest reason(Integer reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(example = "4", required = true, value = "")
  @NotNull

  public Integer getReason() {
    return reason;
  }

  public void setReason(Integer reason) {
    this.reason = reason;
  }

  public CertificateRevocationRequest revTime(long revTime) {
    this.revTime = revTime;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "")


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateRevocationRequest certificateRevocationRequest = (CertificateRevocationRequest) o;
    return Objects.equals(this.serial, certificateRevocationRequest.serial) &&
        Objects.equals(this.reason, certificateRevocationRequest.reason) &&
        Objects.equals(this.revTime, certificateRevocationRequest.revTime);
  }

  /**
 * @return the revTime
 */
public long getRevTime() {
	return revTime;
}

/**
 * @param revTime the revTime to set
 */
public void setRevTime(long revTime) {
	this.revTime = revTime;
}

@Override
  public int hashCode() {
    return Objects.hash(serial, reason, revTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateRevocationRequest {\n");
    
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("   revTime: ").append(toIndentedString(revTime)).append("\n");
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
