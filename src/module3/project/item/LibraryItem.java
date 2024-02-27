package module3.project.item;

import java.io.Serializable;

public abstract class LibraryItem implements Serializable {

  private static final long serialVersionUID = 1235L;

  private int id;
  private String name;
  private boolean isAvailable;

  public LibraryItem() {
  }

  public LibraryItem(int id, String name, boolean isAvailable) {
    this.id = id;
    this.name = name;
    this.isAvailable = isAvailable;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailable(boolean available) {
    isAvailable = available;
  }

  public void displayDetails() {
    System.out.printf("ID:%d, Name: %s, isAvailable: %s\n", id, name, isAvailable);
  }
}
