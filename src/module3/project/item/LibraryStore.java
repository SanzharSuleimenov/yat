package module3.project.item;

public class LibraryStore {

  private int idx = 0;
  private final LibraryItem[] libraryItems;

  public LibraryStore(int size) {
    libraryItems = new LibraryItem[size];
  }

  /**
   * Method added an item to the Library store. Store cannot exceed max number of elements in
   * array.
   *
   * @param item
   * @return true if item was added, false otherwise.
   */
  public boolean add(LibraryItem item) {
    if (idx == libraryItems.length) {
      return false;
    }
    libraryItems[idx++] = item;
    return true;
  }

  public LibraryItem[] query(String type) {
    return switch (type) {
      case "all" -> baseQuery(LibraryItem.class);
      case "paper" -> baseQuery(PaperItem.class);
      case "dvd" -> baseQuery(Dvd.class);
      case "book" -> baseQuery(Book.class);
      case "magazine" -> baseQuery(Magazine.class);
      default -> new LibraryItem[0];
    };
  }

  private <T> LibraryItem[] baseQuery(Class<T> type) {
    int count = 0;
    for (int i = 0; i < idx; i++) {
      LibraryItem item = libraryItems[i];
      if (type.isInstance(item)) {
        count++;
      }
    }

    LibraryItem[] items = new LibraryItem[count];
    int j = 0;
    for (int i = 0; i < idx; i++) {
      LibraryItem item = libraryItems[i];
      if (type.isInstance(item)) {
        items[j++] = item;
      }
    }

    return items;
  }
}
