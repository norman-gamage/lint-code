/**
 * Title                Add Binary
 * Problem No           408
 * URL                  http://www.lintcode.com/en/problem/add-binary/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 27
 */

public class Solution {
  /**
   * @param a a number
   * @param b a number
   * @return the result
   */
  public String addBinary(String a, String b) {
    return Integer.toBinaryString(Integer.valueOf(a, 2) + Integer.valueOf(b, 2));
  }
}