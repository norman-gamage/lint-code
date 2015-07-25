/**
 * Title                Maximum Depth of Binary Tree
 * Problem No           97
 * URL                  http://www.lintcode.com/en/problem/maximum-depth-of-binary-tree/
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
   * @param root: The root of binary tree.
   * @return: An integer.
   */
  public int maxDepth(TreeNode root) {
    int tmpDepth = 1, depth = 1;

    if (null == root) {
      return 0;
    } else {
      return maxDepth(root, tmpDepth, depth);
    }
  }

  public int maxDepth(TreeNode root, int tempDepth, int depth) {
    if (null != root) {
      depth = maxDepth(root.left, ++tempDepth, depth);
      tempDepth = --tempDepth;
      depth = maxDepth(root.right, ++tempDepth, depth);
      tempDepth = --tempDepth;
      depth = (tempDepth > depth) ? tempDepth : depth;
    }
    return depth;
  }
}