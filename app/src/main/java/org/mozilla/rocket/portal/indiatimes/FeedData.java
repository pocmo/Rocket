
package org.mozilla.rocket.portal.indiatimes;

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
    "resTime",
    "status",
    "brandInfo",
    "debugInfo",
    "itemsFound",
    "pg",
    "items"
})
public class FeedData {

    @JsonProperty("resTime")
    private Integer resTime;
    @JsonProperty("status")
    private String status;
    @JsonProperty("brandInfo")
    private BrandInfo brandInfo;
    @JsonProperty("debugInfo")
    private DebugInfo debugInfo;
    @JsonProperty("itemsFound")
    private Integer itemsFound;
    @JsonProperty("pg")
    private Pg pg;
    @JsonProperty("items")
    private List<Item> items = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("resTime")
    public Integer getResTime() {
        return resTime;
    }

    @JsonProperty("resTime")
    public void setResTime(Integer resTime) {
        this.resTime = resTime;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("brandInfo")
    public BrandInfo getBrandInfo() {
        return brandInfo;
    }

    @JsonProperty("brandInfo")
    public void setBrandInfo(BrandInfo brandInfo) {
        this.brandInfo = brandInfo;
    }

    @JsonProperty("debugInfo")
    public DebugInfo getDebugInfo() {
        return debugInfo;
    }

    @JsonProperty("debugInfo")
    public void setDebugInfo(DebugInfo debugInfo) {
        this.debugInfo = debugInfo;
    }

    @JsonProperty("itemsFound")
    public Integer getItemsFound() {
        return itemsFound;
    }

    @JsonProperty("itemsFound")
    public void setItemsFound(Integer itemsFound) {
        this.itemsFound = itemsFound;
    }

    @JsonProperty("pg")
    public Pg getPg() {
        return pg;
    }

    @JsonProperty("pg")
    public void setPg(Pg pg) {
        this.pg = pg;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
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
