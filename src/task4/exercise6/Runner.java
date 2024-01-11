package task4.exercise6;

public class Runner {

  public static void main(String[] args) {
    // 1. Reference переменная может ссылаться на объекты любых дочерних(subtype, children) классов
    // 2. Методы родительского(parent, root) класса могут быть переопределены в подклассах(дочерных, subtype, ...)
  }

  private static void polymorphismSample1() {
    Animal animal = new Animal("Rocket");
    Mammal mammal = new Mammal("Moby-Dick");

    Animal animalMammal = mammal;
    System.out.println(animalMammal);

    animalMammal = new Cat("Super kitten");
    System.out.println(animalMammal);

    Animal otherMammal = mammal;
    System.out.println(otherMammal);

    Object objectAnimal = animal;
    System.out.println(objectAnimal);

//    Mammal mammalAnimal = animal; Incorrect behavior
  }

  private static void call1() {
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
