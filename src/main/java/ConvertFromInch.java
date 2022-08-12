import java.util.HashMap;
import java.util.Map;

public class ConvertFromInch extends LengthConvert {

  @Override
  Map<String, Double> getCondition() {
    Map<String, Double> map = new HashMap<>();
    map.put("f", (double) 1 / 12);
    map.put("yard", (double) 1 / 36);
    map.put("inch", 1.00);
    return map;
  }
}
