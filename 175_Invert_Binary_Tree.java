/**
 * Title                Invert Binary Tree
 * Problem No           175
 * URL                  http://www.lintcode.com/en/problem/invert-binary-tree/
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
   * @param root: a TreeNode, the root of the binary tree
   * @return: nothing
   */
  public void invertBinaryTree(TreeNode root) {
    if (null != root) {
      TreeNode t = root.left;
      root.left = root.right;
      root.right = t;
      invertBinaryTree(root.right);
      invertBinaryTree(root.left);
    }
  }
}