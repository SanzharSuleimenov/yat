package module3.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MapTasks {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String sentence = scanner.nextLine();
    var result = countAllWordOccurrence(sentence);
    for (var entry: result.entrySet()) {
      System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
    }
  }

  private static boolean isAllCharsHaveEqualNumOfOccurrence() {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    Map<Character, Integer> countChars = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (countChars.containsKey(ch)) {
        countChars.put(ch, countChars.get(ch) + 1); // c = 3 -> c = 4
      } else {
        countChars.put(ch, 1);
      }
    }

    int value = countChars.get(s.charAt(0));
    for (Map.Entry<Character, Integer> entry : countChars.entrySet()) {
      if (value != entry.getValue()) {
        return false;
      }
    }
    return true;
  }

  private static Map<String, Integer> countAllWordOccurrence(String s) {
    StringTokenizer stringTokenizer = new StringTokenizer(s, " ");

    Map<String, Integer> countWords = new HashMap<>();

    while (stringTokenizer.hasMoreElements()) {
      String word = stringTokenizer.nextToken();
      countWords.compute(word, (k, v) -> v == null ? 1 : v + 1);
    }

    return countWords;
  }
}
