import java.util.HashMap;
import java.util.Map;

public class LengthFactory {

  Map<String, LengthConvert> map;

  public LengthFactory() {
    map = new HashMap<>();
    map.put("f", new ConvertFromFoot());
    map.put("yard", new ConvertFromYard());
    map.put("inch", new ConvertFromInch());
  }

  public LengthConvert getLength(String u) {
    return map.get(u);
  }
}
