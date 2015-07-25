/**
 * Title                Valid Parentheses
 * Problem No           423
 * URL                  http://www.lintcode.com/en/problem/valid-parentheses/
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
   * @return whether the string is a valid parentheses
   */
  public boolean isValidParentheses(String s) {
    Stack st = new Stack();

    for (Character c : s.toCharArray()) {
      if (!st.empty() && (
          (c == ')' && (Character) st.peek() == '(') ||
              (c == '}' && (Character) st.peek() == '{') ||
              (c == ']' && (Character) st.peek() == '[')
      )
          ) {
        st.pop();
      } else {
        st.push(c);
      }
    }

    return (st.empty()) ? true : false;
  }
}