/**
 * Title                Nth to Last Node in List
 * Problem No           166
 * URL                  http://www.lintcode.com/en/problem/nth-to-last-node-in-list/
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
   * @param head: The first node of linked list.
   * @param n: An integer.
   * @return: Nth to last node of a singly linked list. 
   */
  ListNode nthToLast(ListNode head, int n) {
    ListNode it1 = new ListNode(-1);
    ListNode it2 = new ListNode(-1);
    ListNode output = it1;

    int last = 0;
    it2.next = head;
    it2 = it2.next;
    while (it2 != null) {
      last++;
      it2 = it2.next;
    }

    int ind = last - n;
    int i = 1;

    while (head != null) {
      if (i > ind) {
        it1.next = new ListNode(head.val);
        it1 = it1.next;
      }

      head = head.next;
      ++i;
    }

    return output.next;
  }
}