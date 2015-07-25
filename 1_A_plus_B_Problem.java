/**
 * Title                A + B Problem
 * Problem No           1
 * URL                  http://www.lintcode.com/en/problem/a-b-problem/
 *
 * Original Solution    No
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 25
 */
class Solution {
  /*
   * param a: The first integer
   * param b: The second integer
   * return: The sum of a and b
   */
  public int aplusb(int a, int b) {
    if (b == 0) {
      return a;
    }

    int sum = a ^ b;
    int carry = (a & b) << 1;
    return aplusb(sum, carry);
  }
}
