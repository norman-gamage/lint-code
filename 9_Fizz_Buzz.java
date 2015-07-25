/**
 * Title                Fizz Buzz
 * Problem No           9
 * URL                  http://www.lintcode.com/en/problem/fizz-buzz/
 *
 * Original Solution    No
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 28
 */

class Solution {
  /**
   * param n: As description.
   * return: A list of strings.
   */
  public ArrayList<String> fizzBuzz(int n) {
    ArrayList<String> results = new ArrayList<String>();
    for (int i = 1; i <= n; i++) {
      if (i % 15 == 0) {
        results.add("fizz buzz");
      } else if (i % 5 == 0) {
        results.add("buzz");
      } else if (i % 3 == 0) {
        results.add("fizz");
      } else {
        results.add(String.valueOf(i));
      }
    }
    return results;
  }
}