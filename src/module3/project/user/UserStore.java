package module3.project.user;

public class UserStore {

  private int idx;
  private User[] users;

  public UserStore(int size) {
    if (size < 1) {
      throw new RuntimeException("Size must be positive!");
    }
    users = new User[size];
    idx = 0;
  }

  public boolean add(User user) {
    if (idx == users.length) {
      return false;
    }

    users[idx++] = user;

    return true;
  }

  public boolean remove(User user) {
    if (user instanceof Librarian) {
      throw new RuntimeException("Librarian is an Admin, therefore cannot be deleted!");
    }

    int pos = 0;
    while (pos < users.length && !user.equals(users[pos])) {
      ++pos;
    }

    if (pos == users.length) {
      return false;
    }

    for (int i = pos + 1; i < idx; i++) {
      users[i - 1] = users[i];
    }
    users[--idx] = null;

    return true;
  }

  public User[] getUsers() {
    return users;
  }
}
