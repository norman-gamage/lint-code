/**
 * Title                Delete Node in the Middle of Singly Linked List
 * Problem No           372
 * URL                  http://www.lintcode.com/en/problem/delete-node-in-the-middle-of-singly-linked-list/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 27
 */

/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */
public class Solution {
  /**
   * @param node: the node in the list should be deleted
   * @return: nothing
   */
  public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }
}