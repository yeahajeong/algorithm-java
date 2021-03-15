package level1_K번째수;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void 테스트_1() {
    Solution solution = new Solution();

    int[] array = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = {
      {2, 5, 3},
      {4, 4, 1},
      {1, 7, 3}
    };
    int[] Return = {5, 6, 3};

    assertArrayEquals(Return, solution.solution(array, commands));

  }

}
