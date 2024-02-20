/*
 * OneOf test
 * OneOf test
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ResponseModelB
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-20T18:28:09.794317600+08:00[Asia/Singapore]")
public class ResponseModelB {
  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private Integer expires;

  public static final String SERIALIZED_NAME_VALUE1 = "value_1";
  @SerializedName(SERIALIZED_NAME_VALUE1)
  private String value1;

  public static final String SERIALIZED_NAME_VALUE2 = "value_2";
  @SerializedName(SERIALIZED_NAME_VALUE2)
  private String value2;

  public static final String SERIALIZED_NAME_VALUE_TYPE = "value_type";
  @SerializedName(SERIALIZED_NAME_VALUE_TYPE)
  private String valueType;

  public ResponseModelB() {
  }

  public ResponseModelB expires(Integer expires) {
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/
  @javax.annotation.Nonnull
  public Integer getExpires() {
    return expires;
  }

  public void setExpires(Integer expires) {
    this.expires = expires;
  }


  public ResponseModelB value1(String value1) {
    this.value1 = value1;
    return this;
  }

   /**
   * Get value1
   * @return value1
  **/
  @javax.annotation.Nonnull
  public String getValue1() {
    return value1;
  }

  public void setValue1(String value1) {
    this.value1 = value1;
  }


  public ResponseModelB value2(String value2) {
    this.value2 = value2;
    return this;
  }

   /**
   * Get value2
   * @return value2
  **/
  @javax.annotation.Nullable
  public String getValue2() {
    return value2;
  }

  public void setValue2(String value2) {
    this.value2 = value2;
  }


  public ResponseModelB valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @javax.annotation.Nullable
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseModelB responseModelB = (ResponseModelB) o;
    return Objects.equals(this.expires, responseModelB.expires) &&
        Objects.equals(this.value1, responseModelB.value1) &&
        Objects.equals(this.value2, responseModelB.value2) &&
        Objects.equals(this.valueType, responseModelB.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expires, value1, value2, valueType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseModelB {\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    value1: ").append(toIndentedString(value1)).append("\n");
    sb.append("    value2: ").append(toIndentedString(value2)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("expires");
    openapiFields.add("value_1");
    openapiFields.add("value_2");
    openapiFields.add("value_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expires");
    openapiRequiredFields.add("value_1");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ResponseModelB
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResponseModelB.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResponseModelB is not found in the empty JSON string", ResponseModelB.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResponseModelB.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResponseModelB` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResponseModelB.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("value_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value_1").toString()));
      }
      if ((jsonObj.get("value_2") != null && !jsonObj.get("value_2").isJsonNull()) && !jsonObj.get("value_2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value_2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value_2").toString()));
      }
      if ((jsonObj.get("value_type") != null && !jsonObj.get("value_type").isJsonNull()) && !jsonObj.get("value_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResponseModelB.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseModelB' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseModelB> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseModelB.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseModelB>() {
           @Override
           public void write(JsonWriter out, ResponseModelB value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseModelB read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResponseModelB given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseModelB
  * @throws IOException if the JSON string is invalid with respect to ResponseModelB
  */
  public static ResponseModelB fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseModelB.class);
  }

 /**
  * Convert an instance of ResponseModelB to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
