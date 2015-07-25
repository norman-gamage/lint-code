/**
 * Title                Length of Last Word
 * Problem No           422
 * URL                  http://www.lintcode.com/en/problem/length-of-last-word/
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
   * @param s A string
   * @return the length of last word
   */
  public int lengthOfLastWord(String s) {
    s = s.trim();
    if (null == s || 0 == s.length()) {
      return 0;
    } else {
      if (s.contains(" ")) {
        return s.length() - (s.lastIndexOf(" ") + 1);
      } else {
        return s.length();
      }
    }
  }
}