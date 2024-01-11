package polymorph;

public final class Dragon extends MythicalAnimal {

  @Override
  public void roar() {
    System.out.println("Rhooooooooaaaaaaar!");
  }

  public void roar(String speech) {
    System.out.println(speech);
  }

  protected static void protectTerritory() {
    System.out.println("Chimera protection");
  }

  public void fire() {
    System.out.println("Dragon strikes fire from his throat!!!!!");
  }
}
