/**
 * Title                Median
 * Problem No           80
 * URL                  http://www.lintcode.com/en/problem/median/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 27
 */

public class Solution {
  /**
   * @param nums: A list of integers.
   * @return: An integer denotes the middle number of the array.
   */
  public int median(int[] nums) {
    int len = nums.length;
    int mid = (len % 2 == 0) ? len / 2 : (len + 1) / 2;

    Arrays.sort(nums);

    return nums[mid - 1];
  }
}
