package programmers.level1_K번째수;

import java.util.Arrays;

/* 다른 사람 풀이 중 알게 된 것
* - Arrays.copyOfRange(원본배열, 복사하려는 시작 요소의 인덱스, 복사하려는 마지막 요소의 다음 인덱스)
* 특정 배열의 원하는 범위만큼 복사하여 새로운 배열을 만드는 메소드 함수
* */

public class AnotherSolution {

  public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];

    for (int i = 0; i < commands.length; i++) {
      int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
      Arrays.sort(temp);
      answer[i] = temp[commands[i][2] - 1];
    }

    return answer;
  }
}
