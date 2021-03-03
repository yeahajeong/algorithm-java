package baekjoon.PART1.튼튼한기본기.이진수;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void 테스트1() {
    int num = 13;
    String Return = "0 2 3";

    assertEquals(Return, solution.solution(num));
  }

}
