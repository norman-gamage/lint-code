/**
 * Title                Insert Interval
 * Problem No           30
 * URL                  http://www.lintcode.com/en/problem/insert-interval/
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
   * Insert newInterval into intervals.
   * @param intervals:   Sorted interval list.
   * @param newInterval: A new interval.
   * @return: A new sorted interval list.
   */
  public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
    ArrayList<Interval> result = new ArrayList<Interval>();

    if (null == intervals && null == newInterval) {
      return result;
    } else if (null == intervals || intervals.size() == 0) {
      result.add(newInterval);
      return result;
    } else if (null == newInterval) {
      return intervals;
    }

    if (newInterval.end < intervals.get(0).start) {
      result.add(newInterval);
      result.addAll(intervals);
    } else if (newInterval.start > intervals.get(intervals.size() - 1).end) {
      result.addAll(intervals);
      result.add(newInterval);
    } else {

      for (Interval interval : intervals) {
        if (interval.end < newInterval.start) {
          result.add(interval);
        } else if (interval.start > newInterval.end) {
          result.add(newInterval);
          newInterval = interval;
        } else if (interval.end >= newInterval.start || interval.start <= newInterval.end) {
          newInterval = new Interval(Math.min(interval.start, newInterval.start), Math.max(newInterval.end, interval.end));
        }
      }

      result.add(newInterval);
    }

    return result;
  }
}