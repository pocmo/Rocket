
package org.mozilla.rocket.portal.indiatimes;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tp",
    "cp",
    "pp"
})
public class Pg {

    @JsonProperty("tp")
    private Integer tp;
    @JsonProperty("cp")
    private Integer cp;
    @JsonProperty("pp")
    private Integer pp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tp")
    public Integer getTp() {
        return tp;
    }

    @JsonProperty("tp")
    public void setTp(Integer tp) {
        this.tp = tp;
    }

    @JsonProperty("cp")
    public Integer getCp() {
        return cp;
    }

    @JsonProperty("cp")
    public void setCp(Integer cp) {
        this.cp = cp;
    }

    @JsonProperty("pp")
    public Integer getPp() {
        return pp;
    }

    @JsonProperty("pp")
    public void setPp(Integer pp) {
        this.pp = pp;
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
