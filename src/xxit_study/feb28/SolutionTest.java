package xxit_study.feb28;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void 테스트_기본_예제() {
    String str = "aaabbcccccca";
    String Result = "a3b2c6a1";

    assertEquals(Result, solution.solution2(str));

  }

  @Test
  public void 같은_글자만_있는_문자열_테스트() {
    String str = "aaa";
    String Result = "a3";

    assertEquals(Result, solution.solution2(str));
  }

  @Test
  public void 뒤에_글자가_연속해서_끝나는_경우() {
    String str = "zzfefsssaaa";
    String Result = "z2f1e1f1s3a3";

    assertEquals(Result, solution.solution2(str));
  }

}
