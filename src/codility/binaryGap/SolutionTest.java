package codility.binaryGap;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void 바이너리갭_테스트() {
    Solution solution = new Solution();

    int N = 9;
    int Retrun = 2;

    assertEquals(Retrun, solution.solution(N));
  }
}
