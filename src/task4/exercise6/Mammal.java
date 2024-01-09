package task4.exercise6;

public class Mammal extends Animal {

  public Mammal(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return "Mammal[%s]".formatted(super.toString());
    // Mammal[Animal[name="Skippy"]]
  }
}
