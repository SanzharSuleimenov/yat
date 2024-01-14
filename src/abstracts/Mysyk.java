package abstracts;

public class Mysyk extends Pet {

  public Mysyk(int age, String name) {
    super(age, name);
  }

  @Override
  public void voice() {
    System.out.println("Mweaaaaah tunderai meoooow");
  }
}
