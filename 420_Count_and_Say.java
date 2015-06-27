/**
 * Title                Count and Say
 * Problem No           420
 * URL                  http://www.lintcode.com/en/problem/count-and-say/
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
   * @param n the nth
   * @return the nth sequence
   */
  public String countAndSay(int n) {
    String x = "1";

    if (n < 1) {
      return new String();
    }

    for (int z = 1; z < n; ++z) {
      int i = 0;
      Character ch = x.charAt(0);
      int cnt = 0;
      String new_x = "";

      while (i < x.length()) {
        if (ch == x.charAt(i)) {
          ++cnt;
        } else {
          new_x += Integer.toString(cnt) + Character.toString(ch);
          ch = x.charAt(i);
          cnt = 1;
        }

        ++i;
      }
      new_x += Integer.toString(cnt) + Character.toString(ch);
      x = new_x;
    }

    return x;
  }
}
