package module2.lesson4;

public class Cat extends Pet {

  private int lives;

  public Cat(String name, double height, double width, double weight, String breed, String sound,
      int legs) {
    this(name, height, width, weight, breed, sound, legs, 9);
  }

  public Cat(String name, double height, double width, double weight, String breed, String sound,
      int legs, int lives) {
    super(name, height, width, weight, breed, sound, legs);
    this.lives = lives;
  }

  public int getLives() {
    return this.lives;
  }

  @Override
  public String toString() {
    // System.out.printf("Cat has %d lives. %s", lives, super.toString());
    return "Cat has %d lives. ".formatted(lives) + super.toString();
  }

  public void makeSound(int times) {
    for (int i = 0; i < times; i++) {
      makeSound();
    }
  }
}
