package etc;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();
  Sc scsol = new Sc();


  @Test
  public void 테스트1() {

    int[] A = {5,1,3,7};
    int[] B = {2,2,6,8};
    int Return = 3;

    assertEquals(Return, solution.solution(A, B));
    assertEquals(Return, scsol.solution(A, B));
  }

  @Test
  public void 테스트2() {

    int[] A = {2,2,2,2};
    int[] B = {1,1,1,1};
    int Return = 0;

    assertEquals(Return, solution.solution(A, B));
  }

  @Test
  public void 테스트3() {

    int[] A = {6,8,7,1,2};
    int[] B = {5,5,5,5,5};
    int Return = 2;

    assertEquals(Return, solution.solution(A, B));
  }

  @Test
  public void 테스트4() {

    int[] A = {11,90,18,3,6,1,15};
    int[] B = {51,23,19,2,8,11,15};
    int Return = 6;

    assertEquals(Return, solution.solution(A, B));
  }


}
