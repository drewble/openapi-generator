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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.client.model.Category;
import org.openapitools.client.model.Tag;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Pet
 */
@JsonPropertyOrder({
  Pet.JSON_PROPERTY_ID,
  Pet.JSON_PROPERTY_CATEGORY,
  Pet.JSON_PROPERTY_NAME,
  Pet.JSON_PROPERTY_PHOTO_URLS,
  Pet.JSON_PROPERTY_TAGS,
  Pet.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 8.0.0-SNAPSHOT")
public class Pet {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private Category category;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PHOTO_URLS = "photoUrls";
  private Set<String> photoUrls;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<Tag> tags;

  /**
   * pet status in the store
   */
  public enum StatusEnum {
    AVAILABLE("available"),
    
    PENDING("pending"),
    
    SOLD("sold");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public Pet() {
  }

  /**
   * Constructor with all args parameters
   */
  public Pet(@JsonProperty(JSON_PROPERTY_ID) Long id, @JsonProperty(JSON_PROPERTY_CATEGORY) Category category, @JsonProperty(JSON_PROPERTY_NAME) String name, @JsonProperty(JSON_PROPERTY_PHOTO_URLS) Set<String> photoUrls, @JsonProperty(JSON_PROPERTY_TAGS) List<Tag> tags, @JsonProperty(JSON_PROPERTY_STATUS) StatusEnum status) {
    this.id = id;
    this.category = category;
    this.name = name;
    this.photoUrls = photoUrls;
    this.tags = tags;
    this.status = status;
  }

  public Pet id(Long id) {
    
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }

  public Pet category(Category category) {
    
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Category getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(Category category) {
    this.category = category;
  }

  public Pet name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }

  public Pet photoUrls(Set<String> photoUrls) {
    
    this.photoUrls = photoUrls;
    return this;
  }

  public Pet addPhotoUrlsItem(String photoUrlsItem) {
    if (this.photoUrls == null) {
      this.photoUrls = new LinkedHashSet<>();
    }
    this.photoUrls.add(photoUrlsItem);
    return this;
  }

  /**
   * Get photoUrls
   * @return photoUrls
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PHOTO_URLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<String> getPhotoUrls() {
    return photoUrls;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_PHOTO_URLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPhotoUrls(Set<String> photoUrls) {
    this.photoUrls = photoUrls;
  }

  public Pet tags(List<Tag> tags) {
    
    this.tags = tags;
    return this;
  }

  public Pet addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Tag> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public Pet status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

  /**
   * pet status in the store
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pet pet = (Pet) o;
    return Objects.equals(this.id, pet.id) &&
        Objects.equals(this.category, pet.category) &&
        Objects.equals(this.name, pet.name) &&
        Objects.equals(this.photoUrls, pet.photoUrls) &&
        Objects.equals(this.tags, pet.tags) &&
        Objects.equals(this.status, pet.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category, name, photoUrls, tags, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pet {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

  public static class Builder {

    private Pet instance;

    public Builder() {
      this(new Pet());
    }

    protected Builder(Pet instance) {
      this.instance = instance;
    }

    public Pet.Builder id(Long id) {
      this.instance.id = id;
      return this;
    }
    public Pet.Builder category(Category category) {
      this.instance.category = category;
      return this;
    }
    public Pet.Builder name(String name) {
      this.instance.name = name;
      return this;
    }
    public Pet.Builder photoUrls(Set<String> photoUrls) {
      this.instance.photoUrls = photoUrls;
      return this;
    }
    public Pet.Builder tags(List<Tag> tags) {
      this.instance.tags = tags;
      return this;
    }
    public Pet.Builder status(StatusEnum status) {
      this.instance.status = status;
      return this;
    }


    /**
    * returns a built Pet instance.
    *
    * The builder is not reusable.
    */
    public Pet build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field.
  */
  public static Pet.Builder builder() {
    return new Pet.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public Pet.Builder toBuilder() {
    return new Pet.Builder()
      .id(getId())
      .category(getCategory())
      .name(getName())
      .photoUrls(getPhotoUrls())
      .tags(getTags())
      .status(getStatus());
  }


}

