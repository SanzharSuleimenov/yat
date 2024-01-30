package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    MyFile file = instantiateFile();
    System.out.print("Enter text: ");
    String text = scanner.nextLine();
    file.safePrintAppend(text);
  }

  private static MyFile instantiateFile() {
    System.out.print("Input directory path: ");
    String dirPath = scanner.nextLine();
    MyFile directories = new MyFile(dirPath);

    if (!directories.isDirectory() || !directories.exists()) {
      System.err.println("Directory not found, or it's not a directory!");
      throw new RuntimeException("Not existing directory or directory at all");
    }

    System.out.print("Input file name: ");
    String filename = scanner.nextLine();
    String relativeFilePath = dirPath + File.separator + filename;
    MyFile myFile = new MyFile(relativeFilePath);

    if (!myFile.exists()) {
      boolean isCreated = myFile.createFile();
      if (!isCreated) {
        throw new RuntimeException("Can't create file!");
      }
    }

    System.out.printf("File exists? %s\n", myFile.exists());
    System.out.println("Final file directory is: " + myFile.getPath());

    return myFile;
  }

  private static void tryWithResources() {
    // try-with-resource
    try (FileWriter fileWriter = new FileWriter(
        Path.of("resources", "files", "students.txt").toString())) {
      fileWriter.write("Hello class!");
    } catch (IOException e) {
      System.err.println("Oops, error!");
    }
  }

  private static void uglyTryCatchFinally() {
    FileWriter fileWriter = null;
    try {
      fileWriter = new FileWriter(Path.of("resources", "files", "students.txt").toString());
      fileWriter.write("Hello, class!");
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        fileWriter.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }

  private static void usingPathClass() {
    Path path = Path.of("root", "child", "subchild");
    System.out.println(path.getFileName());
    System.out.println(path.getFileSystem());
    System.out.println(path.getParent());

    /*
      subchild
      sun.nio.fs.MacOSXFileSystem@56cbfb61
      root/child
     */
  }

  private static void workingWithDelimetersAndEscapeSequence() {
    String showDelimiter = ".\\root\\child\\file.jpg\nHaha-hehe-hihi\n\tOtstup";

    System.out.println(showDelimiter);
  }

  private static void createDirAndFile() throws IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Write directory: ");
    String directories = scanner.nextLine();
    File directory = new File(".\\%s".formatted(directories));
    directory.mkdirs();
    if (!directory.exists()) { // !false = true -> directory.mkdirs() == false
      throw new RuntimeException("Directories haven't been created!");
    }

    System.out.print("Write filename: ");
    String filename = scanner.nextLine();
    File file = new File(directory.getPath() + "\\%s.txt".formatted(filename));

    boolean isCreated = file.createNewFile();
    System.out.println(isCreated);

    boolean isExisting = file.exists();
    System.out.println(isExisting);
  }

  public static void intro() {
    // UNIX -> Linux, Mac OS (OS X), ... - > '/'
    // Windows -> file path delimiter -> '\'
    File file1 = new File("C:\\Users\\spt\\IdeaProjects\\yat\\READMEs.md");
    // absolute path -> "C:\\Users\\spt\\IdeaProjects\\yat\\README.md"
    // абсолютный путь
    File file2 = new File("READMEs.md");
    // relative path -> ".\\README.md" -> "./README.md"
    // относительный путь
  }
}
