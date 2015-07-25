/**
 * Title                Valid Palindrome
 * Problem No           415
 * URL                  http://www.lintcode.com/en/problem/valid-palindrome/
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
   * @param s A string
   * @return Whether the string is a valid palindrome
   */
  public boolean isPalindrome(String s) {
    if (null == s || s.length() == 0) {
      return true;
    }

    s = s.replace(" ", "").replace(".", "").replace(":", "").replace(",", "");
    String rev = new StringBuilder(s).reverse().toString();

    return (s.equalsIgnoreCase(rev));
  }
}