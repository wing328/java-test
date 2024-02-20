# DefaultApi

All URIs are relative to *http://localhost:3000*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1EndpointPost**](DefaultApi.md#v1EndpointPost) | **POST** /v1/endpoint |  |


<a id="v1EndpointPost"></a>
# **v1EndpointPost**
> V1EndpointPost200Response v1EndpointPost(stage, id, type, scope, name, description, summary, key)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3000");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String stage = "prod"; // String | 
    String id = "id_example"; // String | 
    String type = "value1"; // String | 
    String scope = "scope_example"; // String | 
    String name = "name_example"; // String | 
    String description = "description_example"; // String | 
    String summary = "summary_example"; // String | 
    String key = "key_example"; // String | 
    try {
      V1EndpointPost200Response result = apiInstance.v1EndpointPost(stage, id, type, scope, name, description, summary, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#v1EndpointPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stage** | **String**|  | [enum: prod, int] |
| **id** | **String**|  | [optional] |
| **type** | **String**|  | [optional] [enum: value1, value2, value3] |
| **scope** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |
| **summary** | **String**|  | [optional] |
| **key** | **String**|  | [optional] |

### Return type

[**V1EndpointPost200Response**](V1EndpointPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded; charset=utf-8
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

