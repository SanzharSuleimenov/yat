package practice.exercise6;

public class Dog extends Mammal {

  public Dog(String name) {
    super(name);
  }

  // (static)compile time polymorphism = method overloading = перегрузка
  public void greets() {
    System.out.println("Woof");
  }

  // (static)compile time polymorphism = method overloading
  public void greets(Dog another) {
    System.out.println("Woooof");
  }

  // (dynamic)runtime polymorphism = method overriding = переопределение
  @Override
  public String toString() {
    return "Dog[%s]".formatted(super.toString());
    // Dog[Mammal[Animal[name="Rex"]]]
  }
}
