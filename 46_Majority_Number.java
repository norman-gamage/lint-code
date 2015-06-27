/**
 * Title                Majority Number
 * Problem No           46
 * URL                  http://www.lintcode.com/en/problem/majority-number/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 27
 */

public class Solution {
  /**
   * @param nums: a list of integers
   * @return: find a  majority number
   */
  public int majorityNumber(ArrayList<Integer> nums) {
    List<Integer> n = new ArrayList<Integer>();
    List<Integer> cnt = new ArrayList<Integer>();

    for (Integer i: nums) {
      int c=0;

      if (n.size() == 0){
        n.add(i);
        cnt.add(1);
      } else {
        if (n.contains(i)) {
          c = cnt.get(n.indexOf(i));
          c++;
          cnt.set(n.indexOf(i),c);
        } else {
          n.add(i);
          cnt.add(1);
        }
      }
    }

    int max = 0;
    for (Integer i: cnt) {
      max = (i>max) ? i : max;
    }

    if (max > nums.size()/2){
      return n.get(cnt.indexOf(max));
    } else {
      return -1;
    }
  }
}