package de.trustable.ca3s.adcs.proxy.web.rest;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JWSWrappedRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-20T18:27:31.111Z[GMT]")
public class JWSWrappedRequest   {
  @JsonProperty("jws")
  private String jws = null;

  public JWSWrappedRequest jws(String jws) {
    this.jws = jws;
    return this;
  }

  /**
   * Get jws
   * @return jws
  **/
  @ApiModelProperty(example = "eyJhbGciOiJIUzI1NiJ9.eyJjc3IiOiItLS0tLUJFR0lOIENFUlRJRklDQVRFIFJFUVVFU1QtLS0tLVxyXG5NSUlDZ0RDQ0FXZ0NBUUF3RkRFU01CQUdBMVVFQXd3Sk1UQXVNUzR3TGpFd01JSUJJakFOQmdrcWhraUc5dzBCXHJcbkFRRUZBQU9DQVE4QU1JSUJDZ0tDQVFFQTJWcDZneW10d2RCTzhwYXE3V1BDVnhDeS9VOU5sai93SFp4S21vZldcclxuTXJYZmUxT0MyRWdOWWZCQ1M3OEVzc0dBejJkK2pCeGpMeS9aY2w5Zm0zdzVkS3BZNjk0RExHenc3bmFUVU1kU1xyXG5Ha29zZXVsQStYTHdHRk9TaE1GM2c3aS9QK0FQTDJVQTZVR1AxRGsyT3JyQ1ZHVGdQYVlFcXh0RkVycmtEZUc5XHJcbm1VOHZ6WFUyWFdFL3NqQzhOQXAyYXRkckIwOWFxSTNkcVRPNmJFdjdBeTh0SUtMbHpoaGplY3JhUnpZMTlUS1RcclxuWmxZazJwSnR6RlJhZlJGUDZ3b2tDRUwvK3lkWndjanJ2clJtZkRKYlpIQ0lGWjlyQzVvQTBiblkrYkZ6eWtwNlxyXG5xUFpUci81eWRUeldRd29VaGVWa0ZGa25EdVNtSHV1cytxSGhNU0NJNzM5dTF3SURBUUFCb0Njd0pRWUpLb1pJXHJcbmh2Y05BUWtPTVJnd0ZqQVVCZ05WSFJFRURUQUxnZ2t4TUM0eExqQXVNVEF3RFFZSktvWklodmNOQVFFTEJRQURcclxuZ2dFQkFDMm9zK3BFWkcvYmozQkJqMkRVYWladzNsUnpOVzI2dUxGeXZqSWdQcWhuRlZNc0Q0RkdXWUdCM3MxMVxyXG52Z3l6ZS9mSStuQVMyMFFabDQxQjh4QXRFOVE3WVpXMk9qaUxWVUFRdFZaUlhxSnpjZEYzZ0d6RWlpQlg0dGxqXHJcbldIRkhMOHhiVm1tcStkSzhxQTdoOTZ5Z2NNUEJLVUViYnZyeGZWL1dGQTd3cDdhRTlncVVsb3M1ZzQybnhOOTlcclxuNFBBNWZBTnI1b1FZSmU4K0VvQWVsTTFVYlMrelpGU3AxL0xKV05EZTdlSkdLMTJ3aG85TWJtajFIRlA1WFhMVVxyXG5DQTRjVE0rZkZHRG95MHBwVkFUN3U0NUdCVGZKYTZhUzNObjRITlFjdFdmcE5vRlRtRUMxTlRUY1l3b3NtUHZoXHJcbkhTL1FIK1o4MFkweW1HQkN2MjJPQUdsQTJlVT1cclxuLS0tLS1FTkQgQ0VSVElGSUNBVEUgUkVRVUVTVC0tLS0tXHJcbiIsImF0dHJpYnV0ZXMiOltdfQ.c2pKbTsW-pWpPjRi-S0Q7AqtacohEXw5ZYVwjHCtuAI", required = true, value = "")
  @NotNull

  public String getJws() {
    return jws;
  }

  public void setJws(String jws) {
    this.jws = jws;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JWSWrappedRequest jwSWrappedRequest = (JWSWrappedRequest) o;
    return Objects.equals(this.jws, jwSWrappedRequest.jws);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jws);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWSWrappedRequest {\n");
    
    sb.append("    jws: ").append(toIndentedString(jws)).append("\n");
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
