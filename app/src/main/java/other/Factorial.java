package other;

/**
 * Scopes
 */
public class Factorial {

  public static int Factorial(int n) {
    System.out.println(String.format("n value = %d", n));

    if (n != 0) {
      return n * Factorial(n - 1);
    } else {
      return 1;
    }
  }
}