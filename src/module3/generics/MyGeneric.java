package module3.generics;

public class MyGeneric <T> {

  private T field;

  public MyGeneric(T field) {
    this.field = field;
  }

  public T getField() {
    return field;
  }

  public T setField(T field) {
    this.field = field;
    return field;
  }

  @Override
  public String toString() {
    return "MyGeneric{" +
        "field=" + field +
        '}';
  }
}
