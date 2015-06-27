/**
 * Title                Compare Strings
 * Problem No           55
 * URL                  http://www.lintcode.com/en/problem/compare-strings/
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
   * @param A : A string includes Upper Case letters
   * @param B : A string includes Upper Case letter
   * @return :  if string A contains all of the characters in B return true else return false
   */
  public boolean compareStrings(String A, String B) {
    int aLength = A.length();
    int bLength = B.length();

    if (aLength < bLength) {
      return false;
    }

    for (int i = 0; i < bLength; ++i) {
      String p = Character.toString(B.charAt(i));

      int aCount = aLength - A.replaceAll(p, "").length();
      int bCount = bLength - B.replaceAll(p, "").length();

      if (aCount < bCount) {
        return false;
      }
    }

    return true;
  }
}