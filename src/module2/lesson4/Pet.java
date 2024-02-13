package module2.lesson4;

public class Pet extends Animal {

  private String name;
  private double height;
  private double width;
  private double weight;
  private String breed;
  private String sound;
  private int legs;

  public Pet(String name, double height, double width, double weight, String breed, String sound,
      int legs) {
    this.name = name;
    this.height = height;
    this.width = width;
    this.weight = weight;
    this.breed = breed;
    this.sound = sound;
    this.legs = legs;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public String getSound() {
    return sound;
  }

  public void setSound(String sound) {
    this.sound = sound;
  }

  public int getLegs() {
    return legs;
  }

  public void setLegs(int legs) {
    this.legs = legs;
  }

  protected void makeSound() {
    System.out.println(name + " says " + sound);
  }

  public void someMethod() {
    System.out.println("Hello, I'm a Pet! But this method is private...");
  }
}
