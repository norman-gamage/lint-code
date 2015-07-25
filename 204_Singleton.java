/**
 * Title                Singleton
 * Problem No           204
 * URL                  http://www.lintcode.com/en/problem/singleton/
 *
 * Original Solution    No
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jul 26
 */

class Solution {
  /**
   * @return: The same instance of this class every time
   */
  private static volatile Solution instance = null;
  public static Solution getInstance() {
    if (instance == null) {
      synchronized (Solution.class) {
        if (instance == null)
          instance = new Solution();
      }
    }
    return instance;
  }
}