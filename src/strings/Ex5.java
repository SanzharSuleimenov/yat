package strings;

public class Ex5 {

  public static void main(String[] args) {
    Object obj = " ";

    if (obj instanceof String str && str.length() > 0) {
      if (str.isBlank()) {
        System.out.println("The variable contains only a whitespace");
      }
    }
  }

  private static void replace() {
    String some = "91827498jfsdjh982rjnoigyesig";
    String result = some.replace("98", "");
    System.out.println(result);
  }
}
