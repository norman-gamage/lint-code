/**
 * Title                Insert Node in a Binary Search Tree
 * Problem No           85
 * URL                  http://www.lintcode.com/en/problem/insert-node-in-a-binary-search-tree/
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
   * @param root: The root of the binary search tree.
   * @param node: insert this node into the binary search tree
   * @return: The root of the new binary search tree.
   */
  public TreeNode insertNode(TreeNode root, TreeNode node) {
    if (null == root) {
      return node;
    }

    if (node.val < root.val) {
      if (null == root.left) {
        root.left = new TreeNode(node.val);
      } else {
        insertNode(root.left, node);
      }
    }

    if (node.val > root.val) {
      if (null == root.right) {
        root.right = new TreeNode(node.val);
      } else {
        insertNode(root.right, node);
      }
    }

    return root;
  }
}