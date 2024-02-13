package module2.exceptions;

/**
 * This is our custom Checked exception.
 */
public class MyCheckedException extends Exception {

  public MyCheckedException() {

  }

  public MyCheckedException(String message) {
    super(message);
  }
}
