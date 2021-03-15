package PART1_튼튼한기본기.이진수;

// 백준 문제풀이 방식에 익숙하지 않아서 코드를 제출해도 에러가 발생한다.
// 클래스 이름은 Main으로 해주어야하고 Scanner를 사용해서 값을 받아줘야한다.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();

    for (int i = 0; i < t; i++) {
      int n = scan.nextInt();

      Queue<Integer> q = new LinkedList<>();
      int answer = 0;
      int mok = n;
      int nmg;

      //10진수를 2진수로 바꿔서
      //1의 위치를 저장하는 로직
      while (mok != 0) {
        nmg = mok % 2;
        //1이라면 q에 index 위치를 추가
        if (nmg == 1) {
          q.add(answer);
        }
        mok = mok / 2;
        answer++;
      }

      String str = "";

      while (true) {
        str += Integer.toString(q.remove());
        if (!q.isEmpty()) {
          str += " ";
        } else {
          System.out.println(str);
          break;
        }
      }
    }
  }
}
