package 완주하지못한선수;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void 테스트_1() {
    Solution solution = new Solution();

    String[] participant = {"leo", "kiki", "eden"};
    String[] completion = {"eden", "kiki"};
    String Return = "leo";

    assertEquals(Return, solution.solution(participant, completion));
  }

  @Test
  public void 테스트_2() {
    Solution solution = new Solution();

    String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] completion = {"josipa", "filipa", "marina", "nikola"};
    String Return = "vinko";

    assertEquals(Return, solution.solution(participant, completion));
  }

  @Test
  public void 테스트_3() {
    Solution solution = new Solution();

    String[] participant = {"mislav", "stanko", "mislav", "ana"};
    String[] completion = {"stanko", "ana", "mislav"};
    String Return = "mislav";

    assertEquals(Return, solution.solution(participant, completion));
  }
}
