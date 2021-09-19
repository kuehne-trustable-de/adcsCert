package de.trustable.ca3s.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * CertificateRevocationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-20T21:06:07.917Z[GMT]")
public class CertificateRevocationRequest   {
	
  @SerializedName("serial")
  private String serial = null;

  @SerializedName("reason")
  private Integer reason = null;

  @SerializedName("revTime")
  private long revTime = 0L;

  public CertificateRevocationRequest serial(String serial) {
    this.serial = serial;
    return this;
  }

  /**
   * certificate serial number
   * @return serial
  **/
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
