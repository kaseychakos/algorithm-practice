package cci;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import cci.chapter01.ArraysAndStrings;

public class ArraysAndStringsTest {

  @ParameterizedTest
  @DisplayName("ArraysAndStrings - isUnique")
  // expect fail
  // @ValueSource(strings = { "unique", "Hanna", "Jeremy", "sports" })
  // expect pass
  @ValueSource(strings = { "solid", "Kasey", "Chakos", "sport" }) //
  void isUniqueTest(String string) {
    assertTrue(ArraysAndStrings.isUnique(string), () -> "Expected a true result but got false.");
  }

  @ParameterizedTest
  @DisplayName("ArraysAndStrings - isUniqueLog")
  // expect fail
  // @ValueSource(strings = { "unique", "Adam", "Mikayla", "sports" })
  // expect pass
  @ValueSource(strings = { "solid", "Kasey", "Chakos", "sport" }) //
  void isUniqueLogTest(String string) {
    assertTrue(ArraysAndStrings.isUniqueTwoPointers(string));
  }

  @ParameterizedTest
  @DisplayName("ArraysAndStrings - isPermutation")
  // expect fail
  // @ValueSource(strings = { "solid", "Kasey", "Chakos", "sport" })
  // expect pass
  @ValueSource(strings = { "bacd", "abdc", "badc", "cabd" })
  void isPermutationTest(String string) {
    String base = "abcd";
    assertTrue(ArraysAndStrings.isPermutation(string, base));
  }

  @ParameterizedTest
  @DisplayName("ArraysAndStrings - isPermutationLog")
  // expect fail
  // @ValueSource(strings = { "solid", "Kasey", "Chakos", "sport" })
  // expect pass
  @ValueSource(strings = { "bacd", "abdc", "badc", "cabd" })
  void isPermutationLogTest(String string) {
    String base = "abcd";
    assertTrue(ArraysAndStrings.isPermutationTwoPointers(string, base));
  }

  @Test
  @DisplayName("ArraysAndStrings - urlify")
  void urlifyTest() {
    int size = 13;
    String sentance = "Mr John Smith ";
    String expected = "Mr%20John%20Smith";
    assertEquals(expected, ArraysAndStrings.urlify(sentance, size));
  }
}
