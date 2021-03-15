package StringAndArray;

/*
* Given an array of meeting time intervals consisting of start and end times
* [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.
* 시작 및 종료 시간 [[s1, e1], [s2, e2], ...] (si <ei)으로 구성된
* 회의 시간 간격 배열이 주어지면 한 사람이 모든 회의에 참석할 수 있는지 확인합니다.
*
* Input: [[0,30],[5,10],[15,20]]
* Output: false
* Input: [[7,10],[2,4]]
* Output: true
*
* 문제 해결
* 1. sorting
* 2. hold.end > cur.start
*
* */

import java.util.Arrays;
import java.util.Comparator;

class Interval {
  int start;
  int end;

  Interval(){
    this.start = 0;
    this.end = 0;
  }

  Interval(int s, int e) {
    this.start = s;
    this.end = e;
  }

}

public class MeetingRoom {

  public static void main(String[] args) {
    MeetingRoom room = new MeetingRoom();
    Interval int1 = new Interval(15, 20);
    Interval int2 = new Interval(5, 10);
    Interval int3 = new Interval(0, 30);

    Interval[] intervals = {int1, int2, int3};
    System.out.println(room.solve(intervals));
  }

  public boolean solve(Interval[] intervals) {
    //1. 배열에 null이 있는지 확인
    if(intervals == null || intervals.length == 0) return false;

    //2. sort
    Arrays.sort(intervals, Comp);

    //3. 비교
    for (int i = 1; i < intervals.length; i++) {
      if (intervals[i - 1].end > intervals[i].start) {
        return false;
      }
    }
    return true;
  }

  //Interval 타입으로 소팅
  Comparator<Interval> Comp = new Comparator<Interval>() {
    @Override
    public int compare(Interval o1, Interval o2) {
      return o1.start - o2.start; //오름차순
    }
  };

  public void print(Interval[] intervals) {
    for (int i = 0; i < intervals.length; i++) {
      Interval in = intervals[i];
      System.out.println(in.start + " " + in.end);
    }
  }
}
