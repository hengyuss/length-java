import java.util.HashMap;
import java.util.Map;

public class ConvertFromFoot extends LengthConvert {


  @Override
  Map<String, Double> getCondition() {
    Map<String, Double> map = new HashMap<>();
    map.put("yard", (double) 1 / 3);
    map.put("inch", 12.00);
    map.put("f",1.00);
    return map;
  }
}
