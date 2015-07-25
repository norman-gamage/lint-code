/**
 * Title                Valid Sudoku
 * Problem No           389
 * URL                  http://www.lintcode.com/en/problem/valid-sudoku/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 26
 */

class Solution {
  /**
   * @param board: the board
   * @return: wether the Sudoku is valid
   */
  public boolean isValidSudoku(char[][] board) {
    for (int i = 0; i < 9; i++) {
      String s1 = "";
      String s2 = "";
      for (int j = 0; j < 9; j++) {
        if (board[i][j] != '.') {
          s1 += board[i][j];
        }

        if (board[j][i] != '.') {
          s2 += board[j][i];
        }
      }

      if (!isUnique(s1)) {
        return false;
      }

      if (!isUnique(s2)) {
        return false;
      }
    }

    for (int blk = 0; blk < 9; blk++) {
      int blkCol = blk % 3;
      int blkRow = blk / 3;
      String s3 = "";

      for (int i = blkRow * 3; i < (blkRow + 1) * 3; i++) {
        for (int j = blkCol * 3; j < (blkCol + 1) * 3; j++) {
          if (board[i][j] != '.') {
            s3 += board[i][j];
          }
        }
      }

      if (!isUnique(s3)) {
        return false;
      }
    }

    return true;
  }

  public static boolean isUnique(String str) {
    if (str.length() == 0) {
      return true;
    }

    char[] c = str.toCharArray();

    for (int i = 0; i < str.length() - 1; i++) {
      for (int j = i + 1; j < str.length(); j++) {
        if ((c[i] ^ c[j]) == 0) {
          return false;
        }
      }
    }

    return true;
  }
}