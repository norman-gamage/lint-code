/**
 * Title                Number of Islands
 * Problem No           433
 * URL                  http://www.lintcode.com/en/problem/number-of-islands/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 26
 */

public class Solution {
  /**
   * @param grid a boolean 2D matrix
   * @return an integer
   */
  public int numIslands(boolean[][] grid) {
    if (0 == grid.length) {
      return 0;
    }

    int numRow = grid.length;
    int numCol = grid[0].length;
    int cnt = 0;

    for (int r = 0; r < numRow; ++r) {
      for (int c = 0; c < numCol; ++c) {
        if (true == grid[r][c]) {
          removeIsland(grid, r, c, numRow, numCol);
          ++cnt;
        }
      }
    }

    return cnt;
  }

  public void removeIsland(boolean[][] grid, int r, int c, int numRow, int numCol) {
    grid[r][c] = false;

    if (c + 1 < numCol && grid[r][c + 1] == true) {
      removeIsland(grid, r, c + 1, numRow, numCol);
    }

    if (r + 1 < numRow && grid[r + 1][c] == true) {
      removeIsland(grid, r + 1, c, numRow, numCol);
    }

    if (c - 1 >= 0 && grid[r][c - 1] == true) {
      removeIsland(grid, r, c - 1, numRow, numCol);
    }

    if (r - 1 >= 0 && grid[r - 1][c] == true) {
      removeIsland(grid, r - 1, c, numRow, numCol);
    }
  }
}