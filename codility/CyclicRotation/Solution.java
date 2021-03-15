package CyclicRotation;
// [Arrays]
// https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/

// 실패한 나의 풀이...

public class Solution {

  public int[] solution(int[] A, int K) {

    int l = A.length;
    int[] answer = new int[l];

    // 빈배열일 경우
    if (l == 0) {
      return A;
    }

    // 제자리로 돌아올 경우
    if (K > 1 && l % K == 0) {
      return A;
    }

    // 배열의 범위를 넘어갈 경우
    if (K > l) {
      K = K % l;
    }

    for (int i = 0; i < l; i++) {
      int index = (i - K) < 0 ? l + (i - K) : (i - K);
      answer[i] = A[index];
    }

    return answer;
  }
}
