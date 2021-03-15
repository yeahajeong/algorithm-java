package CyclicRotation;

public class AnotherSolution {
  public int[] solution(int[] A, int K) {

    int[] answer = new int[A.length];

    for (int i = 0; i < A.length; i++) {
      int idx = (i + K) % A.length;
      answer[idx] = A[i];
    }
    return answer;
  }
}
