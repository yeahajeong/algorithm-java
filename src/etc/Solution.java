package etc;

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
