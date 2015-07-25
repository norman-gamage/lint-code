/**
 * Title                Longest Increasing Continuous subsequence
 * Problem No           397
 * URL                  http://www.lintcode.com/en/problem/longest-increasing-continuous-subsequence/
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
     * @param A an array of Integer
     * @return  an integer
     */
  public int longestIncreasingContinuousSubsequence(int[] A) {
    int max = 0;
    for (int i = 0; i < A.length; i++) {

      int ref = i;
      int cntD = 0;
      while (ref + cntD < A.length - 1 && A[ref + cntD] > A[ref + cntD + 1]) {
        ++cntD;
      }
      ++cntD;
      max = (cntD > max) ? cntD : max;

      int cntI = 0;
      while (ref + cntI < A.length - 1 && A[ref + cntI] < A[ref + cntI + 1]) {
        ++cntI;
      }
      ++cntI;
      max = (cntI > max) ? cntI : max;
    }

    return max;
  }
}