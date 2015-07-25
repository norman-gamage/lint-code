/**
 * Title                Search Insert Position
 * Problem No           60
 * URL                  http://www.lintcode.com/en/problem/search-insert-position/
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
   * param A : an integer sorted array
   * param target :  an integer to be inserted
   * return : an integer
   */
  public int searchInsert(int[] A, int target) {
    int len = A.length;
    if (len == 0) {
      return 0;
    } else if (len == 1) {
      return (A[0] > target) ? 1 : 0;
    } else if (len == 2) {
      if (target < A[0]) {
        return 0;
      } else if (target > A[1]) {
        return 2;
      } else {
        return 1;
      }
    } else if (target < A[0]) {
      return 0;
    } else if (target > A[len - 1]) {
      return A.length;
    }

    int l = 0;
    int r = len;
    int mid = (l + r) / 2;

    while (A[mid] != target && l < r) {
      if (A[mid] < target) {
        l = mid + 1;
      } else {
        r = mid;
      }
      mid = (l + r) / 2;
    }
    return mid;
  }
}