package other;

import java.util.*;
import java.io.*;

public class Stacks {
  public static void main(String[] args) {
    String reversed = ReverseString("hello");
    System.out.println(reversed);
  }

  public static String ReverseString(String word) {
    Stack<Character> letterStack = new Stack<Character>();
    char[] letters = new char[word.length()];

    for (char c : word.toCharArray()) {
      letterStack.push(c);
    }

    for (int i = 0; i < word.length(); i++) {
      letters[i] = letterStack.pop();
    }

    return new String(letters);
  }
}
