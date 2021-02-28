package xxit_study.feb28;
// https://codingdojang.com/scode/465?answer_mode=hide

/* 문제 해결 아이디어1 => 실패
* 1. 먼저 str을 배열로 바꾼다.
* 2. 비교하는 값을 저장해서 for문을 돈 배열이랑 확인 후
*   같다면 갯수를 카운트 해주고 같지않다면 결과에 붙이는 식,,
*  => 이전 문자를 바꿔주는 로직을 생각할 수가 없어서 실패
*
* 문제 해결 아이디어2
* 1. str을 queue에 담는다. -> 하나씩 빼서 확인하는 걸로
*   스택으로 할까 생각했지만 str을 뒤집어줘야하고,, 뭔가 번거로운것 같아서 queue를 사용
* 2. 처음 문자의 갯수는 1개부터 시작이니까 count 변수를 1로 초기화
* 3. 큐에서 데이터를 꺼내서 큐의 왼쪽에 들어있는 값과 비교한다.
*   - 일치하면 count를 해준다.
*   - 일치하지 않으면 앞쪽에 쌓아둔 문자열을 결과로 보내고 count를 1로 변경한다.
* 4. 반복한다.
* */

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

  public String solution2(String str) {
    // 변경이 자주 일어나니 StringBuffer를 사용 - 오키님 정보 참고
    StringBuffer answer = new StringBuffer();

    // str을 queue에 담기
    Queue<String> queueStr = new LinkedList<>();
    for (int i = 0; i < str.length(); i++) {
      queueStr.add(String.valueOf(str.charAt(i)));
    }

    String check = "";
    int count = 1;

    // 큐에 데이터가 있는동안 반복
    while (!queueStr.isEmpty()) {
      check = queueStr.remove();
      if (check.equals(queueStr.peek())) {
        count += 1;
      } else {
        answer.append(check);
        answer.append(count);
        count = 1;
      }
    }
    return String.valueOf(answer);
  }


  public String solution1(String str) {
    String answer = "";
    StringBuffer result = new StringBuffer();

    // String 을 배열로 변환
    String[] ArrayStr = str.split("");

    char check = str.charAt(0);
    int count = 0;

    for (String s : ArrayStr) {
      if (s.equals(check)) {
        count += 1;
      } else {
        result.append(check);
        result.append(count);
        count = 0;
      }
    }

    result.append(check);
    result.append(count);

    return String.valueOf(result);
  }
}
