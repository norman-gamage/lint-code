/**
 * Title                Climbing Stairs
 * Problem No           111
 * URL                  http://www.lintcode.com/en/problem/climbing-stairs/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 26
 */

import java.math.BigInteger;

public class Solution {
  /**
   * @param n: An integer
   * @return: An integer
   */
  public int climbStairs(int n) {
    int one = n;
    int two = 0;
    int steps = 0;

    while (n > 0 && one >= 0 && (one * 1 + two * 2) == n) {
      steps += comb(one + two, two);

      one -= 2;
      two += 1;
    }

    return steps;
  }


  public static int comb(int n, int r) {
    return (factorial(n).divide((factorial(r)).multiply(factorial(n - r)))).intValue();
  }

  public static BigInteger factorial(int n) {
    BigInteger inc = new BigInteger("1");
    BigInteger fact = new BigInteger("1");

    for (int c = 1; c <= n; c++) {
      fact = fact.multiply(inc);
      inc = inc.add(BigInteger.ONE);
    }

    return fact;
  }
}
