/**
 * Title                Reverse Integer
 * Problem No           413
 * URL                  http://www.lintcode.com/en/problem/reverse-integer/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jul 25
 */

public class Solution {
  /**
   * @param n the integer to be reversed
   * @return the reversed integer
   */
  public int reverseInteger(int n) {
    int sign = (n < 0) ? -1 : 1;

    String s = Integer.toString(n).replaceAll("-", "");
    s = new StringBuffer(s).reverse().toString();

    long l = sign * Long.parseLong(s);

    if (sign < 0) {
      n = (l < Integer.MIN_VALUE) ? 0 : Integer.parseInt(Long.toString(l));
    } else {
      n = (l > Integer.MAX_VALUE) ? 0 : Integer.parseInt(Long.toString(l));
    }
    return n;
  }
}