package nf;

import org.junit.Test;
import static org.junit.Assert.*;

public class Solution2Test {

  Solution2 solution = new Solution2();

  @Test
  public void test1() {
    int inner = 1;
    int outer = 3;
    int[] points_x = {0, 1, 2, -2, 3};
    int[] points_y = {0, 1, 4, 1, 0};
    int Return = 2;

    assertEquals(Return, solution.solution2(inner, outer, points_x, points_y));
    assertEquals(Return, solution.solution3(inner, outer, points_x, points_y));
  }

  @Test
  public void test2() {
    int inner = 2;
    int outer = 4;
    int[] points_x = {4, 0, 1, -2};
    int[] points_y = {-4, 4, 3, 0};
    int Return = 1;

    assertEquals(Return, solution.solution2(inner, outer, points_x, points_y));
    assertEquals(Return, solution.solution3(inner, outer, points_x, points_y));
  }
}
