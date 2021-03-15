package PART1_튼튼한기본기.최대공약수와최소공배수;

import java.util.Scanner;

/* 문제 해결 아이디어
* 1. 최대공약수는 유클리드 호제법으로 구할 수 있다.
* 2. 최소공배수는 원래 두수의 곱을 최대 공약수로 나누면 구할 수 있다.*/

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();

    String[] strArr = input.split(" ");
    int num1 = Integer.parseInt(strArr[0]);
    int num2 = Integer.parseInt(strArr[1]);

    System.out.println(eucildean(num1, num2));
    System.out.println(num1*num2/eucildean(num1, num2));

  }

  //최대공약수를 구하는 유클리드 호제법
  public static int eucildean(int n1, int n2) {
    if (n2 == 0) {
      return n1;
    } else {
      return eucildean(n2, n1 % n2);
    }
  }
}
