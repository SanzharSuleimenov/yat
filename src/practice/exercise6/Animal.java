package practice.exercise6;

public class Animal {

  private String name;

  public Animal(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Animal[name=\"%s\"]".formatted(name);
    //Animal a = new Animal("Skippy");
    // a.toString(); -> Animal[name="Skippy"]
  }
}
