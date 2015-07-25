/**
 * Title                Trailing Zeros
 * Problem No           2
 * URL                  http://www.lintcode.com/en/problem/trailing-zeros/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 28
 */

class Solution {
  /*
   * param n: As desciption
   * return: An integer, denote the number of trailing zeros in n!
   */
  public long trailingZeros(long n) {
    long cnt = 0;
    for (long l = n; l > 0; l /= 5) {
      cnt = (l == n) ? 0 : cnt + l;
    }

    return cnt;
  }
}