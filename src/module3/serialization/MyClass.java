package module3.serialization;

import java.io.Serializable;

public class MyClass implements Serializable {

  private static final long serialVersionUID = 12L;

  private int year;
  private String publicKey;
  private transient String privateKey;

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }
}
