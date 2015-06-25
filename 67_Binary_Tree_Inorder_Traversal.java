/**
 * Title                Binary Tree Inorder Traversal
 * Problem No           67
 * URL                  http://www.lintcode.com/en/problem/binary-tree-inorder-traversal/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 26
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
   * @return: Inorder in ArrayList which contains node values.
   */
  public ArrayList<Integer> inorderTraversal(TreeNode root) {
    return inorderTraversal(root, new ArrayList<Integer>());
  }

  public ArrayList<Integer> inorderTraversal(TreeNode root, ArrayList<Integer> arrayList) {
    if (null != root) {
      inorderTraversal(root.left, arrayList);
      arrayList.add(root.val);
      inorderTraversal(root.right, arrayList);
    }
    return arrayList;
  }
}