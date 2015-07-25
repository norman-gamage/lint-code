/**
 * Title                Remove Nth Node From End of List
 * Problem No           174
 * URL                  http://www.lintcode.com/en/problem/remove-nth-node-from-end-of-list/
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
   * @return: The head of linked list.
   */
  ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode headP = new ListNode(-1);
    headP.next = head;

    ListNode it1 = head;
    int len = 0;

    while (it1 != null) {
      it1 = it1.next;
      len++;
    }

    it1 = headP;
    int cnt = 0;
    while (cnt < len - n) {
      it1 = it1.next;
      cnt++;
    }

    it1.next = it1.next.next;

    return headP.next;
  }
}