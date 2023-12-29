package lesson4;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String name = "T-Rex";
    double height = 1.3;
    double width = 0.4;
    double weight = 24;
    String breed = "Hunter";
    String sound = "Whaf-woof";
    int legs = 4;

    Pet rex = new Dog(name, height, width, weight, breed, sound, legs);
    Object o = rex;
    System.out.println(rex);
    System.out.println(rex.hashCode());
    System.out.println("------------------");
    System.out.println(o);
    System.out.println(o.hashCode());
  }

  private static void inheritanceExample() {
    String name = "T-Rex";
    double height = 1.3;
    double width = 0.4;
    double weight = 24;
    String breed = "Hunter";
    String sound = "Whaf-woof";
    int legs = 4;

    Pet rex = new Dog(name, height, width, weight, breed, sound, legs);
    Pet kitty = new Cat("Kitty", height, width / 2, weight, breed, "Meow Meow", legs, 12);
    Pet space = new Hamster("Space", height, width / 4.0, weight, breed, "Chwak Chwak", legs);

    if (kitty == rex) {
      System.out.println("Kit is Rex");
    }

    if (kitty.equals(rex)) {
      System.out.println("Rex is Kitty");
    }

    System.out.println(rex.getBreed());
    System.out.println(kitty);
    System.out.println(space.getWidth());
  }

  private static void case1() {
    Scanner scanner = new Scanner(System.in);

    String name = scanner.nextLine();
    double height = scanner.nextDouble();
    double width = scanner.nextDouble();
    double weight = scanner.nextDouble();
    scanner.nextLine();
    String breed = scanner.nextLine();
    String sound = scanner.nextLine();
    int legs = scanner.nextInt();

    Pet pet = new Pet(name, height, width, weight, breed, sound, legs);
    System.out.println(pet);
  }
}
