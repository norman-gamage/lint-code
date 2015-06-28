/**
 * Title                Remove Element
 * Problem No           172
 * URL                  http://www.lintcode.com/en/problem/remove-element/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 28
 */

public class Solution {
  /**
   * @param A:    A list of integers
   * @param elem: An integer
   * @return: The new length after remove
   */
  public int removeElement(int[] A, int elem) {
    if (A.length == 0) {
      return 0;
    }

    int ptr = 0;

    for (int i : A) {
      if (i != elem) {
        A[ptr] = i;
        ptr++;
      }
    }

    return ptr;
  }
}