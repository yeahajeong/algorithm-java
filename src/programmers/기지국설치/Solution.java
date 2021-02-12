package programmers.기지국설치;

// https://programmers.co.kr/learn/courses/30/lessons/12979
/*
* 내생각
* 빈공간을 계산해서 기지국이 몇개 들어갈지 각각 계산하는 것으로 아이디어를 떠올림
*
* 기지국 설치가 필요한 범위를 구해서 전파선의 길이를 나눠서 올림을 해주면
* 그 범위안에 설치가 필요한 기지국의 개수를 합하는 식으로 구했다.
*
* 1번 15번 정확성 테스트 실패
* 효율성에서는 123 실패
*
* 시간 초과가 왜 나는 것일까 고민을 해보았다.
* 구글링을 해본 결과 Meth.ceil을 사용해서 시간 초과가 난것 같다..
* Math.ceil을 열어봤는데 여기저기 얽혀있는거 같고 생각보다 훨씬 복잡하더라 흑흑
* 가급적 라이브러리 사용은 안하는걸로..
* Math 사용을 제외해서 효율성 부분에서는 통과가 되었지만
* 정확성 1번과 15번이 문제가 되었다.
* 생각하지 못한 케이스가 뭐가 있을까...........
*
*
* */

public class Solution {

  public int solution(int n, int[] stations, int w) {
    if (w > n - 2) {
      return 0; //가지치기
    }

    int answer = 0;
    int start = 1;
    int range = 2 * w + 1;

    for (int station : stations) {
      int end = station - w;
      int needInstall = end - start;

      if (needInstall >= 0) {
        answer += needInstall % range == 0 ? needInstall / range : needInstall / range + 1;
      }
      start = station + w + 1;
    }

    if (start < n) {
      int needInstall = (n + 1) - start;
      answer += needInstall % range == 0 ? needInstall/range : needInstall/range + 1;
    }

    return answer;
  }

}
