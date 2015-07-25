/**
 * Title                Gas Station
 * Problem No           187
 * URL                  http://www.lintcode.com/en/problem/gas-station/
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
   * @param gas:  an array of integers
   * @param cost: an array of integers
   * @return: an integer
   */
  public int canCompleteCircuit(int[] gas, int[] cost) {
    int len = gas.length;
    int best = -1;

    if (len == 1) {
      if (gas[0] > cost[0]) {
        return 0;
      } else {
        return -1;
      }
    }

    for (int start = 0; start < len; ++start) {
      int st = start;
      int gasInCar = 0;

      for (int i = 0; i < len; ++i) {
        if (st == (start + len - 1) % len) {
          best = start;
        }

        gasInCar += gas[st];
        gasInCar -= cost[st];

        if (gasInCar < 1) {
          break;
        } else {
          st++;
          st %= len;
        }
      }
    }
    return best;
  }
}