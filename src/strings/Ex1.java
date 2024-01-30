package strings;

import java.util.Scanner;

public class Ex1 {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    String ip = scanner.nextLine();
    String defanged = defangIPaddr(ip);
    System.out.println(defanged);
  }
  public static String defangIPaddr(String address) {
    // it's your code
    return address.replace(".","[.]");
  }
}
