/**
 * Title                Search a 2D Matrix
 * Problem No           28
 * URL                  http://www.lintcode.com/en/problem/search-a-2d-matrix/
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
   * @param matrix, a list of lists of integers
   * @param target, an integer
   * @return a boolean, indicate whether matrix contains target
   */
  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix.length == 0) {
      return false;
    }

    int rowMax = matrix.length;
    int colMax = matrix[0].length;
    int row = 0;
    int col = 0;

    while (row < rowMax - 1 && (target > matrix[row + 1][0])) {
      row++;
    }

    while (col < colMax - 1 && matrix[row][col] != target) {
      col++;
    }

    return (target == matrix[row][col]) ? true : false;
  }
}