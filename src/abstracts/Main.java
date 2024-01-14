package abstracts;

public class Main {

  public static void main(String[] args) {
    Pet pet1 = new Mysyk(1, "Mysyk");
    Pet pet2 = new Kushik(2, "Aktos");
    pet1.voice();
    pet2.voice();
    Object object = pet2;
  }
}
