package module3.project.user;

import java.util.Objects;

public abstract class User {

  private int id;
  private String login;
  private String password;
  private String firstName;
  private String lastName;
  private String role;

  public User() {
  }

  public User(int id, String login, String password, String firstName, String lastName,
      String role) {
    this.id = id;
    this.login = login;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.role = role;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof User user)) {
      return false;
    }
    return id == user.id && Objects.equals(login, user.login) && Objects.equals(
        password, user.password) && Objects.equals(firstName, user.firstName)
        && Objects.equals(lastName, user.lastName) && Objects.equals(role,
        user.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, login, password, firstName, lastName, role);
  }
}
