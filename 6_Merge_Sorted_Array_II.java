/**
 * Title                Merge Sorted Array II
 * Problem No           6
 * URL                  http://www.lintcode.com/en/problem/merge-sorted-array-ii/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jul 25
 */

class Solution {
  /**
   * @param A and B: sorted integer array A and B.
   * @return: A new sorted integer array
   */
  public ArrayList<Integer> mergeSortedArray(ArrayList<Integer> A, ArrayList<Integer> B) {
    ArrayList<Integer> output = new ArrayList<Integer>();

    int a = 0;
    int b = 0;

    while (a < A.size() || b < B.size()) {
      if (a < A.size() && b < B.size()) {
        if (A.get(a) < B.get(b)) {
          output.add(A.get(a++));
        } else {
          output.add(B.get(b++));
        }
      } else if (a < A.size()) {
        output.add(A.get(a++));
      } else if (b < B.size()) {
        output.add(B.get(b++));
      }
    }

    return output;
  }
}