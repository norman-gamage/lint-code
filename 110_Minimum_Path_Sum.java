/**
 * Title                Minimum Path Sum
 * Problem No           110
 * URL                  http://www.lintcode.com/en/problem/minimum-path-sum/
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
   * @param grid: a list of lists of integers.
   * @return: An integer, minimizes the sum of all numbers along its path
   */
  public int minPathSum(int[][] grid) {
    if (grid == null || grid.length == 0) {
      return 0;
    }
    
    int m = grid.length;
    int n = grid[0].length;
    int[][] dp = new int[m][n];
    
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 && j == 0) {
          dp[i][j] = grid[i][j];
        } else if (i == 0) {
          dp[i][j] = grid[i][j] + dp[i][j - 1];
        } else if (j == 0) {
          dp[i][j] = grid[i][j] + dp[i - 1][j];
        } else {
          dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
        }
      }
    }
    
    return dp[m - 1][n - 1];
  }
}