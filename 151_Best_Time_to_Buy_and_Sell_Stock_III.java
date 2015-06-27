/**
 * Title                Best Time to Buy and Sell Stock III
 * Problem No           151
 * URL                  http://www.lintcode.com/en/problem/best-time-to-buy-and-sell-stock-iii/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 25
 */
class Solution {
  /**
   * @param prices: Given an integer array
   * @return: Maximum profit
   */
  public int maxProfit(int[] prices) {
    int len = prices.length;

    if (len < 2) {
      return 0;
    } else if (len < 3) {
      return (prices[1] - prices[0] > 0) ? (prices[1] - prices[0]) : 0;
    } else if (len < 4) {
      int first = (prices[1] - prices[0] > 0) ? (prices[1] - prices[0]) : 0;
      int second = (prices[2] - prices[1] > 0) ? (prices[2] - prices[1]) : 0;
      return first + second;
    } else {

      int MAX = Integer.MIN_VALUE;

      int up = -1;
      for (int i = 1; i < len; ++i) {
        if (prices[i] > prices[i - 1]) {
          up = i - 1;
          break;
        }
      }

      int down = -1;
      for (int i = len - 1; i >= up; --i) {
        if (prices[i] > prices[i - 1]) {
          down = i;
          break;
        }
      }

      for (int pivot = up; pivot < down + 1; ++pivot) {
        int lowMin = Integer.MAX_VALUE;
        int lowMax = Integer.MIN_VALUE;
        int minInd = -1;
        for (int i = up; i <= pivot; ++i) {
          if (prices[i] < lowMin) {
            lowMin = prices[i];
            minInd = i;
          }
        }

        for (int i = minInd; i <= pivot; ++i) {
          lowMax = Math.max(lowMax, prices[i]);
        }

        int highMin = Integer.MAX_VALUE;
        int highMax = Integer.MIN_VALUE;
        int minInd2 = -1;
        for (int i = pivot; i < down + 1; ++i) {
          if (prices[i] < highMin) {
            highMin = prices[i];
            minInd2 = i;
          }
        }

        for (int i = minInd2; i < down + 1; ++i) {
          highMax = Math.max(highMax, prices[i]);
        }

        int max = lowMax - lowMin + highMax - highMin;
        MAX = (max > MAX) ? max : MAX;
      }

      return MAX;
    }
  }
}


