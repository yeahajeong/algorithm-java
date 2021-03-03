package baekjoon.약수구하기;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void 약수_구하기_테스트1() {
    int n = 6;
    int k = 3;
    int Return = 3;
    assertEquals(Return, solution.solution(n, k));
  }

  @Test
  public void 약수_구하기_테스트2() {
    int n = 7;
    int k = 3;
    int Return = 0;
    assertEquals(Return, solution.solution(n, k));
  }
}
