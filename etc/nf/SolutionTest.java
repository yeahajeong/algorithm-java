package nf;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void 테스트1() {
    Solution solution = new Solution();
    int[] A = {1, 2, 5, 9, 9};
    int X = 9;
    int Return = 3;
    assertEquals(Return, solution.solution(A, X));
  }
}
