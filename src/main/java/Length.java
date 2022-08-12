public class Length {
  private final double value;
  private final String unit;


  public Length(double val, String uinnt) {
    this.value = val;
    this.unit = uinnt;
  }

  public Length as(String u) {
    LengthFactory factory = new LengthFactory();
    return factory.getLength(this.unit).convert(this, u);
  }

  public double getVal() {
    return this.value;
  }

  public String getUinnt() {
    return this.unit;
  }
}
