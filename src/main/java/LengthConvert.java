import java.util.Map;

public abstract class LengthConvert {
  public Length convert(Length source, String u) {
    Map<String, Double> condition = getCondition();
    return new Length(source.getVal() * condition.get(u), u);
  }

  abstract Map<String, Double> getCondition();

}
