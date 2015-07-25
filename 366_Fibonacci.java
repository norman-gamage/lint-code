/**
 * Title                Fibonacci
 * Problem No           366
 * URL                  http://www.lintcode.com/en/problem/fibonacci/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jul 25
 */

class Solution {
  /**
   * @param n: an integer
   * @return an integer f(n)
   */
  public int fibonacci(int n) {
    if (n == 1) {
      return 0;
    } else if (n == 2) {
      return 1;
    } else {
      int fib[] = new int[n];
      fib[0] = 0;
      fib[1] = 1;
      for (int i = 2; i < fib.length; i++) {
        fib[i] = fib[i - 1] + fib[i - 2];
      }
      return fib[n - 1];
    }
}