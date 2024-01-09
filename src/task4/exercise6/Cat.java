package task4.exercise6;

public class Cat extends Mammal {

  // Cat zippy = new Cat("Zippy");
  public Cat(String name) {
    super(name);
  }

  public void greets() {
    System.out.println("Meow");
  }

  @Override
  public String toString() {
    return "Cat[%s]".formatted(super.toString());
    // Cat[Mammal[Animal[name="Zippy"]]]
  }
}
