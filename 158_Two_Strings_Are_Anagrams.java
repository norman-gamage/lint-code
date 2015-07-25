/**
 * Title                Two Strings Are Anagrams
 * Problem No           158
 * URL                  http://www.lintcode.com/en/problem/two-strings-are-anagrams/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 28
 */

public class Solution {
  /**
   * @param s: The first string
   * @param b: The second string
   * @return true or false
   */
  public boolean anagram(String s, String t) {
    if (null == s || t == null || s.length() == 0 || t.length() == 0) {
      return false;
    }

    String a = s + t;
    int d = 0;
    for (Character c : a.toCharArray()) {
      d ^= c;
    }

    return (d == 0) ? true : false;
  }
}