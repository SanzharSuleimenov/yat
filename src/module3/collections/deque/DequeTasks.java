package module3.collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class DequeTasks {

  public static void main(String[] args) {
    String s = "";

    // [(){}{[]()}] -> valid
    // [(){}{[]()}]( -> invalid
    // [(){}{[]()}]) -> invalid
    // ([{)]} -> invalid
    // ()()) -> invalid
    // ] -> invalid
    // ( -> invalid


    /*
      1. Создадим стэк для открывающих скобок любых
        1.1. Верхний элемент стэка, это последняя встреченная открывающая скобка
      2. Проверяем каждый элемент строки. Если мы встретили закрываю скобку. То проверяем верхний элемент стэка:
        2.1. Если вернхий элемент стэка соответствует текущей закр. скобке, то удаляем элемент из стэка
        2.2. Если встретили не соответствующую скобку, тогда возвратим false
        2.3. Если стэк пустой, возвратим false
        2.4. Если любая откр. скобка, то добавим в стэк
      3. Если стэк не пустой, то возвратим false, иначе true
     */

    validParenthesis(s);

  }

  private static boolean validParenthesis(String s) {
    Stack<Character> brackets = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(' || c == '{' || c == '[') {
        brackets.add(c);
      } else {
        if (brackets.isEmpty()) return false;
        boolean case1 = brackets.peek().equals('(') && c == ')';
        boolean case2 = brackets.peek().equals('[') && c == ']';
        boolean case3 = brackets.peek().equals('{') && c == '}';
        if (case1 || case2 || case3) {
          brackets.pop();
        } else {
          return false;
        }
      }
    }

    return brackets.isEmpty();
  }
}
