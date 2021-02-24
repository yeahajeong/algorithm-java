package xxit_study.feb26;

import org.junit.Test;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void 테스트() {
    solution.solution("이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌");
  }

  @Test
  public void 테스트2() {
    solution.solution("이영,구데기,박병이,구데기,하리수,고리김,소상식,이영,이기자,민병국,차길섭,김기자,고리김,노태우,하리수,이영,최창충,김민호,고리김,구데기,이재영");
  }
}
