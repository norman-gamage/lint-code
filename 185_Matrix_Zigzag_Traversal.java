/**
 * Title                Matrix Zigzag Traversal
 * Problem No           185
 * URL                  http://www.lintcode.com/en/problem/matrix-zigzag-traversal/
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
   * @param matrix: a matrix of integers
   * @return: an array of integers
   */
  public int[] printZMatrix(int[][] matrix) {
    int numRow = matrix.length;
    int numCol = matrix[0].length;

    int[] output = new int[numRow * numCol];

    int row = 0;
    int col = 0;

    boolean diagUp = true;
    boolean diagDown = false;
    boolean right = false;
    boolean down = false;

    int i = 0;

    while (i < numRow * numCol) {
      if (i == 0) {
        output[i] = matrix[row][col];
        i++;
      }

      if (diagUp) {
        diagUp = false;
        ++col;
        --row;

        if (row < 0 || col >= numCol) {
          down = true;
        } else {
          diagUp = true;
          output[i] = matrix[row][col];
          ++i;
        }
      }

      if (down) {
        down = false;
        ++row;

        if (row >= numRow || col >= numCol) {
          diagDown = true;
        } else {
          diagDown = true;
          output[i] = matrix[row][col];
          ++i;
        }
      }

      if (diagDown) {
        diagDown = false;
        --col;
        ++row;

        if (row >= numRow || col < 0) {
          right = true;
        } else {
          diagDown = true;
          output[i] = matrix[row][col];
          ++i;
        }
      }

      if (right) {
        right = false;
        ++col;

        if (row >= numRow) {
          diagUp = true;
        } else {
          diagUp = true;
          output[i] = matrix[row][col];
          ++i;
        }
      }
    } // while

    return output;
  }
}