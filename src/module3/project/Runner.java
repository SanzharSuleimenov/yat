package module3.project;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import module3.project.item.Book;
import module3.project.item.Dvd;
import module3.project.item.LibraryItem;
import module3.project.item.LibraryStore;
import module3.project.item.Magazine;

public class Runner {

  public static void main(String[] args) {
    serde();
  }

  private static void serde() {
    File file = serialize();
    LibraryStore deserializedStore = deserialize(file);

    for (LibraryItem item : deserializedStore.query("all")) {
      item.displayDetails();
    }
  }

  private static LibraryStore deserialize(File file) {
    try (
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
    ) {
      return (LibraryStore) ois.readObject();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }

    return null;
  }

  private static File serialize() {
    try {
      Path pathToFile = Paths.get("library-store");
      File file = pathToFile.toFile();
      try (
          FileOutputStream fos = new FileOutputStream(file);
          BufferedOutputStream bos = new BufferedOutputStream(fos);
          ObjectOutputStream oos = new ObjectOutputStream(bos);
      ) {
        LibraryStore libraryStore = initLibraryStore();

        Book fellowshipOfTheRing = new Book(
            2432,
            "The Fellowship of the Ring",
            true,
            "J. R. R. Tolkien",
            "The Lord of the Rings: The Fellowship of the Ring",
            "0333290348");

        libraryStore.add(fellowshipOfTheRing);

        oos.writeObject(libraryStore);

        return file;
      } catch (IOException e) {
        e.printStackTrace();
      }
    } catch (Exception e) {
      System.err.println("IOException: " + e.getMessage());
    }

    return null;
  }

  private static void queryLibrary() {
    LibraryStore libraryStore = initLibraryStore();

    LibraryItem[] all = libraryStore.query("all");
    for (LibraryItem item : all) {
      item.displayDetails();
    }

    System.out.println("----");

    LibraryItem[] books = libraryStore.query("book");
    for (LibraryItem item : books) {
      item.displayDetails();
    }
  }

  private static LibraryStore initLibraryStore() {
    LibraryItem book1 = new Book();
    LibraryItem book2 = new Book();
    LibraryItem dvd1 = new Dvd();
    LibraryItem dvd2 = new Dvd();
    LibraryItem magazine1 = new Magazine();
    LibraryItem magazine2 = new Magazine();

    LibraryStore libraryStore = new LibraryStore(10);

    book1.setName("First Book");
    libraryStore.add(book1);

    book2.setName("Second Book");
    libraryStore.add(book2);

    dvd1.setName("First Dvd");
    libraryStore.add(dvd1);

    dvd2.setName("Second Dvd");
    libraryStore.add(dvd2);

    magazine1.setName("First Magazine");
    libraryStore.add(magazine1);

    magazine2.setName("Second Magazine");
    libraryStore.add(magazine2);
    return libraryStore;
  }
}
