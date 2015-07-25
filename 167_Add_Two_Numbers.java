/**
 * Title                Add Two Numbers
 * Problem No           167
 * URL                  http://www.lintcode.com/en/problem/add-two-numbers/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 27
 */

/**
 * Definition for singly-linked list.
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
   * @param l1: the first list
   * @param l2: the second list
   * @return: the sum list of l1 and l2
   */
  public ListNode addLists(ListNode l1, ListNode l2) {
    ListNode it = new ListNode(0);
    ListNode output = it;
    int c = 0;

    while (null != l1 || null != l2) {
      if (null != l1) {
        c += l1.val;
        l1 = l1.next;
      }

      if (null != l2) {
        c += l2.val;
        l2 = l2.next;
      }

      it.next = new ListNode(c % 10);
      it = it.next;
      c /= 10;
    }

    if (c > 0) {
      it.next = new ListNode(c);
    }

    return output.next;
  }
}