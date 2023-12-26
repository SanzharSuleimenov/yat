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

    Dog rex = new Dog(name, height, width, weight, breed, sound, legs);
    Cat kitty = new Cat("Kitty", height, width, weight, breed, sound, legs);
    Hamster space = new Hamster("Space", height, width, weight, breed, sound, legs);
    System.out.println(rex);
    System.out.println(kitty);
    System.out.println(space);
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
