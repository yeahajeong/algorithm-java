package programmers.level1_K번째수;
//https://programmers.co.kr/learn/courses/30/lessons/42748

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

  public int[] solution(int[] array, int[][] commands) {

    // 1. 자른다
    // 2. 정렬한다
    // 3. index에 해당하는 값을 꺼낸다

    ArrayList<Integer> arrayList = new ArrayList<>();
    int[] answer = new int[commands.length];

    for (int i = 0; i < commands.length; i++) {
      for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
        arrayList.add(array[j]);
      }
      Collections.sort(arrayList); //arrayList의 정렬
      answer[i] = arrayList.get(commands[i][2] - 1);
      arrayList.clear(); //다시 담아야하기 떄문에 리스트의 모든 아이템 삭제
      //첫번째 포문 돌때 선언해도 상관없음 clear()지우고
    }
    return answer;
  }

  //처음 푼 풀이 실패
  public int[] fail(int[] array, int[][] commands) {

    ArrayList<Integer> answerArrList = new ArrayList<>();
    int[] answer = new int[commands.length];

    // 배열을 원하는 만큼 자르려고 string으로 변경
    // toString을 사용하면 불필요한 놈들까지 따라와서 이 방법을 택함
    StringBuffer str = new StringBuffer();
    for (int num : array) {
      str.append(num);
    }

    for (int[] command : commands) {
      String sliceStr = str.substring(command[0], command[1]); //자르기
      char c = sliceStr.charAt(command[2] - 1);
      int n = 0;
      n = c - '0'; //char형을 int형으로 변환
      answerArrList.add(n);
    }

    return answer;
  }
}
