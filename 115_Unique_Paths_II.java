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
   * @param obstacleGrid: A list of lists of integers
   * @return: An integer
   */
public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;

    if (m == 0 || n == 0) return 0;
    if (obstacleGrid[m - 1][n - 1] == 1) return 0;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (obstacleGrid[i][j] == 1) {
          obstacleGrid[i][j] = -1;
        } else {
          if (i == 0 && j == 0) {
            obstacleGrid[i][j] = 1;
          } else if (i == 0 && obstacleGrid[i][j] == 0) {
            if (j > 0 && obstacleGrid[i][j - 1] > 0) {
              obstacleGrid[i][j] = 1;
            }
          } else if (j == 0 && obstacleGrid[i][j] == 0) {
            if (i > 0 && obstacleGrid[i - 1][j] > 0) {
              obstacleGrid[i][j] = 1;
            }
          } else if (obstacleGrid[i][j] == 0) {
            int a = (obstacleGrid[i - 1][j] > 0) ? obstacleGrid[i - 1][j] : 0;
            int b = (obstacleGrid[i][j - 1] > 0) ? obstacleGrid[i][j - 1] : 0;
            obstacleGrid[i][j] = a + b;
          }
        }
      }
    }

    return obstacleGrid[m - 1][n - 1];
  }
}