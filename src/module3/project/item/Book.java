package module3.project.item;

public class Book extends LibraryItem implements PaperItem, BorrowableItem {

  private String author;
  private String title;
  private String isbn;

  public Book() {
  }

  public Book(int id, String name, boolean isAvailable, String author, String title, String isbn) {
    super(id, name, isAvailable);
    this.author = author;
    this.title = title;
    this.isbn = isbn;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  @Override
  public void displayDetails() {
    System.out.printf("""
            Book
              ID:%d,
              Name: %s,
              isAvailable: %s,
              Author: %s,
              Title: %s,
              ISBN: %s
              """,
        super.getId(), super.getName(), super.isAvailable(), author, title, isbn);
  }
}
