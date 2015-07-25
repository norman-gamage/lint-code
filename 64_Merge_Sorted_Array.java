/**
 * Title                Merge Sorted Array
 * Problem No           64
 * URL                  http://www.lintcode.com/en/problem/merge-sorted-array/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jul 25
 */

class Solution {
  /**
   * @param A: sorted integer array A which has m elements,
   *           but size of A is m+n
   * @param B: sorted integer array B which has n elements
   * @return: void
   */
  public void mergeSortedArray(int[] A, int m, int[] B, int n) {
    int a = m - 1;
    int b = n - 1;
    int c = m + n - 1;

    while (a >= 0 || b >= 0) {
      if (b < 0 || (a >= 0 && A[a] > B[b])) {
        A[c--] = A[a--];
      } else {
        A[c--] = B[b--];
      }
    }
  }
}