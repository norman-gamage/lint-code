/**
 * Title                Remove Duplicates from Sorted List
 * Problem No           112
 * URL                  http://www.lintcode.com/en/problem/remove-duplicates-from-sorted-list/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jul 25
 */

/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
  /**
   * @param ListNode head is the head of the linked list
   * @return: ListNode head of linked list
   */
  public static ListNode deleteDuplicates(ListNode head) {
    if (null == head) {
      return null;
    }

    ListNode headP = new ListNode(-1);
    headP.next = head;
    ListNode it1 = head;
    ListNode it2 = it1;
    it1 =it1.next;

    while (it1 != null) {
      if (it2.val == it1.val) {
        if (it1.next == null) {
          it2.next = null;
        }
      } else {
        it2.next = it1;
        it2 = it2.next;
      }
      it1 =it1.next;
    }

    return headP.next;
  }
}