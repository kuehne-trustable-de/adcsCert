package de.trustable.ca3s.adcs.proxy.web.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CertificateRequestElements
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-30T11:55:34.168Z[GMT]")
public class CertificateRequestElements   {
  @JsonProperty("csr")
  private String csr = null;

  @JsonProperty("attributes")
  @Valid
  private List<CertificateRequestElementsAttributes> attributes = new ArrayList<CertificateRequestElementsAttributes>();

  public CertificateRequestElements csr(String csr) {
    this.csr = csr;
    return this;
  }

  /**
   * Get csr
   * @return csr
  **/
  @Schema(example = "-----BEGIN NEW CERTIFICATE REQUEST----- MIIC/DCCAeQCAQAwHDEaMBgGA1UEAxMRV1MtMjAxOS1Jc3N1aW5nQ0EwggEiMA0G CSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQC6/GWkDeV1KrHz4ZrSGG5e/vqFDndl 9K9Q9cqdnF3+gZJo9oRYVASvMZ5zAJFpvZZ87KT8E6WlRUjZ4T2egap9GSsjXr5R 2Q/N6i5FK7pTnSSMrYBSqVWdti8yQ7+bt+mdJExbP5IVjuXWPTE1PpYzJUrfJUpV JpBfGmYhzGDMTiXLrZOen0bKbytx4j4wevFWgsBdfeuZs2zchF4VYKt/SAZwTxW0 3BeSlB/sxN6POvHDofD/CPD1vOsz8oVCCyVTKC4RS9S8YEkELSbxI/0quMFLkXXn rgVl7v+Za+7PZJ1q4ra0B2Doa2+X64LDq4YxyYdnHQzyMmm15fWnTe/dAgMBAAGg gZowHQYKKwYBBAGCNw0CAzEPFg0xMC4wLjE3NzYzLjIuMHkGCSqGSIb3DQEJDjFs MGowEAYJKwYBBAGCNxUBBAMCAQAwHQYDVR0OBBYEFPZBinSxew5Q6MlHG3Mz0oT+ sHsYMBkGCSsGAQQBgjcUAgQMHgoAUwB1AGIAQwBBMAsGA1UdDwQEAwIBhjAPBgNV HRMBAf8EBTADAQH/MA0GCSqGSIb3DQEBCwUAA4IBAQAXgvm54Mzszp4UActJ5u0i JIawzSpbK/tjIElugatRqPbZCoZXsGW3HWr/LWNRc8GxooG+fxWYnNLvqq4U8TLx HBiISOTDGsK7C0X1LRG/Mh6uYGSlA7RW/smUyR8FHwPnwxlPDdafw3+QN0ZpkKA4 4rvQ4WrObPzmA/ybdK1RBXNjD3BQZjHpYV2SF9O1vDfs1mmkKezQejvnh2tPgTkJ sT7E1GdqCPjpWQ1C8Kiz/PRdz/jt1D2ZeeAfJyS8G8lIwqq/w0nPlIGcKidMXKo1 SSD3AwieROIlyDb5ueVaxnydIAjDlO/a1VsJz/UKibH3+fjHa/grnU6MGancxKLO -----END NEW CERTIFICATE REQUEST----- ", required = true)
  @NotNull

  public String getCsr() {
    return csr;
  }

  public void setCsr(String csr) {
    this.csr = csr;
  }

  public CertificateRequestElements attributes(List<CertificateRequestElementsAttributes> attributes) {
    this.attributes = attributes;
    return this;
  }

  public CertificateRequestElements addAttributesItem(CertificateRequestElementsAttributes attributesItem) {
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true)
  @NotNull
  @Valid
  public List<CertificateRequestElementsAttributes> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<CertificateRequestElementsAttributes> attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateRequestElements certificateRequestElements = (CertificateRequestElements) o;
    return Objects.equals(this.csr, certificateRequestElements.csr) &&
        Objects.equals(this.attributes, certificateRequestElements.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csr, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateRequestElements {\n");

    sb.append("    csr: ").append(toIndentedString(csr)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
