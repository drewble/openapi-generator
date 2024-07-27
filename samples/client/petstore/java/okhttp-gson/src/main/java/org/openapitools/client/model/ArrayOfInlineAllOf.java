/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ArrayOfInlineAllOfArrayAllofDogPropertyInner;

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
 * ArrayOfInlineAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 8.0.0-SNAPSHOT")
public class ArrayOfInlineAllOf {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ARRAY_ALLOF_DOG_PROPERTY = "array_allof_dog_property";
  @SerializedName(SERIALIZED_NAME_ARRAY_ALLOF_DOG_PROPERTY)
  private List<ArrayOfInlineAllOfArrayAllofDogPropertyInner> arrayAllofDogProperty = new ArrayList<>();

  public ArrayOfInlineAllOf() {
  }

  public ArrayOfInlineAllOf id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public ArrayOfInlineAllOf name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ArrayOfInlineAllOf arrayAllofDogProperty(List<ArrayOfInlineAllOfArrayAllofDogPropertyInner> arrayAllofDogProperty) {
    this.arrayAllofDogProperty = arrayAllofDogProperty;
    return this;
  }

  public ArrayOfInlineAllOf addArrayAllofDogPropertyItem(ArrayOfInlineAllOfArrayAllofDogPropertyInner arrayAllofDogPropertyItem) {
    if (this.arrayAllofDogProperty == null) {
      this.arrayAllofDogProperty = new ArrayList<>();
    }
    this.arrayAllofDogProperty.add(arrayAllofDogPropertyItem);
    return this;
  }

  /**
   * Get arrayAllofDogProperty
   * @return arrayAllofDogProperty
   */
  @javax.annotation.Nullable
  public List<ArrayOfInlineAllOfArrayAllofDogPropertyInner> getArrayAllofDogProperty() {
    return arrayAllofDogProperty;
  }

  public void setArrayAllofDogProperty(List<ArrayOfInlineAllOfArrayAllofDogPropertyInner> arrayAllofDogProperty) {
    this.arrayAllofDogProperty = arrayAllofDogProperty;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ArrayOfInlineAllOf instance itself
   */
  public ArrayOfInlineAllOf putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayOfInlineAllOf arrayOfInlineAllOf = (ArrayOfInlineAllOf) o;
    return Objects.equals(this.id, arrayOfInlineAllOf.id) &&
        Objects.equals(this.name, arrayOfInlineAllOf.name) &&
        Objects.equals(this.arrayAllofDogProperty, arrayOfInlineAllOf.arrayAllofDogProperty)&&
        Objects.equals(this.additionalProperties, arrayOfInlineAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, arrayAllofDogProperty, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayOfInlineAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arrayAllofDogProperty: ").append(toIndentedString(arrayAllofDogProperty)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("array_allof_dog_property");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ArrayOfInlineAllOf
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ArrayOfInlineAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArrayOfInlineAllOf is not found in the empty JSON string", ArrayOfInlineAllOf.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ArrayOfInlineAllOf.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("array_allof_dog_property") != null && !jsonObj.get("array_allof_dog_property").isJsonNull()) {
        JsonArray jsonArrayarrayAllofDogProperty = jsonObj.getAsJsonArray("array_allof_dog_property");
        if (jsonArrayarrayAllofDogProperty != null) {
          // ensure the json data is an array
          if (!jsonObj.get("array_allof_dog_property").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `array_allof_dog_property` to be an array in the JSON string but got `%s`", jsonObj.get("array_allof_dog_property").toString()));
          }

          // validate the optional field `array_allof_dog_property` (array)
          for (int i = 0; i < jsonArrayarrayAllofDogProperty.size(); i++) {
            ArrayOfInlineAllOfArrayAllofDogPropertyInner.validateJsonElement(jsonArrayarrayAllofDogProperty.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArrayOfInlineAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArrayOfInlineAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArrayOfInlineAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArrayOfInlineAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ArrayOfInlineAllOf>() {
           @Override
           public void write(JsonWriter out, ArrayOfInlineAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ArrayOfInlineAllOf read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ArrayOfInlineAllOf instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ArrayOfInlineAllOf given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ArrayOfInlineAllOf
   * @throws IOException if the JSON string is invalid with respect to ArrayOfInlineAllOf
   */
  public static ArrayOfInlineAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArrayOfInlineAllOf.class);
  }

  /**
   * Convert an instance of ArrayOfInlineAllOf to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

