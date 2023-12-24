package lesson3;

public class Main {

  // instance variable
  private String tag;
  // instance variable
  private String version;
  // class variable
  private static int counter = 0;

  // access modifier = package private, default, package
  Main() {
    tag = "-";
    version = "v0.0.1";
    counter++;
  }

  // all arg
  Main(String tag, String version) {
    this.tag = tag;
    this.version = version;
    counter++;
  }

  /*
    Instance methods - методы экземпляра(объект)
   */
  public String getTag() { //naming: getFieldName
    return this.tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  // static method
  public static int getCounter() {
    return counter;
  }

  static void updateTag(Main main) {
    System.out.println("Try to update tag...");
    main.setTag("v.final");
  }

  // class method
  public static void main(String[] args) {
    // reference variable = ?
    Main main1 = new Main();
    Main main2 = new Main("init", "v1.0.0");
    System.out.println(main1.getVersion());
    System.out.println(main2.getVersion());

    System.out.println(Main.counter);

    Main main3 = new Main("theory", "v1.0.1");
    System.out.println(Main.counter);
    System.out.println(main3.getTag());
  }
}