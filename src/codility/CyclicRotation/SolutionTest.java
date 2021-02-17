package codility.CyclicRotation;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void 순환회전_테스트1() {
    Solution solution = new Solution();

    int[] A = {3, 8, 9, 7, 6};
    int K = 3;
    int[] Return = {9, 7, 6, 3, 8};

    assertArrayEquals(Return, solution.solution(A, K));
  }

  @Test
  public void 순환회전_테스트2() {
    Solution solution = new Solution();

    int[] A = {0, 0, 0};
    int K = 1;
    int[] Return = {0, 0, 0};

    assertArrayEquals(Return, solution.solution(A, K));
  }

  @Test
  public void 순환회전_테스트3() {
    Solution solution = new Solution();

    int[] A = {1, 2, 3, 4};
    int K = 4;
    int[] Return = {1, 2, 3, 4};

    assertArrayEquals(Return, solution.solution(A, K));
  }

  @Test
  public void 순환회전_테스트4() {
    Solution solution = new Solution();

    int[] A = {2,3,2};
    int K = 4;
    int[] Return = {2,2,3};

    assertArrayEquals(Return, solution.solution(A, K));
  }

  @Test
  public void 순환회전_테스트5() {
    Solution solution = new Solution();

    int[] A = {};
    int K = 1;
    int[] Return = {};

    assertArrayEquals(Return, solution.solution(A, K));
  }

  @Test
  public void 순환회전_테스트6() {
    Solution solution = new Solution();

    int[] A = {5, -1000};
    int K = 1;
    int[] Return = {-1000, 5};

    assertArrayEquals(Return, solution.solution(A, K));
  }
}
