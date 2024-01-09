package task4.exercise6;

public class Runner {

  public static void main(String[] args) {
    Animal animal = new Animal("Rocket");
    Mammal mammal = new Mammal("Moby-Dick");
    Cat cat = new Cat("Kitty");
    Dog dog = new Dog("Snoop");

    System.out.println(animal);
    System.out.println(mammal);
    System.out.println(cat);
    System.out.println(dog);

    cat.greets();
    dog.greets();

    Dog scooby = new Dog("Scooby");
    dog.greets(scooby);
  }

  private void methodA() {
    Cat cat = new Cat("Aigul");
    cat.greets();
    System.out.println(cat);
  }
}
