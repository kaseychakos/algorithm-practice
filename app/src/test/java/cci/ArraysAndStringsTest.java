package cci;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import cci.chapter01.ArraysAndStrings;

public class ArraysAndStringsTest {

  // Is Unique
  @ParameterizedTest
  @DisplayName("ArraysAndStrings - isNotUnique")
  @ValueSource(strings = { "unique", "Hanna", "Jeremy", "sports" })
  void isNotUniqueTest(String string) {
    assertFalse(ArraysAndStrings.isUnique(string), () -> "Expected a false result but got true.");
  }

  @ParameterizedTest
  @DisplayName("ArraysAndStrings - isUnique")
  @ValueSource(strings = { "solid", "Kasey", "Chakos", "sport" })
  void isUniqueTest(String string) {
    assertTrue(ArraysAndStrings.isUnique(string), () -> "Expected a true result but got false.");
  }

  @ParameterizedTest
  @DisplayName("ArraysAndStrings - isNotUniqueTwoPointers")
  @ValueSource(strings = { "unique", "Adam", "Mikayla", "sports" })
  void isNotUniqueTwoPointersTest(String string) {
    assertFalse(ArraysAndStrings.isUniqueTwoPointers(string));
  }

  @ParameterizedTest
  @DisplayName("ArraysAndStrings - isUniqueTwoPointers")
  @ValueSource(strings = { "solid", "Kasey", "Chakos", "sport" })
  void isUniqueTwoPointersTest(String string) {
    assertTrue(ArraysAndStrings.isUniqueTwoPointers(string));
  }

  // Permutation
  @ParameterizedTest
  @DisplayName("ArraysAndStrings - isNotPermutation")
  @ValueSource(strings = { "solid", "Kasey", "Chakos", "sport" })
  void isNotPermutationTest(String string) {
    String base = "abcd";
    assertFalse(ArraysAndStrings.isPermutation(string, base));
  }

  @ParameterizedTest
  @DisplayName("ArraysAndStrings - isPermutation")
  @ValueSource(strings = { "bacd", "abdc", "badc", "cabd" })
  void isPermutationTest(String string) {
    String base = "abcd";
    assertTrue(ArraysAndStrings.isPermutation(string, base));
  }

  @ParameterizedTest
  @DisplayName("ArraysAndStrings - isNotPermutationTwoPointers")
  @ValueSource(strings = { "solid", "Kasey", "Chakos", "sport" })
  void isNotPermutationTwoPointerTest(String string) {
    String base = "abcd";
    assertFalse(ArraysAndStrings.isPermutationTwoPointers(string, base));
  }

  @ParameterizedTest
  @DisplayName("ArraysAndStrings - isPermutationTwoPointers")
  @ValueSource(strings = { "bacd", "abdc", "badc", "cabd" })
  void isPermutationTwoPointerTest(String string) {
    String base = "abcd";
    assertTrue(ArraysAndStrings.isPermutationTwoPointers(string, base));
  }

  // URLify
  @Test
  @DisplayName("ArraysAndStrings - urlify")
  void urlifyTest() {
    int size = 13;
    String sentance = "Mr John Smith ";
    String expected = "Mr%20John%20Smith";
    assertEquals(expected, ArraysAndStrings.urlify(sentance, size));
  }
}
