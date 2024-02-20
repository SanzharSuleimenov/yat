package module3.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListTasks {

  private static final Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    String sentence = scan.nextLine();
    System.out.println(reverseWordsInSentence(sentence));
  }

  private static void listManipulations() {
    var array = Arrays.asList(
        new MyElement("Central Asia", "Navat"),
        new MyElement("Kazakh", "Adal"),
        new MyElement("Kazakh", "Korshi"),
        new MyElement("Italian", "Del Papa"),
        new MyElement("Kazakh", "Ayl"),
        new MyElement("German", "Paulaner"),
        new MyElement("American", "Burger King"));

    List<MyElement> elementList = new ArrayList<>(array);
    // Immutable -> Mutable
    // f(x) = !x -> f(Mutable) = !Mutable -> Immutable

    System.out.printf("Original list: %s\n", elementList);

    Collections.sort(elementList);
    System.out.printf("Sorted list: %s\n", elementList);

    int pos = Collections.binarySearch(elementList, new MyElement("German", "Paulaner"));
    if (pos >= 0) {
      System.out.printf("Found: %s\n", elementList.get(pos));
    } else {
      System.out.println("Element not found");
    }

    int pos1 = Collections.binarySearch(elementList, new MyElement("Kazakh", ""),
        (left, right) -> {
          return left.getKey().compareTo(right.getKey());
        });

    if (pos1 >= 0) {
      System.out.printf("Found: %s\n", elementList.get(pos1));
    } else {
      System.out.println("Element not found");
    }
  }

  static void hr_task1() {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      ArrayList<Integer> a = new ArrayList<>(n);

      for (int i = 0; i < n; i++) {
        a.add(scanner.nextInt());
      }

      for (Integer i : a) {
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
    int y = scanner.nextInt() - 1;
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

  // String s = "Hello world!" -> reverse -> "!dlrow olleH"
  private static String reverseString(String s) {
    String reversed = "";

    for (int i = s.length() - 1; i >= 0; i--) {
      reversed += s.charAt(i);
    }

    return reversed;
  }

  private static String reverseWordsInSentence(String sentence) {
    // Dobby is free -> ybboD si eerf
    // English alphabet; Upper case and lower case; And spaces.
    // length : [1; 2000]
    // Only one space, that will distinct words.

    /*
      1. Превратить строку в массив слов
      2. Выбираем каждое слово по отдельности
      3. Переворачиваем слово
      4. Добавляем полученную строку в результирующию строку
     */

    String[] words = sentence.split(" ");
    String result = "";

    for (int i = 0; i < words.length; i++) {
      String reversed = "";
      for (int j = words[i].length() - 1; j >= 0; j--) {
        reversed += words[i].charAt(j);
      }
      result += reversed + " ";
    }

    return result;
  }
}
