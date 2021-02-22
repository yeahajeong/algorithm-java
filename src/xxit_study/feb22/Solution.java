package xxit_study.feb22;
// https://codingdojang.com/scode/350?answer_mode=hide

/*
* 문제 해결 아이디어
* 1. 전체 N을 돌면서 배수를 각각 다 확인한다. -> O(N)
* 2. 연산을 이용해서 구한다.
*   예를 들어 100까지의 3의 배수를 구한다고 한다면 3, 6, 9, ... , 99 의 수들이 있다.
*   이 숫자들을 더하면 3(1+2+3+ ... + 33) 으로 구할 수 있다.
*   1 부터 33 까지의 합은 { 33 * (33 + 1) } / 2로 구한다.
*   33 값은 100-1 을 3으로 나눈 몫이기 때문에
*   해당 값의 공식 = 구할 배수 * (1부터 구할 배수까지의 합)
*   그래서 각각의 배수 합을 구하고 두수의 최소공배수를 빼주는 연산을 사용해서 문제를 풀었다.
*   -> O(n)이지만 전부 다 도는 풀이1 보다는 적게 걸릴것 같다...*/

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
    return (num1 * totalSum((N - 1) / num1)) + (num2 * totalSum((N - 1) / num2)) - ((lcm(num1, num2) * totalSum((N - 1) / lcm(num1, num2))));
  }

  // 1 부터 n까지의 합계를 구하는 함수
  public int totalSum(int n) {
    return (n * (n + 1)) / 2;
  }

  // 최소 공배수를 구하는 함수 - 유클리드 호제법
  public int lcm(int n1, int n2) {
    int big, small;
    int mok, nmg;
    int gcf, lcm; //최대공약수, 최소공배수

    if (n1 >= n2) {
      big = n1;
      small = n2;
    } else {
      big = n2;
      small = n1;
    }

    while (true) {
      nmg = big % small;
      mok = big / small;

      if (nmg != 0) {
        big = small;
        small = mok;
      } else {
        gcf = small;
        lcm = n1 * n2 / gcf;
        return lcm;
      }
    }
  }

  /*
  * 참고 - 유클리드 호제법을 재귀로도 구할 수 있다.
  * 다음은 최대 공약수를 구하는 함수
  * 최소 공배수는 최대 공약수를 구한 후 (원래 두값의 곱 / 최소 공배수)로 구한다.
  * 1. 매개변수 n1, n2를 받는다
  * 2. n2가 0이라면 n1이 최대 공약수
  * 3. n2가 0이 아니라면, 매개변수로 b와 a % b를 받는다.
  * 4. 반복*/
  public int eucildean(int n1, int n2) {
    if (n2 == 0) {
      return n1;
    } else {
      return eucildean(n2, n1 % n2);
    }
  }

}
