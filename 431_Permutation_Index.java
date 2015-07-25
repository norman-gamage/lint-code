/**
 * Title                Permutation Index
 * Problem No           431
 * URL                  http://www.lintcode.com/en/problem/permutation-index/
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
   * @param A an integer array
   * @return a long integer
   */
  public static long permutationIndex(int[] A) {
    long sum = 0;
    for (int i = 0; i < A.length - 1; ++i) {
      sum += perms(Arrays.copyOfRange(A, i, A.length));
    }

    return ++sum;
  }

  public static long perms(int[] A) {
    int first = A[0];
    long cnt = 0;

    for (int i : A) {
      if (i < first) {
        ++cnt;
      }
    }

    return cnt * factorial(A.length - 1);
  }

  public static long factorial(long n) {
    if (n < 2) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }
}