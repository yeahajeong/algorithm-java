package xxit_study.feb22;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void N이_10_테스트() {
    int N = 10;
    int num1 = 3;
    int num2 = 5;
    int Return = 23;

    assertEquals(Return, solution.solution1(N, num1, num2));
    assertEquals(Return, solution.solution2(N, num1, num2));
  }

  @Test
  public void N이_1000_테스트() {

    int N = 1000;
    int num1 = 3;
    int num2 = 5;
    int Return = 233168;

    assertEquals(Return, solution.solution1(N, num1, num2));
    assertEquals(Return, solution.solution2(N, num1, num2));
  }

  @Test
  public void 다른값_테스트() {

    int N = 50;
    int num1 = 4;
    int num2 = 8;
    int Return = 312;

    assertEquals(Return, solution.solution1(N, num1, num2));
    assertEquals(Return, solution.solution2(N, num1, num2));
  }

}
