
package org.mozilla.rocket.portal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "language",
        "title",
        "category",
        "subcategory",
        "keywords",
        "description",
        "tags",
        "detailUrl",
        "articleFrom",
        "publishTime",
        "coverPic",
        "province",
        "city",
        "summary"
})
public class Row {

    @JsonProperty("id")
    private String id;
    @JsonProperty("language")
    private String language;
    @JsonProperty("title")
    private String title;
    @JsonProperty("category")
    private String category;
    @JsonProperty("subcategory")
    private String subcategory;
    @JsonProperty("keywords")
    private String keywords;
    @JsonProperty("description")
    private String description;
    @JsonProperty("tags")
    private List<Object> tags = null;
    @JsonProperty("detailUrl")
    private String detailUrl;
    @JsonProperty("articleFrom")
    private String articleFrom;
    @JsonProperty("publishTime")
    private Long publishTime;
    @JsonProperty("coverPic")
    private List<String> coverPic = null;
    @JsonProperty("province")
    private String province;
    @JsonProperty("city")
    private String city;
    @JsonProperty("summary")
    private String summary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("subcategory")
    public String getSubcategory() {
        return subcategory;
    }

    @JsonProperty("subcategory")
    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    @JsonProperty("keywords")
    public String getKeywords() {
        return keywords;
    }

    @JsonProperty("keywords")
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    @JsonProperty("detailUrl")
    public String getDetailUrl() {
        return detailUrl;
    }

    @JsonProperty("detailUrl")
    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    @JsonProperty("articleFrom")
    public String getArticleFrom() {
        return articleFrom;
    }

    @JsonProperty("articleFrom")
    public void setArticleFrom(String articleFrom) {
        this.articleFrom = articleFrom;
    }

    @JsonProperty("publishTime")
    public Long getPublishTime() {
        return publishTime;
    }

    @JsonProperty("publishTime")
    public void setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
    }

    @JsonProperty("coverPic")
    public List<String> getCoverPic() {
        return coverPic;
    }

    @JsonProperty("coverPic")
    public void setCoverPic(List<String> coverPic) {
        this.coverPic = coverPic;
    }

    @JsonProperty("province")
    public String getProvince() {
        return province;
    }

    @JsonProperty("province")
    public void setProvince(String province) {
        this.province = province;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
