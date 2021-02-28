package programmers.타겟넘버;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void 테스트_이걸_어떻게_생각하냐고ㅠㅠ() {
    int[] numbers = {1, 1, 1, 1, 1};
    int target = 3;
    int Return = 5;

    assertEquals(Return, solution.solution(numbers, target));
  }

  @Test
  public void 다른_테스트_경우() {
    // 다른 테스트 경우를 생각해 내는것도 화가난다
    int[] numbers = {1, 1, 1, 1, 1};
    int target = 3;
    int Return = 5;

    assertEquals(Return, solution.solution(numbers, target));
  }
}
