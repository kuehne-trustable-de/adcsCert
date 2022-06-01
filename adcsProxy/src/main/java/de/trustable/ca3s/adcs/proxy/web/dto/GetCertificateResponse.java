package de.trustable.ca3s.adcs.proxy.web.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetCertificateResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-23T16:51:23.906Z[GMT]")
public class GetCertificateResponse   {
  @JsonProperty("values")
  @Valid
  private List<GetCertificateResponseValues> values = null;

  public GetCertificateResponse values(List<GetCertificateResponseValues> values) {
    this.values = values;
    return this;
  }

  public GetCertificateResponse addValuesItem(GetCertificateResponseValues valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<GetCertificateResponseValues>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  **/
  @Schema()
  @Valid
  public List<GetCertificateResponseValues> getValues() {
    return values;
  }

  public void setValues(List<GetCertificateResponseValues> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCertificateResponse getCertificateResponse = (GetCertificateResponse) o;
    return Objects.equals(this.values, getCertificateResponse.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCertificateResponse {\n");

    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
