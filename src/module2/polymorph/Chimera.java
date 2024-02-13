package module2.polymorph;

public class Chimera extends MythicalAnimal {

  private int count;

  public Chimera(int count) {
    this.count = count;
  }

  @Override
  public void roar() {
    System.out.println("Chaaaiiiizzzzzkhhh!");
  }

  protected final String origins() {
    return "Europe";
  }

  public int cutOffTheHead() {
    if (count > 0) {
      return --count;
    }
    System.out.println("No heads left hero!");
    return 0;
  }
}
