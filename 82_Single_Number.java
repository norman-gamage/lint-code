/**
 * Title                Single Number
 * Problem No           82
 * URL                  http://www.lintcode.com/en/problem/single-number/
 *
 * Original Solution    No
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jul 25
 */

public class Solution {
  /**
   *@param A : an integer array
   *return : a integer 
   */
  public int singleNumber(int[] A) {
    int a = 0;

    for (int i : A)
      a ^= i;

    return a;
  }
}