/**
 * Title                Longest Words
 * Problem No           133
 * URL                  http://www.lintcode.com/en/problem/longest-words/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 27
 */

class Solution {
  /**
   * @param dictionary: an array of strings
   * @return: an arraylist of strings
   */
  ArrayList<String> longestWords(String[] dictionary) {
    ArrayList<String> al = new ArrayList<String>();
    int max = 0;
    for (int i = 0; i < dictionary.length; ++i) {
      if (dictionary[i].length() > max) {
        al = new ArrayList<String>();
        al.add(dictionary[i]);
        max = dictionary[i].length();
      } else if (dictionary[i].length() == max) {
        al.add(dictionary[i]);
      }
    }

    return al;
  }
}