package module3.serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  private static final String RELATIVE_PATH =
      "resources" + File.separator + "serialized" + File.separator;

  public static void main(String[] args) throws IOException {
    serializing();
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

  private static void serializing() throws IOException {
    MyClass myObject = new MyClass();
    myObject.setYear(2024);
    myObject.setPublicKey("pub_key_2412342344");
    myObject.setPrivateKey("pri_key_72w873y32742842");

    File file = getSaveFile();

    try (
        FileOutputStream fos = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos)) {

      oos.writeObject(myObject);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static File getSaveFile() throws IOException {
    File dir = new File(RELATIVE_PATH);
    dir.mkdirs();
    File file = new File(RELATIVE_PATH + "serial");
    file.createNewFile();

    return file;
  }

  private static void intro() throws IOException {
    // module3.serialization
    // module3.deserialization
    /*
        stream -> Поток
        Water/General = A stream is a continuous body of surface water[1] flowing within the bed and banks of a channel.
        CS =            In computers, stream refers to the data that is transmitted when the content is consumed.

        Output Stream -> поток вывода
        Input Stream -> поток ввода
     */

    InputStream in = System.in; // console / terminal <- source (источник)
    Scanner scanner = new Scanner(in); // Scanner works with 'Console/Terminal input stream'
    String message = scanner.nextLine();

    PrintStream pOut = System.out; // console / terminal <- destination (пункт назначения/получатель)
    OutputStream oOut = System.out;

    pOut.println("input: " + message);
    oOut.write(1);
  }
}
