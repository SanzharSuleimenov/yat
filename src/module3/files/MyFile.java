package module3.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFile {

  private String path;

  public MyFile(String path) {
    this.path = path;
  }

  public String getPath() {
    return path;
  }

  void write(String text) throws IOException {
    FileWriter fileWriter = new FileWriter(path);
    fileWriter.write(text);
    fileWriter.close();
  }

  void print(String text) throws IOException {
    PrintWriter printWriter = new PrintWriter(path);
    printWriter.print(text);
    printWriter.close();
  }

  void safeWrite(String text) {
    // try-with-resources
    // close() will be called automatically on code block finish
    // FileWriter fileWriter = new FileWriter(path) <- is a resource
    // FileWriter implements Closeable
    try (FileWriter fileWriter = new FileWriter(path)) {
      fileWriter.write(text);
    } catch (IOException e) {
      System.err.println("Couldn't write to a file! Reason: " + e.getMessage());
    } finally {
      System.out.println("Safe writing ended.");
    }
  }

  void safePrint(String text) {
    try (PrintWriter printWriter = new PrintWriter(path)) {
      printWriter.print(text);
    } catch (IOException e) {
      System.err.println("Couldn't write to a file! Reason: " + e.getMessage());
    } finally {
      System.out.println("Safe writing ended.");
    }
  }

  void safeAppend(String text) {
    try (FileWriter fileWriter = new FileWriter(path, true)) {
      fileWriter.write(text);
    } catch (IOException e) {
      System.err.println("Couldn't write to a file! Reason: " + e.getMessage());
    } finally {
      System.out.println("Safe writing ended.");
    }
  }

  void safePrintAppend(String text) {
    try (PrintWriter printWriter = new PrintWriter(new FileWriter(path, true))) {
      printWriter.println();
      printWriter.append(text);
    } catch (IOException e) {
      System.err.println("Couldn't write to a file! Reason: " + e.getMessage());
    } finally {
      System.out.println("Safe writing ended.");
    }
  }

  /**
   * Method create module3.files / dir passed by the path
   *
   * @return
   */
  boolean createFile() {
    File file = new File(path); // instantiating Java object, not a real file/dir
    boolean result = false;

    try {
      result = file.createNewFile();
    } catch (SecurityException s) {
      s.printStackTrace();
      System.err.println("Access denied!");
    } catch (IOException e) {
      e.printStackTrace();
      System.err.println("IO Failure");
    }

    return result;
  }

  /**
   * Creates only one directory. It doesn't create root directories.
   *
   * @return
   */
  boolean createDirectory() {
    return (new File(path)).mkdir();
  }

  /**
   * Creates directory. If root directory is missing, then creates it.
   *
   * @return
   */
  boolean createDirectories() {
    return (new File(path)).mkdirs();
  }

  boolean exists() {
    File file = new File(path);

    return file.exists();
  }

  boolean isDirectory() {
    File file = new File(path);

    return file.isDirectory();
  }

  boolean isFile() {
    File file = new File(path);

    return file.isFile();
  }
}
