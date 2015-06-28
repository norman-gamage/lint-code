/**
 * Title                Merge Intervals
 * Problem No           156
 * URL                  http://www.lintcode.com/en/problem/merge-intervals/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 28
 */

/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */
class Solution {
  /**
   * @param intervals: Sorted interval list.
   * @return: A new sorted interval list.
   */
  public List<Interval> merge(List<Interval> intervals) {
    Comparator<Interval> c = new Comparator<Interval>() {
      @Override
      public int compare(Interval i1, Interval i2) {
        return (i1.start - i2.start);
      }
    };

    Collections.sort(intervals, c);
    boolean flag = false;

    for (int j = 0; j < intervals.size(); ++j) {
      int len = intervals.size();
      for (int i = 0; i < len - 1; ++i) {
        Interval A = intervals.get(i);
        Interval B = intervals.get(i + 1);

        if (A.start == B.start) {
          if (A.end == B.end || A.end > B.end) {
            flag = true;
          } else if (A.end < B.end) {
            intervals.set(i, intervals.get(i + 1));
            flag = true;
          }
        } else if (A.end >= B.start) {
          if (A.end == B.end || A.end > B.end) {
            flag = true;
          } else if (A.end < B.end) {
            intervals.set(i, new Interval(A.start, B.end));
            flag = true;
          }
        }

        if (flag) {
          flag = false;
          intervals.remove(i + 1);
          --len;
          --i;
        }
      }
    }

    return intervals;
  }
}