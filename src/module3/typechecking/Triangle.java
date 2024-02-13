package module3.typechecking;

public class Triangle extends Shape {

  int a;
  int b;
  int c;

  Triangle(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  int perimeter() {
    return a + b + c;
  }

  @Override
  public String toString() {
    return "Triangle{}";
  }
}
