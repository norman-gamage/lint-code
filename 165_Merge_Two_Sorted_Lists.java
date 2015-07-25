/**
 * Title                Merge Two Sorted Lists
 * Problem No           165
 * URL                  http://www.lintcode.com/en/problem/merge-two-sorted-lists/
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
   * @param ListNode l1 is the head of the linked list
   * @param ListNode l2 is the head of the linked list
   * @return: ListNode head of linked list
   */
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode it = new ListNode(-1);
    ListNode output = it;

    while (null != l1 || null != l2) {
      if (null != l1 && null != l2) {
        if (l1.val < l2.val) {
          it.next = new ListNode(l1.val);
          l1 = l1.next;
        } else {
          it.next = new ListNode(l2.val);
          l2 = l2.next;
        }
      } else if (null != l1) {
        it.next = new ListNode(l1.val);
        l1 = l1.next;
      } else if (null != l2) {
        it.next = new ListNode(l2.val);
        l2 = l2.next;
      }
      it = it.next;
    }

    return output.next;
  }
}