package nf;

public class Solution {

  // 감소하지 않는 순서로 정렬된 N개의 정수 배열 A
  // [1, 2, 5, 9, 9]
  public int solution(int[] A, int X) {
    int N = A.length;

    if (N == 0) {
      return -1;
    }

    int l = 0;
    int r = N - 1;

    while (l < r) {
      int m = (l + r) / 2;
      if (A[m] > X) {
        r = m - 1;
      } else {
        l = m;
      }
      if (A[m] == A[r]) {
        return m-1;
      }
    }

    if (A[l] == X) {
      return l;
    }

    return -1;
  }

}
