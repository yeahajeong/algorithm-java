package xxit_study.feb26;
//https://codingdojang.com/scode/410?answer_mode=hide

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {

  public void solution(String str) {

    int kim = 0, lee = 0;
    int leejaeyoung = 0;
    ArrayList<String> duplication = new ArrayList<>();
    ArrayList<String> sortDuplication = new ArrayList<>();

    String[] names = str.split(","); // , 를 기준으로 분리
    HashMap<String, Integer> hm = new HashMap<>();

    for (String name : names) {
      // 성만 검사해야하기 때문에 contains()메소드 말고 substring()으로 문자열을 쪼개서 확인
      String lastName = name.substring(0, 1);

      // 김씨이면 kim 카운트
      if (lastName.equals("김")) {
        kim += 1;
      }

      // 이씨이면 lee 카운트
      if (lastName.equals("이")) {
        lee += 1;
      }

      // 이재영 개수 세기
      if (name.equals("이재영")) {
        leejaeyoung += 1;
      }

      // 중복 거르기
      if (hm.containsKey(name) == false) {
        hm.put(name, 1);
      } else {
        int count = hm.get(name) + 1;
        hm.remove(name);
        hm.put(name, count);
      }
    }

    for (String key : hm.keySet()) {
      if (hm.get(key) > 1) {
        duplication.add(key);
      }
    }

    sortDuplication = duplication;
    Collections.sort(sortDuplication);

    System.out.println("김씨 : " + kim + ", 이씨 : " + lee);
    System.out.println("이재영 : " + leejaeyoung);
    System.out.println("중복 제거 이름 : " + duplication);
    System.out.println("중복 제거 이름 오름차순 : " + sortDuplication);
  }
}
