import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Metric {
    @Override
    public String toString(){
        return "Metric{"+
                "Unit="+unit+'\''+
                ", UnitType="+unitType+
                ", Value="+value+
                '}';
    }
    @JsonProperty(value = "Unit")
    private String unit;
    @JsonProperty(value = "UnitType")
    private float unitType;
    @JsonProperty(value = "Value")
    private float value;

}