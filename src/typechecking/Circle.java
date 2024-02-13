package typechecking;

public class Circle extends Shape {

  int radius;

  Circle(int radius) {
    this.radius = radius;
  }

  double circleLength() {
    return 2 * Math.PI * this.radius;
  }

  @Override
  public String toString() {
    return "Circle{}";
  }
}
