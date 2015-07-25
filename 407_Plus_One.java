/**
 * Title                Plus One
 * Problem No           407
 * URL                  http://www.lintcode.com/en/problem/plus-one/
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
   * @param digits a number represented as an array of digits
   * @return the result
   */
  public int[] plusOne(int[] digits) {
    int carry = 0;
    for (int i = digits.length - 1; i >= 0; i--) {
      if (i == digits.length - 1) {
        digits[i] += 1;
      }
      digits[i] += carry;

      if (digits[i] > 9) {
        digits[i] %= 10;
        carry = 1;
      } else {
        carry = 0;
      }
    }

    int[] out;
    out = (carry > 0) ? new int[digits.length + 1] : new int[digits.length];

    int cnt = out.length - 1;
    for (int i = digits.length - 1; i >= 0; i--) {
      out[cnt--] = digits[i];
    }

    if (carry > 0) {
      out[0] = carry;
    }

    return out;
  }
}