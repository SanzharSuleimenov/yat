package lesson4;

public class Hamster extends Pet {

  public Hamster(String name, double height, double width, double weight, String breed,
      String sound, int legs) {
    super(name, height, width, weight, breed, sound, legs);
  }

  @Override
  public String toString() {
    return "Hamster{" +
        "name='" + getName() + '\'' +
        ", weight=" + getWeight() +
        ", breed='" + getBreed() + '\'' +
        ", sound='" + getSound() + '\'' +
        ", legs=" + getLegs() +
        '}';
  }
}
