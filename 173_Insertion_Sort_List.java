/**
 * Title                Insertion Sort List
 * Problem No           173
 * URL                  http://www.lintcode.com/en/problem/insertion-sort-list/
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
   * @param head: The first node of linked list.
   * @return: The head of linked list.
   */
  public ListNode insertionSortList(ListNode head) {
    ListNode cur = head; // initial current
    ListNode ref = new ListNode(Integer.MIN_VALUE); // initial dummy ref pointer

    while (cur.next != null) {
      // if current value bigger than next => swap
      if (cur.val > cur.next.val) {
        int t = cur.val;
        cur.val = cur.next.val;
        cur.next.val = t;
      }

      // otherwise increase reference point
      else {
        ref = ref.next;
      }

      // increase current pointer
      cur = cur.next;

      // if reference not pointing to current, point to head
      if (ref != cur) {
        ref = head;
      }

      // if next node is null for current pointer, go back to reference
      if (null == cur.next && null != ref.next) {
        cur = ref;
      }
    }

    return head;
  }
}