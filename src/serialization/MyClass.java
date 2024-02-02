package serialization;

import java.io.Serializable;

public class MyClass implements Serializable {

  private int year;
  private String secret;

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }
}
