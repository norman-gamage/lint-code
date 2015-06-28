/**
 * Title                Partition List
 * Problem No           96
 * URL                  http://www.lintcode.com/en/problem/partition-list/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 28
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
   * @param head: The first node of linked list.
   * @param x:    an integer
   * @return: a ListNode
   */
  public ListNode partition(ListNode head, int x) {
    ListNode lower = new ListNode(-1);
    ListNode ptrLow = lower;
    ListNode upper = new ListNode(-1);
    ListNode ptrUpr = upper;

    while (head != null) {
      if (head.val < x) {
        ptrLow.next = new ListNode(head.val);
        ptrLow = ptrLow.next;
      } else {
        ptrUpr.next = new ListNode(head.val);
        ptrUpr = ptrUpr.next;
      }
      head = head.next;
    }

    ptrLow.next = upper.next;

    return lower.next;
  }
}