package typechecking;

public class Main {

  public static void main(String[] args) {
    Shape circle = new Circle(1);
    Shape rectangle = new Rectangle(2, 3);
    Shape triangle = new Triangle(4, 5, 6);

    System.out.println(doSomething(circle));
    System.out.println(doSomething(rectangle));
    System.out.println(doSomething(triangle));
  }

  private static void dumbChecking() {
    Shape circle = new Circle(1);
    Shape rectangle = new Rectangle(2, 3);
    Shape triangle = new Triangle(4, 5, 6);

    System.out.println(circle.getClass());
    System.out.println(triangle.getClass());
    System.out.println(rectangle.getClass());

    if (circle.getClass() == Circle.class) {
      System.out.println("It's a circle!");
    }
    if (circle.getClass().equals(Shape.class)) {
      System.out.println("It's a shape");
    }


  }

  private static void betterChecking() {
    Shape circle = new Circle(1);

    if (circle instanceof Circle) {
      System.out.println("It's circle!");
    }

    if (circle instanceof Shape) {
      System.out.println("It's a shape!");
    }
  }

  private static void edgeCase() {
    Shape circle = new Circle(1);
    Shape rectangle = new Rectangle(2, 3);

    if (circle instanceof Shape) {
      System.out.println("It's a shape!");
    }
    if (rectangle instanceof Shape) {
      System.out.println("It's a shape!");
    }
    if (circle instanceof Rectangle) {
      System.out.println("It's a rectangle!");
    }
    if (rectangle instanceof Circle) {
      System.out.println("It's circle!");
    }
  }

  private static void badMapping() {
    Shape circle = new Circle(1);

    if (circle instanceof Circle) {
      Circle circle1 = (Circle) circle;
      System.out.println(circle1);
    }

    Triangle triangle = (Triangle) circle;
    System.out.println(triangle);
  }

  private static void betterMapping() {
    // pattern matching

    Shape circle = new Circle(1);
    Shape rectangle = new Rectangle(2, 3);
    Shape triangle = new Triangle(4, 5, 6);

    if (circle instanceof Circle c) {
      System.out.println(c);
    }

    if (rectangle instanceof Rectangle r) {
      System.out.println(r);
    }

    if (triangle instanceof Triangle t) {
      System.out.println(t);
    }
  }

  private static double doSomething(Shape shape) {
    // pattern matching
    return switch (shape) {
      case Circle c -> c.circleLength();
      case Triangle t -> t.perimeter();
      case Rectangle r -> r.perimeter();
      default -> throw new IllegalStateException("Unexpected value: " + shape);
    };
  }
}
