/**
 * Title                strStr
 * Problem No           13
 * URL                  http://www.lintcode.com/en/problem/strstr/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jul 25
 */

class Solution {
  /**
   * Returns a index to the first occurrence of target in source,
   * or -1  if target is not part of source.
   * @param source string to be scanned.
   * @param target string containing the sequence of characters to match.
   */
  public int strStr(String source, String target) {
    return (null == source || null == target) ? -1 : source.indexOf(target);
  }
}