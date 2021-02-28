package programmers.타겟넘버;
// https://programmers.co.kr/learn/courses/30/lessons/43165?language=java
// 깊이/너비 우선 탐색 (DFS/BFS)

import java.util.ArrayList;

public class Solution {

  public int solution(int[] numbers, int target) {
    int answer = 0;

    // 트리의 root를 0으로 설정
    ArrayList<Integer> answerTree = new ArrayList<>();
    answerTree.add(0);

    // numbers의 숫자를 꺼내서 왼쪽 오른쪽 (-1, +1)을 더해 새로운 리스트를 만든다.
    for (int num : numbers) {
      // 다음 레벨의 노드를 담을 리스트
      // 반복문마다 초기화 시켜주어야함
      ArrayList<Integer> nodeList = new ArrayList<>();
      for (int n : answerTree) {
        nodeList.add(n + num);
        nodeList.add(n - num);
      }
      answerTree.clear();
      answerTree.addAll(nodeList);
    }

    for (int a : answerTree) {
      if (a == target) {
        answer++;
      }
    }

    return answer;
  }

}
