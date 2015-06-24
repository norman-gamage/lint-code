/**
 * Title                2 Sum
 * Problem No           56
 * URL                  http://www.lintcode.com/en/problem/2-sum/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 25
 */
public class Solution {
  /*
   * @param numbers : An array of Integer
   * @param target : target = numbers[index1] + numbers[index2]
   * @return : [index1 + 1, index2 + 1] (index1 < index2)
   */
  public int[] twoSum(int[] numbers, int target) {
    int[] out = new int[2];
    int len = numbers.length;

    for (int i = 0; i < len; ++i) {
      for (int j = i + 1; j < len; ++j) {
        if (numbers[i] + numbers[j] == target) {
          out[0] = i + 1;
          out[1] = j + 1;
        }
      }
    }

    return out;
  }
}
