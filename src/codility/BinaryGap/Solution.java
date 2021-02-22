package codility.BinaryGap;
// [Iterations]
// https://app.codility.com/programmers/lessons/1-iterations/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
  public int solution(int N) {
    int mok = N;
    int nmg = 0;

    // 이진 숫자 만들기
    ArrayList<Integer> binary = new ArrayList<>();
    while (true) {
      nmg = mok % 2;
      mok = mok / 2;
      if (mok == 0) break;
      binary.add(nmg);
    }

    //배열 뒤집기
    Collections.reverse(binary);

    int count1 = 0;
    int count0 = 0;
    int answer = 0;

    for (int i =0; i< binary.size(); i++) {

      if (binary.get(i) == 0) {
        count0 += 1;
      }

      if (binary.get(i) == 1) {
        count1 += 1;
        if (count0 > answer) {
          answer = count0;
        }
        count0 = 0;
      }
    }

    return answer;
  }
}
