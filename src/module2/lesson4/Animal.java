package module2.lesson4;

public class Animal {

  private String livingArea = "City";

  public String getLivingArea() {
    return livingArea;
  }

  public void setLivingArea(String livingArea) {
    this.livingArea = livingArea;
  }

  protected void someMethod() {
    System.out.println("Hello, I'm an Animal!");
  }

  @Override
  public String toString() {
    return "Animal{" +
        "livingArea='" + livingArea + '\'' +
        '}';
  }
}
