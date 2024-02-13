package module3.generics;

public class MyArray <T> {

  private final T[] elements;

  public MyArray(T[] elements) {
    this.elements = elements;
  }

  public T[] getElements() {
    return elements;
  }

  public boolean findObject(T value) {
    for (T e: elements) {
      if (e.equals(value)) {
        return true;
      }
    }

    return false;
  }
}
