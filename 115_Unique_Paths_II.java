/**
 * Title                Unique Paths II
 * Problem No           115
 * URL                  http://www.lintcode.com/en/problem/unique-paths-ii/
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
   * @param n, m: positive integer (1 <= n ,m <= 100)
   * @return an integer
   */
  public int uniquePaths(int m, int n) {
    if (m == 0 || n == 0) return 0;
    if (m == 1 || n == 1) return 1;

    int[][] dp = new int[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0) {
          dp[i][j] = 1;
        } else if (j == 0) {
          dp[i][j] = 1;
        } else {
          dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        }
      }
    }

    return dp[m - 1][n - 1];
  }
}