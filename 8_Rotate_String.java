/**
 * Title                Rotate String
 * Problem No           8
 * URL                  http://www.lintcode.com/en/problem/rotate-string/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jul 25
 */

public class Solution {
  public char[] rotateString(char[] A, int offset) {
    if (A.length == 0 || offset == 0) {
      return A;
    }

    offset = (offset>A.length) ? offset%A.length : offset;

    for (int j=0; j<offset; j++) {
      char tmp = A[A.length - 1];
      for (int i = A.length - 1; i > 0; i--) {
        A[i] = A[i - 1];
      }
      A[0] = tmp;
    }
    return A;
  }
}