/**
 * Title                Binary Tree Postorder Traversal
 * Problem No           68
 * URL                  http://www.lintcode.com/en/problem/binary-tree-postorder-traversal/
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
   * @return: Postorder in ArrayList which contains node values.
   */
  public ArrayList<Integer> postorderTraversal(TreeNode root) {
    return postorderTraversal(root, new ArrayList<Integer>());
  }

  public static ArrayList<Integer> postorderTraversal(TreeNode root, ArrayList<Integer> arrayList) {
    if (null != root) {
      postorderTraversal(root.left, arrayList);
      postorderTraversal(root.right, arrayList);
      arrayList.add(root.val);
    }
    return arrayList;
  }
}