package abstracts;

public class Kushik extends Pet {

  public Kushik(int age, String name) {
    super(age, name);
  }

  @Override
  public void voice() {
    System.out.println("Gaw gaw gaw");
  }
}
