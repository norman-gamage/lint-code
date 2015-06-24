/**
 * Title                3 Sum Closest
 * Problem No           59
 * URL                  http://www.lintcode.com/en/problem/3-sum-closest/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 25
 */
public class Solution {
  /**
   * @param numbers: Give an array numbers of n integer
   * @param target   : An integer
   * @return : return the sum of the three integers, the sum closest target.
   */
  public int threeSumClosest(int[] numbers, int target) {
    int out = 0;
    int len = numbers.length;
    if (len == 0) {
      return -1;
    }

    boolean flag = true;
    int min = 0;

    for (int i = 2; i < len; ++i) {
      for (int j = 1; j < i; ++j) {
        for (int k = 0; k < j; ++k) {
          int sum = numbers[k] + numbers[j] + numbers[i];

          if (flag) {
            min = Math.abs(target - sum);
            out = sum;
            flag = false;
          } else {
            if (Math.abs(target - sum) < min) {
              min = Math.abs(target - sum);
              out = sum;
            }
          }
        }
      }
    }

    return out;
  }
}
