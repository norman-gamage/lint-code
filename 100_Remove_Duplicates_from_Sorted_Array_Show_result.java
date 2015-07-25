/**
 * Title                Remove Duplicates from Sorted Array Show result
 * Problem No           100
 * URL                  http://www.lintcode.com/en/problem/remove-duplicates-from-sorted-array/
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
   * @param A: a array of integers
   * @return : return an integer
   */
  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    int cnt = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        cnt++;
        nums[cnt - 1] = nums[i];
      }
    }

    return cnt;
  }
}