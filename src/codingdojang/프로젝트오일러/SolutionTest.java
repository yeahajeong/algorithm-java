package codingdojang.프로젝트오일러;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void 프로젝트_오일러_테스트1() {
    Solution solution = new Solution();

    int N = 10;
    int num1 = 3;
    int num2 = 5;
    int Return = 23;

    assertEquals(Return, solution.solution1(N, num1, num2));
    assertEquals(Return, solution.solution2(N, num1, num2));
  }

  @Test
  public void 프로젝트_오일러_테스트2() {
    Solution solution = new Solution();

    int N = 1000;
    int num1 = 3;
    int num2 = 5;
    int Return = 23;

    assertEquals(Return, solution.solution1(N, num1, num2));
  }

}
