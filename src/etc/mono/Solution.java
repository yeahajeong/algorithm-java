package etc.mono;

// 이길 수 있는 최대 횟수를 구하는 문제
/*
* 문제 해결 아이디어
* 작은 수 부터 이겨버리는게 이길 수 있는 횟수를 가장 크게 할 수 있다는 점을 떠올림
* 두 개의 배열을 정렬해서 비교를 하며 작은 수부터 이겨버리도록 카운트를 시켜버림
* */

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
  public int solution(int[] A, int[] B) {

    int answer = 0;

    // 먼저 a,b 배열 오름차순 정렬
    Arrays.sort(A);
    Arrays.sort(B);

    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int b : B) {
      arrayList.add(b);
    }

    for (int i = 0; i < A.length; i++) { //O(a의길이)
      for (int j = 0; j < arrayList.size(); j++) { //O(b의 길이 - 알파)
        if (A[i] < arrayList.get(j)) {
          answer += 1;
          arrayList.remove(j);
          break;
        }
      }
    }
    return answer;
  }
}
