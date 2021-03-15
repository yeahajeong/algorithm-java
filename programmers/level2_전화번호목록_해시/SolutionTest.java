package level2_전화번호목록_해시;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void 테스트_1() {
    Solution solution = new Solution();

    String[] phone_book = {"119", "97674223", "1195524421"};

    assertFalse(solution.solution(phone_book));
  }

  @Test
  public void 테스트_2() {
    Solution solution = new Solution();

    String[] phone_book = {"123", "456", "789"};

    assertTrue(solution.solution(phone_book));
  }

  @Test
  public void 테스트_3() {
    Solution solution = new Solution();

    String[] phone_book = {"12", "123", "1235", "567", "88"};

    assertFalse(solution.solution(phone_book));
  }

  @Test
  public void 테스트_4() {
    Solution solution = new Solution();

    String[] phone_book = {"2223", "1235", "567", "88"};

    assertTrue(solution.solution(phone_book));
  }
}
