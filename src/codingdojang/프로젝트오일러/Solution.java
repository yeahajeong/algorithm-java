package codingdojang.프로젝트오일러;
// https://codingdojang.com/scode/350?answer_mode=hide

/*
* 문제 해결 아이디어
* 1. 전체 N을 돌면서 배수를 각각 다 확인한다. -> O(N)만큼
* 2. 연산을 이용해서 구한다. -> O(1)?
*   예를 들어 100까지의 3의 배수를 구한다고 한다면 3, 6, 9, ... , 99 의 수들이 있다.
*   이 숫자들을 더하면 3(1+2+3+ ... + 33) 으로 구할 수 있다.
*   그래서 각각의 배수 합을 구하고 두수의 최소공배수를 빼주는 연산을 사용해서 문제를 풀었다.*/

public class Solution {

  // 해결책 1
  public int solution1(int N, int num1, int num2) {

    int answer = 0;

    for (int i = 1; i < N; i++) {
      if (i % num1 == 0 || i % num2 == 0) {
       answer += i;
      }
    }
    return answer;
  }

  // 해결책 2
  public int solution2(int N, int num1, int num2) {
    return (totalSum((N-1) / num1) * num1) + (totalSum((N-1) / num2) * num2) + (totalSum((N-1) / (num1 * num2)) * (num1 * num2));
  }

  // 1 부터 n까지의 합계를 구하는 함수
  public int totalSum(int n) {
    return (n * (n + 1)) / 2;
  }

}
