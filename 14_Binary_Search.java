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
 * Last Update          2015 Jun 27
 */

class Solution {
  /**
   * @param nums:   The integer array.
   * @param target: Target to find.
   * @return: The first position of target. Position starts from 0.
   */
  public int binarySearch(int[] nums, int target) {
    int high = nums.length - 1;
    int low = 0;
    int mid = -1;

    while (high >= low) {
      mid = (high + low) / 2;

      if (nums[mid] == target) {
        while (mid > 0 && nums[mid - 1] == target) {
          mid -= 1;
        }
        return mid;
      } else if (nums[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return -1;
  }
}