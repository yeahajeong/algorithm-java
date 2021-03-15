package level2_위장_해시;

// https://programmers.co.kr/learn/courses/30/lessons/42578?language=java

/*
* 나의 아이디어는
* 종류별로 몇개를 가지고 있는지 개수를 카운트 한 후에
* 총배열의 개수 + 카운트 한 종류의 곱 을 하는 걸로 생각함
*
* 가지고 있는 종류를 다 입을 필요는 없음
*
* 예시를 살펴보자.
* 얼굴 - 안경, 선글라스
* 상의 - 티셔츠
* 하의 - 청바지
* 겉옷 - 긴코드
*
* 얼굴에서 고를 수 있는 가지수는 안경, 선글라스, nothing -> 3가지
* 상의는 티셔츠, nothing -> 2가지
* 이런식으로 가지수를 모두 곱하면 정답을 구할 수 있다.
* 단, 스파이가 최소한 한가지 옷은 입는다고 했으니 전체 가지수에서
* 아무것도 입지않은 상태를 빼야한다.
*
* */

import java.util.HashMap;

public class Solution {
  public int solution(String[][] clothes) {

    int answer = 1;

    HashMap<String, Integer> countClothes = new HashMap<>();

    // 각 종류의 개수 세기
    for (String[] cloth : clothes) countClothes.put(cloth[1], countClothes.getOrDefault(cloth[1], 1) + 1);

    // 모든 경우의 수 곱하기
    for (int i : countClothes.values()) {
      answer *= i;
    }

    return answer - 1;

    /*HashMap<String, Integer> hm = new HashMap<>();

    // 개수 세기
    for (String[] cloth : clothes) hm.put(cloth[1], hm.getOrDefault(cloth[1], 0) + 1);

    if (hm.size() == 1) {
      return clothes.length;
    } else {
      int answer = 1;
      for (String key : hm.keySet()) {
        answer *= hm.get(key);
      }
      return answer + clothes.length;
    }*/

  }
}
