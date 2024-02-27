package module3.project.user;

public class Member extends User {

  private boolean isActive;

  public Member(int id, String login, String password, String firstName, String lastName,
      String role,
      boolean isActive) {
    super(id, login, password, firstName, lastName, role);
    this.isActive = isActive;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }

  @Override
  public String toString() {
    return "Member{" +
        "active=" + isActive() +
        ", id=" + getId() +
        ", login='" + getLogin() + '\'' +
        ", password='" + getPassword() + '\'' +
        ", firstName='" + getFirstName() + '\'' +
        ", lastName='" + getLastName() + '\'' +
        ", role='" + getRole() + '\'' +
        '}';
  }
}
