package module3.generics;

import java.util.List;
import java.util.concurrent.TimeUnit;
import module3.generics.MyArray;
import module3.generics.MyGeneric;
import module3.generics.MyPair;
import module3.generics.inner.SomeClass;
import module3.typechecking.Circle;
import module3.typechecking.Shape;

public class Main {

  public static void main(String[] args) {
    SomeClass someClass = new SomeClass();
    someClass.publicField = "1";
  }

  private static void packagesAndClassNames() {
    System.out.println(Main.class.getCanonicalName());
    System.out.println(Main.class.getSimpleName());
    System.out.println(module2.abstracts.Main.class.getCanonicalName());
  }

  private static void genericsInJavaCollections() {
    List<Integer> integerList = List.of(1, 2, 3, 4);
    List<String> days = List.of("Monday", "Tuesday");
    List<TimeUnit> timeUnits = List.of(TimeUnit.MICROSECONDS, TimeUnit.MILLISECONDS,
        TimeUnit.SECONDS);
  }

  private static void myPairExample() {
    MyPair<String, String> barcelona = new MyPair<>("FC Barcelona",
        "Spain and Catalan football club");

    MyPair<String, Integer> friday = new MyPair<>("Friday", 5);

    MyPair<Integer, Integer> coordinate = new MyPair<>(1, 2);

    System.out.println(barcelona);
    System.out.println(friday);
    System.out.println(coordinate);
  }

  private static void customArray() {
    String[] names = new String[]{"Sanzhar", "Alisher", "Nargiza", "Talap", "Zhasulan", "Dmitriy",
        "Aruzhan"};
    Integer[] numbers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    MyArray<String> stringMyArray = new MyArray<>(names);
    MyArray<Integer> numbersMyArray = new MyArray<>(numbers);

    System.out.println(stringMyArray.findObject("Maxat"));
    System.out.println(stringMyArray.findObject("Talap"));

    System.out.println("---------");

    System.out.println(numbersMyArray.findObject(7));
    System.out.println(numbersMyArray.findObject(0));
  }

  private static void boxing() {
    // Box -> Коробка/Упаковка
    // Boxing / Unboxing -> Запаковать / Распаковать
    /*
    Boxing is the process of converting a primitive datatype into an object wrapper datatype,
    and unboxing is the process of converting a value from an object wrapper type back to the
    native primitive value.
    Further on, we can say that both boxing and unboxing operations are a subset of typecasting.

    Wrapper classes:
      int = Integer
      double = Double
      ...
      char = Character
     */

    Integer intWrapper = 1; // Boxing
    int iPrim = intWrapper; // Unboxing

    Double doubleWrapper = 1.0; // Boxing
    double dPrim = doubleWrapper; // Unboxing
  }

  private static void baseExample() {
    // Generic = Обощение

    MyGeneric<String> stringMyGeneric = new MyGeneric<>("Mocking bird");
    MyGeneric<Long> longMyGeneric = new MyGeneric<>(123L);
    MyGeneric<Shape> shapeMyGeneric = new MyGeneric<>(new Circle(1));

    // MyGeneric<int> intGeneric = new MyGeneric<int>(1); can't work with primitives

    System.out.println(shapeMyGeneric);
    System.out.println(stringMyGeneric);
    System.out.println(longMyGeneric);
  }
}
