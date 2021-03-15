package level2_가장큰수;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void 가장_큰_수_테스트1() {

    Solution solution = new Solution();

    int[] numbers = {6, 10, 2};
    String Return = "6210";

    assertEquals(Return, solution.solution(numbers));
  }

  @Test
  public void 가장_큰_수_테스트2() {

    Solution solution = new Solution();

    int[] numbers = {3, 30, 34, 5, 9};
    String Return = "9534330";

    assertEquals(Return, solution.solution(numbers));
  }

  @Test
  public void 가장_큰_수_테스트3() {

    Solution solution = new Solution();

    int[] numbers = {0, 0, 0, 0};
    String Return = "0";

    assertEquals(Return, solution.solution(numbers));
  }

  @Test
  public void 가장_큰_수_테스트4() {

    Solution solution = new Solution();

    int[] numbers = {1000, 100, 10, 101};
    String Return = "101101001000";

    assertEquals(Return, solution.solution(numbers));
  }
}
