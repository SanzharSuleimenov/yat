package deserialization;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import serialization.MyClass;


public class Main {

  private static final String RELATIVE_PATH =
      "resources" + File.separator + "serialized" + File.separator;

  public static void main(String[] args) {
    deserializing();
  }

  private static void deserializing() {
    try (
        FileInputStream fis = new FileInputStream(RELATIVE_PATH + "serial");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis)) {

      Object object = ois.readObject();
      MyClass myClass = (MyClass) object;

      System.out.println(myClass.getPrivateKey());
      System.out.println(myClass.getPublicKey());
      System.out.println(myClass.getYear());

    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
