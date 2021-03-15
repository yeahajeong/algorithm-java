package 기지국설치;
import java.util.*;

/*
* 프로그래머스 강의
* 여기서는 뭔가 더 코드가 간결하네
* 그리고 나랑 다르게 아파트 전체를 루프로 돌았다
* 근데 나는 내가 푼 방식으로 해결하고싶은데
* 정확성 케이스를 알 수가 없네..*/

public class Explanation {
  public int soultuon1(int n, int[] stations, int w) {
    int answer = 0; //기지국 개수를 담을 변수

    // 기존에 설치되어있던 기지국들을 하나씩 꺼내서 
    // 그 전파의 범위를 계산하기 위해 큐를 사용
    Queue<Integer> sq = new LinkedList<>();
    for(int s : stations) sq.offer(s);

    int position = 1; //현재 위치

    while (position <= n) {
      // 현재 포지션이 기존 설치되어있는 기지국의 전파 범위 안에 있는가?
      if (!sq.isEmpty() && sq.peek() - w <= position) {
        position = sq.poll() + w + 1;
      } else {
        answer += 1;
        position += w * 2 + 1;
      }

      answer += 1; //기지국을 하나 설치
      position += w * 2 + 1;

    }
    return answer;

    /*
    * 테스트 코드는 통과했지만 효율성에서 실패했다.
    * 효율성에서 제일 많이 잡아먹는것은 loop
    * Object를 사용하는것을 의심해야함
    * queue를 사용하지 않고 사용 해보자*/
  }

  public int soultuon2(int n, int[] stations, int w) {
    int answer = 0; //기지국 개수를 담을 변수
    int si = 0; // station의 index를 사용
    int position = 1; //현재 위치

    while (position <= n) {
      // 현재 포지션이 기존 설치되어있는 기지국의 전파 범위 안에 있는가?
      if (si < stations.length && stations[si] - w <= position) {
        position = stations[si] + w + 1;
        si += 1;
      } else {
        answer += 1; //기지국을 하나 설치
        position += w * 2 + 1;
      }
    }
    return answer;
  }

  /*
  * 자바에서는 Object를 사용하는것이 나쁜 것은 아니지만
  * Primitive를 사용하는것이 더 이득
  *
  * Tip. 효율성 높이기
  * 1. Loop 개선
  * 2. 적절한 데이터 구조 사용
  * 3. 불필요한 오브젝트 제거*/

}
