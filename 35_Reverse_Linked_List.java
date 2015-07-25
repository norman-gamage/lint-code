/**
 * Title                Reverse Linked List
 * Problem No           35
 * URL                  http://www.lintcode.com/en/problem/reverse-linked-list/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jul 25
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
   * @param head: The head of linked list.
   * @return: The new head of reversed linked list.
   */
  public ListNode reverse(ListNode head) {
    if (null == head || null == head.next) {
      return head;
    }
    ListNode prev = head;
    ListNode curr = prev.next;
    ListNode next = curr.next;

    prev.next = null;

    while (next != null) {
      curr.next = prev;

      prev = curr;
      curr = next;
      next = next.next;
    }

    curr.next = prev;

    return curr;
  }
}