# openapi-java-client

OneOf test
- API version: 0.1.0
  - Build date: 2024-02-20T18:28:09.794317600+08:00[Asia/Singapore]

OneOf test


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>0.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:0.1.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-0.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *http://localhost:3000*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**v1EndpointPost**](docs/DefaultApi.md#v1EndpointPost) | **POST** /v1/endpoint | 


## Documentation for Models

 - [RequestModelA](docs/RequestModelA.md)
 - [RequestModelB](docs/RequestModelB.md)
 - [RequestModelC](docs/RequestModelC.md)
 - [ResponseModelA](docs/ResponseModelA.md)
 - [ResponseModelB](docs/ResponseModelB.md)
 - [V1EndpointPost200Response](docs/V1EndpointPost200Response.md)
 - [V1EndpointPostRequest](docs/V1EndpointPostRequest.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

team@openapitools.org

