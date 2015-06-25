/**
 * Title                Binary Search
 * Problem No           14
 * URL                  http://www.lintcode.com/en/problem/binary-search/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 26
 */

class Solution {
  /**
   * @param nums:   The integer array.
   * @param target: Target to find.
   * @return: The first position of target. Position starts from 0.
   */
  public int binarySearch(int[] nums, int target) {
    int length = nums.length;
    int hi = length;
    int lo = 0;
    int mid = (hi + lo) / 2;
    boolean found = false;

    while (mid > -1 && mid <= length && hi != lo) {
      int m = nums[mid];

      if (m == target) {
        found = true;
        break;
      } else if (hi - 1 == lo) {
        found = false;
        break;
      } else if (m > target) {
        hi = mid;
      } else if (m < target) {
        lo = mid;
      }

      mid = (hi + lo) / 2;
    }

    if (found) {
      while (mid > 0 && nums[mid - 1] == target) {
        mid -= 1;
      }
      return mid;
    } else {
      return -1;
    }
  }
}

