/**
 * Title                Count 1 in Binary
 * Problem No           365
 * URL                  http://www.lintcode.com/en/problem/count-1-in-binary/
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
   * @param num: an integer
   * @return: an integer, the number of ones in num
   */
  public int countOnes(int num) {
    String b = Integer.toBinaryString(num);
    return b.replaceAll("0", "").length();
  }
}