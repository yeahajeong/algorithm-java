public class Combination {
  /*
  * 조합 구하기
  * 조합이란? n개의 숫자 중 r개를 선택하는 모든 경우를 구하는 것
  * 고려해야하는 점
  * 1. 배열에서 i번째 인덱스를 선택하는 경우
  * 2. 선택하지 않는 경우
  * -> 이렇게 두가지로 모든 경우를 완전탐색 해주면 된다..
  * -> 백트레킹과 재귀를 이용해 구할 수 있다.*/

  public static void main(String[] args) {

  }

  //배열 [1,2,3,4]가 있을 때 2개를 선택하는 경우

  //백트레킹을 이용한 구현
  /*
  * 백트레킹을 이용한 구현
  * array : 조합을 뽑아낼 배열
  * visited : 조합에 뽑혔는지 체크하는 배열
  * n : 배열의 길이
  * r : 조합의 길이
  * start : 기준*/
  public void combination_backtracking(int[] array, boolean[] visited, int start, int r) {
    if (r == 0) {

    }
  }
}
