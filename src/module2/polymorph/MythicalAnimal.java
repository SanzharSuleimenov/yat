package module2.polymorph;

public class MythicalAnimal {

  // static methods cannot be overridden
  protected static void protectTerritory() {
    System.out.println("Mythical protection");
  }

  protected String origins() {
    return "Earth";
  }

  protected void roar() {
    System.out.println("Whohowhohaohoahoh!");
  }

  public static void main(String[] args) {
    // 1. Reference переменная может ссылаться на объекты любых дочерних(subtype, children) классов
    // 2. Методы родительского(parent, root) класса могут быть переопределены в подклассах(дочерных, subtype, ...)

    MythicalAnimal mythicalAnimal = new MythicalAnimal();
    MythicalAnimal wowChimera = new Chimera(3);
    MythicalAnimal dragonBall = new Dragon();

    mythicalAnimal.roar();
    wowChimera.roar();
    dragonBall.roar();

    Chimera c1 = new Chimera(3);
    c1.roar();
    int count = c1.cutOffTheHead();
    System.out.println(count);
  }
}
