package exceptions;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter size limit: ");
    int limit = Integer.parseInt(scanner.nextLine());

    System.out.print("Enter text: ");
    String text = scanner.nextLine();

    TextValidator textValidator = new TextValidator(limit);
    try {
      textValidator.readPost(text);
    } catch (MyCheckedException e) {
      System.err.println("You met size constraints! size <= " + limit);
    } catch (MyUncheckedException e) {
      System.err.println("Please, don't use bad words!");
      System.err.println(e.getMessage());
    }
  }

  private static void npeShowcase() {
    StringBuilder stringBuilder = null;
    expectStringBuilder(stringBuilder);
  }

  private static void expectStringBuilder(StringBuilder stringBuilder) {
    stringBuilder.append(" -- hello from my method");
  }

  private static void arithmeticException() {
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println( a / b );
  }

  private static void checkHumanAge() {
    try {
      int age = scanner.nextInt();
      isHumanAge(age);

    } catch (RuntimeException e) {
      System.err.printf("Exception type: %s\n", e.getClass());
      System.err.printf("We failed due to: %s", e.getMessage());
    }
  }

  private static void sampleRunner() {
    System.out.println("Enter option: ");
    int option = scanner.nextInt();

    if (option == 1) {
      exceptionCatching();
    } else {
      exceptionIsNotCatched();
    }

    System.out.println("Bye!");
  }

  static void exceptionCatching() {
    try {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      System.out.println(a + b);
    } catch (NumberFormatException e) {
      e.printStackTrace();
      System.err.println(
          "There is a problem! Input mismatch e, you must write TWO INTEGER VALUES!");
    } catch (NoSuchElementException | StringIndexOutOfBoundsException e) {

    } catch (ArithmeticException e) {
      throw new RuntimeException();
    }
  }

  static void exceptionIsNotCatched() {
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println(a + b);
  }

  static void isHumanAge(int age) {
    if (age < 0 || age > 123) {
      // Stack Trace - начинайте анализ снизу вверх
      // Stack = Стэк (методами, и другими важными вещами в коде)
      // Trace = След
      throw new RuntimeException("Human can't live that long for now...");
    }
    System.out.println("Yes, it's possible!");
  }
}
