package files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFile {

  private static final String RELATIVE_PATH =
      "resources" + File.separator + "read" + File.separator + "test" + File.separator;

  public static void main(String[] args) throws IOException, BadStartException {
    readWholeFileAsString();
  }

  private static void readWholeFileAsString() throws IOException {
    String wholeFileAsString = new String(Files.readAllBytes(Path.of(RELATIVE_PATH + "test.txt")));
    System.out.println(wholeFileAsString);
  }

  private static void readWithScanner() throws IOException, BadStartException {
    File file = getFileToRead();
    try (Scanner fileScanner = new Scanner(file)) {
      while (fileScanner.hasNext()) {
        String line = fileScanner.next();
        System.out.print(line + " ");
      }
    } catch (IOException e) {
      System.err.println("IOException");
      e.printStackTrace();
    } catch (Exception e) {
      System.err.println("Exception");
      e.printStackTrace();
    } catch (Throwable e) {
      System.err.println("Throwable");
      e.printStackTrace();
    }
  }

  private static void readByLineWithScanner() throws IOException, BadStartException {
    File file = getFileToRead();
    try (Scanner fileScanner = new Scanner(file)) {
      while (fileScanner.hasNextLine()) {
        String line = fileScanner.nextLine();
        System.out.println(line);
      }
    } catch (IOException e) {
      System.err.println("IOException");
      e.printStackTrace();
    } catch (Exception e) {
      System.err.println("Exception");
      e.printStackTrace();
    } catch (Throwable e) {
      System.err.println("Throwable");
      e.printStackTrace();
    }
  }

  private static void readAllWithFileReader() throws IOException, BadStartException {
    File toRead = getFileToRead();
    try (FileReader fileReader = new FileReader(toRead)) {
      char[] symbols = new char[(int) toRead.length()];
      fileReader.read(symbols);
      String str = new String(symbols);
      System.out.println(str);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void readWithFileReader() throws IOException, BadStartException {
    File toRead = getFileToRead();
    try (FileReader fileReader = new FileReader(toRead)) {

      char ch = (char) fileReader.read();
      System.out.println(ch);

      char[] symbols = new char[25];
      fileReader.read(symbols);
      System.out.println(Arrays.toString(symbols));
      System.out.println(new String(symbols));

      char[] nextSymbols = new char[25];
      fileReader.read(nextSymbols);
      String str = new String(nextSymbols);
      System.out.println(str);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static File getFileToRead() throws IOException, BadStartException {
    File dir = new File(RELATIVE_PATH);
    boolean dirExists = true;
    if (!dir.exists()) {
      dirExists = dir.mkdirs();
    }

    File file = new File(RELATIVE_PATH + "test.txt");
    boolean fileExists = true;
    if (!file.exists()) {
      fileExists = file.createNewFile();
    }

    if (!dirExists || !fileExists) {
      throw new BadStartException();
    }
    return file;
  }
}
