package module3.project.user;

public class Librarian extends User {

  private int workExperience;

  public Librarian(int id, String login, String password, String firstName, String lastName,
      String role, int workExperience) {
    super(id, login, password, firstName, lastName, role);
    this.workExperience = workExperience;
  }

  public int getWorkExperience() {
    return workExperience;
  }

  public void setWorkExperience(int workExperience) {
    this.workExperience = workExperience;
  }

  @Override
  public String toString() {
    return "Librarian{" +
        "workExperience=" + workExperience +
        ", id=" + getId() +
        ", login='" + getLogin() + '\'' +
        ", password='" + getPassword() + '\'' +
        ", firstName='" + getFirstName() + '\'' +
        ", lastName='" + getLastName() + '\'' +
        ", role='" + getRole() + '\'' +
        '}';
  }
}
