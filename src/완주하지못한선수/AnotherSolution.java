package 완주하지못한선수;

import java.util.HashMap;

public class AnotherSolution {

  public String solution(String[] participant, String[] completion) {
    String answer = "";

    HashMap<String, Integer> hm = new HashMap<>();

    // 파이썬의 Counter와 같은 기능
    // 각각의 개수를 해시맵에 저장
    for (String p : participant) hm.put(p, hm.getOrDefault(p, 0) + 1);
    // 완료자를 해시맵에서 빼기
    for (String c : completion) hm.put(c, hm.get(c) - 1);

    for (String key : hm.keySet()) {
      if (hm.get(key) != 0) {
        answer = key;
        break; // 마지막까지 탐색할 필요가 없도록 효율 증가
      }
    }
    return answer;
  }
}
