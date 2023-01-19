package cci.chapter01;

import java.util.HashMap;
import java.lang.System;

public class ArraysAndStrings {

  /**
   * Chapter 01 practice questions from the book Cracking the Coding Interview
   */

  /**
   * 1.1.1 Is Unique
   * Implement an algorithm to determine if a string has all unique characters.
   * What if you cannot use additional data structures?
   *
   * Algorithm:
   * var hashmap = new hashmap
   * for c in s:
   * var x = hashmap.get(c)
   * if: x is null then add to hashmap
   * else: return false
   * return true
   * 
   * @param s
   * @return boolean
   */
  public static boolean isUnique(String s) {
    HashMap<Character, Boolean> hashMap = new HashMap<>();
    for (Character c : s.toCharArray()) {
      if (hashMap.get(c) == null) {
        hashMap.put(c, true);
      } else {
        return false;
      }
    }
    System.out.println("SDf");
    return true;
  }

  /**
   * 1.1.2 Is Unique logarithmic
   * Algorithm:
   * from either end of the string check to see if the character is in the
   * hashmap. If not, add to hashmap. If the items are in the hashmap then there
   * is a duplicate so the method should return false
   * 
   * @param s
   * @return
   */
  public static boolean isUniqueTwoPointers(String s) {
    HashMap<Character, Boolean> hashMap = new HashMap<>();
    for (int i = 0, j = s.length() - 1; i <= j && j >= 0; i++, j--) {
      var ia = hashMap.get(s.charAt(i));
      var ib = hashMap.get(s.charAt(j));
      if (ia == null && ib == null) {
        hashMap.put(s.charAt(i), true);
        hashMap.put(s.charAt(j), true);
      } else {
        return false;
      }
    }
    return true;
  }

  /**
   * 1.2 Check Permutation
   * Given two strings, write a method to decide if one is a permutation of the
   * other
   * 
   * Algorithm:
   * if r.length > s.length return false
   * convert strings to char arrays
   * add s chars to hashmap a where key = char value = count
   * add r chars to hashmap b where key = char value = count
   * if hashmap a == hashmap b return true else false
   */
  public static boolean isPermutation(String s, String r) {
    if (r.length() > s.length() || s.toLowerCase().equals(r.toLowerCase()))
      return false;
    HashMap<Character, Integer> a = new HashMap<>();
    HashMap<Character, Integer> b = new HashMap<>();

    // for (int i = 0, j = )
    for (Character c : s.toCharArray()) {
      a.put(c, a.get(a) != null ? a.get(a) + 1 : 1);
    }

    for (Character c : r.toCharArray()) {
      b.put(c, b.get(b) != null ? b.get(b) + 1 : 1);
    }
    return a.equals(b);
  }

  /**
   * 1.2 Check Permutation
   * Given two strings, write a method to decide if one is a permutation of the
   * other
   * 
   * Algorithm:
   * if r.length > s.length return false
   * convert strings to char arrays
   * add s chars to hashmap a where key = char value = count
   * add r chars to hashmap b where key = char value = count
   * if hashmap a == hashmap b return true else false
   */
  public static boolean isPermutationTwoPointers(String s, String r) {
    if (r.length() > s.length() || s.toLowerCase().equals(r.toLowerCase()))
      return false;
    HashMap<Character, Integer> a = new HashMap<>();
    HashMap<Character, Integer> b = new HashMap<>();

    for (int i = 0, j = s.length() - 1; i < j && j > 0; i++, j--) {
      Character tempA = s.charAt(i);
      Character tempB = s.charAt(j);
      a.put(tempA, a.get(tempA) != null ? a.get(tempA) + 1 : 1);
      a.put(tempB, a.get(tempB) != null ? a.get(tempB) + 1 : 1);
    }

    for (int i = 0, j = r.length() - 1; i < j && j > 0; i++, j--) {
      Character tempA = r.charAt(i);
      Character tempB = r.charAt(j);
      b.put(tempA, b.get(tempA) != null ? b.get(tempA) + 1 : 1);
      b.put(tempB, b.get(tempB) != null ? b.get(tempB) + 1 : 1);
    }

    return a.equals(b);
  }

  // 1.3 URLify
  /**
   * 1.3 URLify
   * Write a method to replace all spaces in a string with '%20' you may assume
   * that the string has suffient space at the end to hold additional characters,
   * and that you are given the "true" length of the string. (NOTE: if using java
   * use a character array so that you can perform this operation in place.)
   * e.g.
   * Input: "Mr John Smith ", 13
   * Output: "Mr%20John%20Smith"
   */
  public static String urlify(String s, int x) {
    int shift = 0;
    char[] sChars = s.toCharArray();
    char[] rChars = new char[x * 2];

    for (int i = 0; i < x; i++) {
      if (sChars[i] == ' ') {
        // add %20 then add to shift/offset
        rChars[i + shift] = '%';
        rChars[i + ++shift] = '2';
        rChars[i + ++shift] = '0';
      } else {
        rChars[i + shift] = sChars[i];
      }
    }
    return new String(rChars).trim();
  }

  // 1.4 Palindrome Permutation

  // 1.5 One Way

  // 1.6 String Compression

  // 1.7 Rotate Matrix

  // 1.8 Zero Matrix

  // 1.9 String Rotation

  /**
   * Chapter 01 helper functions
   */
}