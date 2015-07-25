/**
 * Title                Remove Duplicates from Sorted Array II
 * Problem No           101
 * URL                  http://www.lintcode.com/en/problem/remove-duplicates-from-sorted-array-ii/
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
   * @param A: a array of integers
   * @return : return an integer
   */
  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    int ptr = 1;
    int cnt = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1]) {
        nums[ptr] = nums[i];
        cnt++;

        if (cnt < 2)
          ptr++;
      } else {
        cnt = 0;
        nums[ptr] = nums[i];
        ptr++;
      }
    }

    return ptr;
  }
}