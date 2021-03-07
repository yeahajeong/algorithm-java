package baekjoon.PART1_튼튼한기본기.이진수;

import java.util.*;

public class Solution {

  public String solution(int num) {

    String str = "";
    Queue<Integer> q = new LinkedList<>();

    int answer = 0;
    int mok = num;
    int nmg;

    while (mok != 0) {
      nmg = mok % 2;
      if (nmg == 1) {
        q.add(answer);
      }
      mok = mok / 2;
      answer++;
    }

    while (true) {
      str += Integer.toString(q.remove());
      if (!q.isEmpty()) {
        str += " ";
      } else {
        break;
      }
    }
    return str;
  }

}
