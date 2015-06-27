/**
 * Title                Convert Sorted Array to Binary Search Tree With Minimal Height
 * Problem No           177
 * URL                  http://www.lintcode.com/en/problem/convert-sorted-array-to-binary-search-tree-with-minimal-height/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 27
 */

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
  /**
   * @param A: an integer array
   * @return: a tree node
   */
  public TreeNode sortedArrayToBST(int[] A) {
    int len = A.length;

    if (len == 0) {
      return null;
    } else if (len == 1) {
      return new TreeNode(A[0]);
    } else {
      TreeNode root = null;
      if (len == 2) {
        root = new TreeNode(A[1]);
        root.left = new TreeNode(A[0]);
        root.right = null;
      } else if (len == 3) {
        root = new TreeNode(A[1]);
        root.left = new TreeNode(A[0]);
        root.right = new TreeNode(A[2]);
      } else {
        int mid = ((len + 1) / 2) - 1;
        root = new TreeNode(A[mid]);
        int[] left = Arrays.copyOfRange(A, 0, mid);
        int[] right = Arrays.copyOfRange(A, mid + 1, len);

        root.left = sortedArrayToBST(left);
        root.right = sortedArrayToBST(right);
      }
      return root;
    }
  }
}