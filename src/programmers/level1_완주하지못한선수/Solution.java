package programmers.level1_완주하지못한선수;

import java.util.Arrays;

// 뭔가 엄청 간단하게 풀어버린거같은데.. 찝찝한 이 기분
// 파이썬으로 하다가 자바로하려니까 헷갈렸다
// 자바에는 Counter가 없음

// for 문 안에서 변수 선언하지 않고 밖에서 선언해주면
// 마지막 마지막에 있는 놈 participant[i]로 해결할 수 있음


public class Solution {
  public String solution(String[] participant, String[] completion) {
    // 정렬
    Arrays.sort(participant);
    Arrays.sort(completion);

    // 비교해서 같지 않으면 그놈이 완주하지 못한 놈
    for (int i = 0; i < completion.length; i++) {
      if (!participant[i].equals(completion[i])) {
        return participant[i];
      }
    }
    // 끝까지 없으면 마지막에 있는 놈이 완주하지 못한 놈
    return participant[participant.length-1];
  }
}
