package leetcode;

class Palindrome {
  public static boolean isPalindrome(int x) {
    if (x < 0)
      return false;
    String xString = Integer.toString(x);
    char[] chars = xString.toCharArray();
    if (chars.length == 1)
      return true;

    for (int i = 0, j = chars.length - 1; i <= j && j >= i; i++, j--) {
      if (chars[i] == chars[j])
        continue;
      return false;
    }
    return true;
  }
}