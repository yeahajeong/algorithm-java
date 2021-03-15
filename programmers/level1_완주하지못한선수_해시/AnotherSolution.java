package level1_완주하지못한선수_해시;

import java.util.HashMap;

public class AnotherSolution {

  public String solution(String[] participant, String[] completion) {
    String answer = "";

    HashMap<String, Integer> hm = new HashMap<>();

    // 파이썬의 Counter와 같은 기능
    // 각각의 개수를 해시맵에 저장
    /* getOrDefault(Object key-찾을 키값, V defaultValue-없다면 반환할 값)
    * 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환한다.*/
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
