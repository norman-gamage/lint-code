/**
 * Title                Unique Characters
 * Problem No           157
 * URL                  http://www.lintcode.com/en/problem/unique-characters/
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
   * @param str: a string
   * @return: a boolean
   */
  public boolean isUnique(String str) {
    if (null == str || str.length() == 0) {
      return false;
    }

    char[] c = str.toCharArray();

    for (int i = 0; i < str.length() - 1; i++) {
      for (int j = i + 1; j < str.length(); j++) {
        if ((c[i] ^ c[j]) == 0) {
          return false;
        }
      }
    }

    return true;
  }
}