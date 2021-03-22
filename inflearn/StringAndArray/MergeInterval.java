package StringAndArray;

/* Given a collection of intervals, merge all overlapping intervals.
* Input: [[1,3],[2,6],[8,10],[15,18]]
* Output: [[1,6],[8,10],[15,18]]*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {

  public static void main(String[] args) {
    Interval in1 = new Interval(1,3);
    Interval in2 = new Interval(2,6);
    Interval in3 = new Interval(8,10);
    Interval in4 = new Interval(15,18);

    List<Interval> intervals = new ArrayList<>();
    intervals.add(in1);
    intervals.add(in2);
    intervals.add(in3);
    intervals.add(in4);

    MergeInterval solution = new MergeInterval();
    List<Interval> list = solution.merge(intervals);

    solution.print(list);

  }

  public List<Interval> merge(List<Interval> intervals) {
    if (intervals.isEmpty()) return intervals;

    //1. 담을 그릇
    List<Interval> result = new ArrayList<>();

    print(intervals);
    //오름차순으로 sort 람다 표현식 사용 -> 왜 안되는 거야ㅠㅠ
    Collections.sort(intervals, (o1, o2) -> o1.start - o2.start);
    print(intervals);

    //예전 방식 -> comparator 사용
//    Collections.sort(intervals, comp);

    return result;
  }

  void print(List<Interval> list) {
    for (int i = 0; i < list.size(); i++) {
      Interval in = list.get(i);
      System.out.println(in.start + " " + in.end);
    }
    System.out.println();
  }

  Comparator comp = new Comparator<Interval>() {
    @Override
    public int compare(Interval o1, Interval o2) {
      return o1.start - o2.start;
    }
  };

}
