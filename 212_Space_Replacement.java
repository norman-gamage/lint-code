/**
 * Title                Space Replacement
 * Problem No           212
 * URL                  http://www.lintcode.com/en/problem/space-replacement/
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
   * @param string: An array of Char
   * @param length: The true length of the string
   * @return: The true length of new string
   */
  public int replaceBlank(char[] string, int length) {
    if (length == 0) {
      return 0;
    }

    char[] s = "%20".toCharArray();

    int cnt = 0;
    for (int i = 0; i < length; i++) {
      if (string[i] == ' ') {
        cnt++;
      }
    }

    int out = length + (cnt * 3) - cnt;
    int newLen = out - 1;

    for (int i = length - 1; i >= 0; i--) {
      if (string[i] == ' ') {
        for (int j = s.length - 1; j >= 0; j--) {
          string[newLen] = s[j];
          newLen--;
        }
      } else {
        string[newLen] = string[i];
        newLen--;
      }
    }

    return out;
  }
}