/**
 * Title                Best Time to Buy and Sell Stock
 * Problem No           149
 * URL                  http://www.lintcode.com/en/problem/best-time-to-buy-and-sell-stock/
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
   * @param prices: Given an integer array
   * @return: Maximum profit
   */
  public int maxProfit(int[] prices) {
    int len = prices.length;
    int max = 0;

    for (int i = 0; i < len; ++i) {
      for (int j = i + 1; j < len; ++j) {
        max = (prices[j] - prices[i] > max) ? prices[j] - prices[i] : max;
      }
    }

    return max;
  }
}

