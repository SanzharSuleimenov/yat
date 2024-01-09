package task4.exercise6;

public class Dog extends Mammal {

  public Dog(String name) {
    super(name);
  }

  public void greets() {
    System.out.println("Woof");
  }

  public void greets(Dog another) {
    System.out.println("Woooof");
  }

  @Override
  public String toString() {
    return "Dog[%s]".formatted(super.toString());
    // Dog[Mammal[Animal[name="Rex"]]]
  }
}
