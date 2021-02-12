# Ca3sApi

All URIs are relative to *https://virtserver.swaggerhub.com/trustable/ADCSConnector/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRequestById**](Ca3sApi.md#getRequestById) | **GET** /adcsRequest/{reqId} | get details of a certificate request identified by its Id
[**getRequestIdList**](Ca3sApi.md#getRequestIdList) | **GET** /adcsRequests/Ids | get the list certificate request IDs
[**requstCertificate**](Ca3sApi.md#requstCertificate) | **POST** /adcsCertificate | request a certificate
[**revokeCertificate**](Ca3sApi.md#revokeCertificate) | **DELETE** /adcsCertificate/{serial}/{reason}/{date} | revoke a certificate

<a name="getRequestById"></a>
# **getRequestById**
> GetCertificateResponse getRequestById(reqId)

get details of a certificate request identified by its Id

details of a certificate request identified by its Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ca3sApi;


Ca3sApi apiInstance = new Ca3sApi();
String reqId = "reqId_example"; // String | certificate request id
try {
    GetCertificateResponse result = apiInstance.getRequestById(reqId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ca3sApi#getRequestById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqId** | **String**| certificate request id |

### Return type

[**GetCertificateResponse**](GetCertificateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRequestIdList"></a>
# **getRequestIdList**
> RequestIdsResponse getRequestIdList(offset, limit)

get the list certificate request IDs

enumerate all the request (issued or pending) avialable the ADCS

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ca3sApi;


Ca3sApi apiInstance = new Ca3sApi();
Integer offset = 56; // Integer | The number of items to skip before starting to collect the result set
Integer limit = 56; // Integer | The numbers of items to return
try {
    RequestIdsResponse result = apiInstance.getRequestIdList(offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ca3sApi#getRequestIdList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| The number of items to skip before starting to collect the result set | [optional]
 **limit** | **Integer**| The numbers of items to return | [optional]

### Return type

[**RequestIdsResponse**](RequestIdsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="requstCertificate"></a>
# **requstCertificate**
> CertificateEnrollmentResponse requstCertificate(body)

request a certificate

request a certificate from the ADCS

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ca3sApi;


Ca3sApi apiInstance = new Ca3sApi();
CertificateRequestElements body = new CertificateRequestElements(); // CertificateRequestElements | CSR and additional attributes (e.g. template)
try {
    CertificateEnrollmentResponse result = apiInstance.requstCertificate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ca3sApi#requstCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CertificateRequestElements**](CertificateRequestElements.md)| CSR and additional attributes (e.g. template) | [optional]

### Return type

[**CertificateEnrollmentResponse**](CertificateEnrollmentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="revokeCertificate"></a>
# **revokeCertificate**
> revokeCertificate(serial, reason, date)

revoke a certificate

revoke a certificate from the ADCS

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ca3sApi;


Ca3sApi apiInstance = new Ca3sApi();
String serial = "serial_example"; // String | certificate serial number
Integer reason = 56; // Integer | 
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | 
try {
    apiInstance.revokeCertificate(serial, reason, date);
} catch (ApiException e) {
    System.err.println("Exception when calling Ca3sApi#revokeCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serial** | **String**| certificate serial number |
 **reason** | **Integer**|  |
 **date** | **OffsetDateTime**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

