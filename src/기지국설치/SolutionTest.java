package 기지국설치;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

  @Test
  public void 테스트_1() {

    Solution solution = new Solution();

    int n = 11;
    int[] stations = {4, 11};
    int w = 1;
    int Return = 3;

    assertEquals(Return, solution.solution(n, stations, w));
  }

  @Test
  public void 테스트_2() {

    Solution solution = new Solution();

    int n = 6;
    int[] stations = {2, 5};
    int w = 1;
    int Return = 0;

    assertEquals(Return, solution.solution(n, stations, w));
  }

  @Test
  public void 테스트_3() {

    Solution solution = new Solution();

    int n = 8;
    int[] stations = {3,4,7};
    int w = 1;
    int Return = 1;

    assertEquals(Return, solution.solution(n, stations, w));
  }

  @Test
  public void 테스트_4() {

    Solution solution = new Solution();

    int n = 16;
    int[] stations = {9};
    int w = 2;
    int Return = 3;

    assertEquals(Return, solution.solution(n, stations, w));
  }
}
