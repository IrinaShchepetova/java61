import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Minimum {
    @Override
    public String toString(){
        return "Minimum{"+
                "Metric="+metric+
                "Unit="+unit+'\''+
                ", UnitType="+unitType+
                ", Value="+value+
                '}';
    }
    @JsonProperty(value = "Metric")
    private Metric metric;
    @JsonProperty(value = "Unit")
    private String unit;
    @JsonProperty(value = "UnitType")
    private float unitType;
    @JsonProperty(value = "Value")
    private float value;

}

