/**
 * Title                Flip Bits
 * Problem No           181
 * URL                  http://www.lintcode.com/en/problem/flip-bits/
 *
 * Original Solution    No
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 27
 */

class Solution {
  /**
   * @param a, b: Two integer
   *           return: An integer
   */
  public static int bitSwapRequired(int a, int b) {
    return Integer.toBinaryString(a ^ b).replaceAll("0", "").length();
  }
}