/**
 * Title                Subarray Sum
 * Problem No           138
 * URL                  http://www.lintcode.com/en/problem/subarray-sum/
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
   * @param nums: A list of integers
   * @return: A list of integers includes the index of the first number
   * and the index of the last number
   */
  public ArrayList<Integer> subarraySum(int[] nums) {
    ArrayList<Integer> out = new ArrayList<Integer>();

    if (nums.length == 0) {
      return out;
    }

    int sum = 0;

    for (int win = nums.length; win > 0; win--) {
      for (int i = 0; i < nums.length - win + 1; i++) {
        if (i == 0) {
          for (int j = i; j < i + win; j++) {
            sum += nums[j];
          }
        } else {
          sum = sum - nums[i - 1] + nums[i + win - 1];
        }

        if (sum == 0) {
          out.add(i);
          out.add(i + win - 1);
          return out;
        }
      }
      sum = 0;
    }

    return out;
  }
}