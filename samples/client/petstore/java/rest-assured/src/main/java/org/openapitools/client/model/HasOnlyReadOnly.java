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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * HasOnlyReadOnly
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 8.0.0-SNAPSHOT")
public class HasOnlyReadOnly {
  public static final String SERIALIZED_NAME_BAR = "bar";
  @SerializedName(SERIALIZED_NAME_BAR)
  private String bar;

  public static final String SERIALIZED_NAME_FOO = "foo";
  @SerializedName(SERIALIZED_NAME_FOO)
  private String foo;

  public HasOnlyReadOnly() {
  }
  /**
   * Constructor with only readonly parameters
   */
  
  public HasOnlyReadOnly(
     String bar, 
     String foo
  ) {
    this();
    this.bar = bar;
    this.foo = foo;
  }

  /**
   * Get bar
   * @return bar
   */
  @javax.annotation.Nullable


  public String getBar() {
    return bar;
  }



  /**
   * Get foo
   * @return foo
   */
  @javax.annotation.Nullable


  public String getFoo() {
    return foo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HasOnlyReadOnly hasOnlyReadOnly = (HasOnlyReadOnly) o;
    return Objects.equals(this.bar, hasOnlyReadOnly.bar) &&
        Objects.equals(this.foo, hasOnlyReadOnly.foo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bar, foo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HasOnlyReadOnly {\n");
    sb.append("    bar: ").append(toIndentedString(bar)).append("\n");
    sb.append("    foo: ").append(toIndentedString(foo)).append("\n");
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

}

