
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
    "hl",
    "id",
    "images",
    "pn",
    "dl",
    "tn",
    "pnu",
    "fu",
    "mwu",
    "m"
})
public class Item {

    @JsonProperty("hl")
    private String hl;
    @JsonProperty("id")
    private String id;
    @JsonProperty("images")
    private List<String> images = null;
    @JsonProperty("pn")
    private String pn;
    @JsonProperty("dl")
    private String dl;
    @JsonProperty("tn")
    private String tn;
    @JsonProperty("pnu")
    private String pnu;
    @JsonProperty("fu")
    private String fu;
    @JsonProperty("mwu")
    private String mwu;
    @JsonProperty("m")
    private String m;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hl")
    public String getHl() {
        return hl;
    }

    @JsonProperty("hl")
    public void setHl(String hl) {
        this.hl = hl;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("images")
    public List<String> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<String> images) {
        this.images = images;
    }

    @JsonProperty("pn")
    public String getPn() {
        return pn;
    }

    @JsonProperty("pn")
    public void setPn(String pn) {
        this.pn = pn;
    }

    @JsonProperty("dl")
    public String getDl() {
        return dl;
    }

    @JsonProperty("dl")
    public void setDl(String dl) {
        this.dl = dl;
    }

    @JsonProperty("tn")
    public String getTn() {
        return tn;
    }

    @JsonProperty("tn")
    public void setTn(String tn) {
        this.tn = tn;
    }

    @JsonProperty("pnu")
    public String getPnu() {
        return pnu;
    }

    @JsonProperty("pnu")
    public void setPnu(String pnu) {
        this.pnu = pnu;
    }

    @JsonProperty("fu")
    public String getFu() {
        return fu;
    }

    @JsonProperty("fu")
    public void setFu(String fu) {
        this.fu = fu;
    }

    @JsonProperty("mwu")
    public String getMwu() {
        return mwu;
    }

    @JsonProperty("mwu")
    public void setMwu(String mwu) {
        this.mwu = mwu;
    }

    @JsonProperty("m")
    public String getM() {
        return m;
    }

    @JsonProperty("m")
    public void setM(String m) {
        this.m = m;
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
