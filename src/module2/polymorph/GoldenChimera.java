package module2.polymorph;

public class GoldenChimera extends Chimera {

  public GoldenChimera(int count) {
    super(count);
  }

  public GoldenChimera() {
    super(5);
  }

  @Override
  public void roar() {
    super.roar();
  }

  @Override
  public int cutOffTheHead() {
    return super.cutOffTheHead();
  }
}
