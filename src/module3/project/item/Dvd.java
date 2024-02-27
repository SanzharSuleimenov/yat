package module3.project.item;

public class Dvd extends LibraryItem implements BorrowableItem {

  private int runtime;

  public Dvd() {
  }

  public Dvd(int id, String name, boolean isAvailable, int runtime) {
    super(id, name, isAvailable);
    this.runtime = runtime;
  }

  public int getRuntime() {
    return runtime;
  }

  public void setRuntime(int runtime) {
    this.runtime = runtime;
  }
}
