package module3.typechecking;

public class Circle extends Shape {

  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  double circleLength() {
    return 2 * Math.PI * this.radius;
  }

  @Override
  public String toString() {
    return "Circle{radius=%d}".formatted(radius);
  }
}
