package level3_베스트앨범_해시_다시풀것;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

  @Test
  public void 테스트_1() {
    Solution solution = new Solution();

    String[] genres = {"classic", "pop", "classic", "classic", "pop"};
    int[] plays = {500, 600, 150, 800, 2500};
    int[] Return = {4, 1, 3, 0};

    assertArrayEquals(Return, solution.solution(genres, plays));
  }
}
