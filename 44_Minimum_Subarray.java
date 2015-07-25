/**
 * Title                Minimum Subarray
 * Problem No           44
 * URL                  http://www.lintcode.com/en/problem/minimum-subarray/
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
   * @param nums: a list of integers
   * @return: A integer indicate the sum of minimum subarray
   */
  public int minSubArray(ArrayList<Integer> nums) {
    int min = Collections.min(nums);

    for (int cnt = 2; cnt <= nums.size(); cnt++) {
      ArrayList<Integer> x = new ArrayList<Integer>();

      int s = 0;
      for (int i = 0; i < nums.size() - cnt + 1; i++) {
        if (i == 0) {
          s = sum(nums.subList(i, i + cnt));
        } else {
          s = s - nums.get(i - 1) + nums.get(i + cnt - 1);
        }

        min = (s < min) ? s : min;
      }
    }

    return min;
  }

  public int sum(List<Integer> integers) {
    int sum = 0;
    for (Integer i : integers)
      sum = sum + i;
    return sum;
  }
}