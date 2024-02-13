package typechecking;

public class Rectangle extends Shape {

  int a;
  int b;

  Rectangle(int a, int b) {
    this.a = a;
    this.b = b;
  }

  int perimeter() {
    return 2 * (this.a + this.b);
  }

  @Override
  public String toString() {
    return "Rectangle{}";
  }
}
