/**
 * Title                O(1) Check Power of 2 Show result   
 * Problem No           142
 * URL                  http://www.lintcode.com/en/problem/o1-check-power-of-2/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jul 25
 */

class Solution {
  /*
   * @param n: An integer
   * @return: True or false
   */
  public boolean checkPowerOf2(int n) {
    if (n > 0) {
      return Integer.toBinaryString(n).replaceAll("0", "").length() == 1;
    }

    return false;
  }
}