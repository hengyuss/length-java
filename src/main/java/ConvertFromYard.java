import java.util.HashMap;
import java.util.Map;

public class ConvertFromYard extends LengthConvert {

  @Override
  public Map<String, Double> getCondition() {
    Map<String, Double> map = new HashMap<>();
    map.put("inch", 36.00);
    map.put("f", 3.00);
    map.put("yard", 1.00);
    return map;
  }
}
