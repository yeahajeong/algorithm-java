package PART1_튼튼한기본기.일곱난쟁이;
// https://www.acmicpc.net/problem/2309

/* 문제 해결 아이디어
* 7명의 키 합이 정확히 100이 되려면 9개중에서.. 일곱개를 골라.. 100이 되는 경우를 전부 확인한다?
* 7개를 고르는것보다.. 2개를 고르는게 시간이 더 적게 걸릴것 같다.
* 두개를 고른다 -> 조합 combination
* */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //int[] dwarfs = {20, 7,23,19,10,15,25,8,13};

    //데이터가 int형이고 9개의 데이터로 정해져있어서 Scanner 사용
    Scanner scanner = new Scanner(System.in);

    //난쟁이들의 키를 담을 int 배열
    int[] dwarfs = new int[9];

    //난쟁이들의 전체 키합계
    int sum = 0;

    for (int i = 0; i < 9; i++) {
      //난쟁이의 키가 유효한 범위인지 확인
      while (true) {
        int dwarf = scanner.nextInt();
        //중복되면 안된다는 구현하지 못함ㅠㅠ
        if (dwarf <= 100 && dwarf > 0 ) {
          dwarfs[i] = dwarf;
          sum += dwarf;
          break;
        }
      }

      //초과하는 숫자
      int over = sum - 100;

      //두 개의 난쟁이를 찾아서 over 값이 되는지 비교



    }







  }
}
