/**
 * Title                Partition Array by Odd and Even 
 * Problem No           373
 * URL                  http://www.lintcode.com/en/problem/partition-array-by-odd-and-even/
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
   * @param nums: an array of integers
   * @return: nothing
   */
  public void partitionArray(int[] nums) {
    int n = 0, m = nums.length - 1;

    while (n < m) {
      if (nums[n] % 2 == 0 && nums[m] % 2 == 1) {
        int tmp = nums[n];
        nums[n] = nums[m];
        nums[m] = tmp;
      } else if (nums[n] % 2 == 1) {
        n++;
      } else if (nums[n] % 2 == 0) {
        m--;
      }
    }
  }
}