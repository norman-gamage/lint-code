/**
 * Title                Product of Array Exclude Itself
 * Problem No           50
 * URL                  http://www.lintcode.com/en/problem/product-of-array-exclude-itself/
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
   * @param A: Given an integers array A
   * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
   */
  public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
    ArrayList<Long> out = new ArrayList<Long>();
    long mul = 1;

    int zCnt = 0;
    for (Integer i : A) {
      if (i == 0) {
        zCnt++;
      }
    }

    if (zCnt == 1) {
      for (int i = 0; i < A.size(); i++) {
        if (A.get(i) != 0) {
          mul = 0;
        } else {
          int ind = 0;
          mul = 1;
          while (ind < A.size()) {
            if (i != ind) {
              mul *= A.get(ind);
            }
            ind++;
          }
        }
        out.add(mul);
      }
    } else {
      for (int i = 1; i < A.size(); i++) {
        mul *= A.get(i);
      }
      out.add(mul);

      for (int i = 1; i < A.size(); i++) {
        mul = (mul == 0) ? 0 : mul / A.get(i);
        mul *= A.get(i - 1);
        out.add(mul);
      }
    }
    return out;
  }
}