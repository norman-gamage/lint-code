/**
 * Title                Reverse Words in a String
 * Problem No           53
 * URL                  http://www.lintcode.com/en/problem/reverse-words-in-a-string/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jul 25
 */

public class Solution {
  /**
   * @param s : A string
   * @return : A string
   */
  public String reverseWords(String s) {
    String[] ss = s.trim().split(" ");
    String out = new String();

    for (int i=ss.length-1; i>-1; --i) {
      out += ss[i] + " ";
    }
    return out.trim();
  }
}