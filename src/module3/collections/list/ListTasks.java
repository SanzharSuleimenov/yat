package module3.collections.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ListTasks {

  public static void main(String[] args) {
    hr_task1();
  }

  static void hr_task1() {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      ArrayList<Integer> a = new ArrayList<>(n);

      for (int i = 0; i < n; i++) {
        a.add(scanner.nextInt());
      }

      for (Integer i: a) {
        System.out.println(i);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  static void hr_task2() {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    ArrayList<ArrayList<Integer>> arrayListTable = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
      initiateList(scanner, arrayListTable);
    }

    int q = scanner.nextInt();
    for (int i = 0; i < q; i++) {
      processQuery(scanner, arrayListTable);
    }
  }

  private static void processQuery(Scanner scanner, ArrayList<ArrayList<Integer>> arrayListTable) {
    int x = scanner.nextInt() - 1;
    int y = scanner.nextInt() - 1 ;
    ArrayList<Integer> list = arrayListTable.get(x);
    if (y < list.size()) {
      System.out.println(list.get(y));
    } else {
      System.out.println("ERROR!");
    }
  }

  private static void initiateList(Scanner scanner, ArrayList<ArrayList<Integer>> arrayListTable) {
    int d = scanner.nextInt();

    ArrayList<Integer> list = new ArrayList<>(d);

    for (int j = 0; j < d; j++) {
      list.add(scanner.nextInt());
    }

    arrayListTable.add(list);
  }
}
