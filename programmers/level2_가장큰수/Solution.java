package level2_가장큰수;
//https://programmers.co.kr/learn/courses/30/lessons/42746?language=java

/* 문제 해결 아이디어
* 예전에 파이썬으로 풀 때 신박한 풀이방법에 놀라서 잊지않고 기억하고 있다.
* 이 문제의 문제는 첫째자리 둘째자리... 까지 다 대소를 비교해야한다는 점이다.
* 그래서 numbers의 원소는 0이상 1000이하이니까 최대 세자리까지 비교하도록 해준다.
* -> 세자리로 하니까 테스트4번에서 막혀서 네자리까지 비교를 했더니 통과
*
* 문제를 풀다가 느낀점은 형변환이 정말 골치아프게 한다는 점..
* 속상하네 증말
* 파이썬 같은 경우는 자동으로 형변환이 되어서 편리한데
* 자바로 하려니 상당히 복잡해졌다
*
* 전부 0이 들어왔을 경우를 생각해야한다
* 뭔가 엄청 오래 걸리는 해결풀이가 완성된거같은데..
* 다른사람들은 이런 방식으로 안푼거같다.. 오늘은 여기까지만 할래
*
* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution {
  public String solution(int[] numbers) {
    String answer = "";

    HashMap<Integer, Integer> hm = new HashMap<>();

    for (int i = 0; i < numbers.length; i++) {
      StringBuffer str = new StringBuffer();
      String numStr = Integer.toString(numbers[i]);

      //문자열 세번 반복하기
      for (int j = 0; j < 4; j ++) {
        str.append(numStr);
      }

      //네 글자씩 쪼개기
      hm.put(i, Integer.parseInt(String.valueOf(str).substring(0,4)));
    }

    //내림차순 정렬
    List<Integer> keySetList = new ArrayList<>(hm.keySet());
    Collections.sort(keySetList, (o1, o2) ->
      hm.get(o2).compareTo(hm.get(o1))
    );

    if (numbers[keySetList.get(0)] == 0) {
      return "0";
    } else {
      for (int key : keySetList) {
        String result = Integer.toString(numbers[key]);
        answer += result;
      }
    }


    return answer;
  }
}
