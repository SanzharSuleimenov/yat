package module3.project;

import module3.project.item.Book;
import module3.project.item.Dvd;
import module3.project.item.LibraryItem;
import module3.project.item.LibraryStore;
import module3.project.item.Magazine;

public class Runner {

  public static void main(String[] args) {
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

    LibraryItem[] all = libraryStore.query("all");
    for (LibraryItem item: all) {
      item.displayDetails();
    }

    System.out.println("----");

    LibraryItem[] books = libraryStore.query("book");
    for (LibraryItem item: books) {
      item.displayDetails();
    }
  }
}
