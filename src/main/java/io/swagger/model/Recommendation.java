package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The root of the recommendation type&#39;s schema.
 */
@ApiModel(description = "The root of the recommendation type's schema.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-12T13:45:36.790+08:00")

public class Recommendation   {
  @JsonProperty("product_id")
  private String productId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("img")
  private String img = null;

  @JsonProperty("images")
  @Valid
  private List<String> images = null;

  @JsonProperty("documents")
  private String documents = null;

  @JsonProperty("features")
  private String features = null;

  @JsonProperty("shipping")
  private Integer shipping = null;

  @JsonProperty("caption")
  private String caption = null;

  @JsonProperty("price")
  private Integer price = null;

  @JsonProperty("subCat")
  private Integer subCat = null;

  @JsonProperty("recommended")
  private String recommended = null;

  public Recommendation productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(value = "")


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public Recommendation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Recommendation title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Recommendation img(String img) {
    this.img = img;
    return this;
  }

  /**
   * Get img
   * @return img
  **/
  @ApiModelProperty(value = "")


  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public Recommendation images(List<String> images) {
    this.images = images;
    return this;
  }

  public Recommendation addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<String>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
  **/
  @ApiModelProperty(value = "")


  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public Recommendation documents(String documents) {
    this.documents = documents;
    return this;
  }

  /**
   * Get documents
   * @return documents
  **/
  @ApiModelProperty(value = "")


  public String getDocuments() {
    return documents;
  }

  public void setDocuments(String documents) {
    this.documents = documents;
  }

  public Recommendation features(String features) {
    this.features = features;
    return this;
  }

  /**
   * Get features
   * @return features
  **/
  @ApiModelProperty(value = "")


  public String getFeatures() {
    return features;
  }

  public void setFeatures(String features) {
    this.features = features;
  }

  public Recommendation shipping(Integer shipping) {
    this.shipping = shipping;
    return this;
  }

  /**
   * Get shipping
   * @return shipping
  **/
  @ApiModelProperty(value = "")


  public Integer getShipping() {
    return shipping;
  }

  public void setShipping(Integer shipping) {
    this.shipping = shipping;
  }

  public Recommendation caption(String caption) {
    this.caption = caption;
    return this;
  }

  /**
   * Get caption
   * @return caption
  **/
  @ApiModelProperty(value = "")


  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public Recommendation price(Integer price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")


  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Recommendation subCat(Integer subCat) {
    this.subCat = subCat;
    return this;
  }

  /**
   * Get subCat
   * @return subCat
  **/
  @ApiModelProperty(value = "")


  public Integer getSubCat() {
    return subCat;
  }

  public void setSubCat(Integer subCat) {
    this.subCat = subCat;
  }

  public Recommendation recommended(String recommended) {
    this.recommended = recommended;
    return this;
  }

  /**
   * Get recommended
   * @return recommended
  **/
  @ApiModelProperty(value = "")


  public String getRecommended() {
    return recommended;
  }

  public void setRecommended(String recommended) {
    this.recommended = recommended;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recommendation recommendation = (Recommendation) o;
    return Objects.equals(this.productId, recommendation.productId) &&
        Objects.equals(this.name, recommendation.name) &&
        Objects.equals(this.title, recommendation.title) &&
        Objects.equals(this.img, recommendation.img) &&
        Objects.equals(this.images, recommendation.images) &&
        Objects.equals(this.documents, recommendation.documents) &&
        Objects.equals(this.features, recommendation.features) &&
        Objects.equals(this.shipping, recommendation.shipping) &&
        Objects.equals(this.caption, recommendation.caption) &&
        Objects.equals(this.price, recommendation.price) &&
        Objects.equals(this.subCat, recommendation.subCat) &&
        Objects.equals(this.recommended, recommendation.recommended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, name, title, img, images, documents, features, shipping, caption, price, subCat, recommended);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recommendation {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    subCat: ").append(toIndentedString(subCat)).append("\n");
    sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
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

