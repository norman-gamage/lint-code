/**
 * Title                Binary Tree Preorder Traversal
 * Problem No           66
 * URL                  http://www.lintcode.com/en/problem/binary-tree-preorder-traversal/
 * <p>
 * Original Solution    Yes
 * Other Comments       N.A.
 * <p>
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
   * @return: Preorder in ArrayList which contains node values.
   */
  public ArrayList<Integer> preorderTraversal(TreeNode root) {
    return preorderTraversal(root, new ArrayList<Integer>());
  }

  public static ArrayList<Integer> preorderTraversal(TreeNode root, ArrayList<Integer> arrayList) {
    if (null != root) {
      arrayList.add(root.val);
      preorderTraversal(root.left, arrayList);
      preorderTraversal(root.right, arrayList);
    }
    return arrayList;
  }
}
