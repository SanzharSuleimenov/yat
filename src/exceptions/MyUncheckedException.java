package exceptions;

/**
 * This is our custom Unchecked exception
 */
public class MyUncheckedException extends RuntimeException {

  public MyUncheckedException() {

  }

  public MyUncheckedException(String message) {
    super(message);
  }
}
