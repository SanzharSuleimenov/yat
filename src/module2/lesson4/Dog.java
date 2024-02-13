package module2.lesson4;

public class Dog extends Pet {

  public Dog(String name, double height, double width, double weight, String breed, String sound,
      int legs) {
    super(name, height, width, weight, breed, sound, legs);
  }

  @Override // переопределения
  public String toString() {
    return super.toString();
  }
}
