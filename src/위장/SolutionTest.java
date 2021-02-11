package 위장;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

  @Test
  public void 테스트_1() {

    Solution solution = new Solution();

    String[][] clothes = {
      {"yellow_hat", "headgear"},
      {"blue_sunglasses", "eyewear"},
      {"green_turban", "headgear"}
    };
    int Return = 5;

    assertEquals(Return, solution.solution(clothes));
  }

  @Test
  public void 테스트_2() {

    Solution solution = new Solution();

    String[][] clothes = {
      {"crow_mask", "face"},
      {"blue_sunglasses", "face"},
      {"smoky_makeup", "face"}
    };
    int Return = 3;

    assertEquals(Return, solution.solution(clothes));
  }

}
