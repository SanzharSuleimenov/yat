package lesson3;

public class Calculator {

  // overloading
  public static int sum(int a, int b) {
    return a + b;
  }

  public static int sum(int a, int b, int c) {
    return a + b + c;
  }

  public static int sum(int a, int b, int c, int d) {
    return a + b + c + d;
  }

  // var-arg
  public static int sum(int... integers) {
    int sum = 0;
    for (int i = 0; i < integers.length; i++) {
      sum += integers[i];
    }
    return sum;
  }

  public static double sum(double a, int b) { // sum(double, int)
    return a + b;
  }

  public static double sum(int a, double b) { // sum(int, double)
    return a + b;
  }

  public static double sum(double a, double b) {
    return a + b;
  }
}
