/**
 * Title                Maximum Subarray
 * Problem No           41
 * URL                  http://www.lintcode.com/en/problem/maximum-subarray/
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
   * @param nums: A list of integers
   * @return: A integer indicate the sum of max subarray
   */
  public int maxSubArray(ArrayList<Integer> nums) {
    int len = nums.size();

    if (len == 0) {
      return -1;
    }

    if (len == 1) {
      return nums.get(0);
    }

    int max = sum(nums);

    for (int m = 1; m < len; ++m) {
      int s = 0;
      for (int i = 0; i < len - (m - 1); ++i) {
        if (i == 0) {
          s = sum(nums.subList(i, i + m));
        } else {
          s = s - nums.get(i - 1) + nums.get(i - 1 + m);
        }
        max = (s > max) ? s : max;
      }
    }

    return max;
  }


  public static int sum(List<Integer> nums) {
    int output = 0;
    for (Integer i : nums) {
      output += i;
    }
    return output;
  }
}