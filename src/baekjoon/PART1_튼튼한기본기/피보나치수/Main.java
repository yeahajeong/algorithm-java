package baekjoon.PART1_튼튼한기본기.피보나치수;
//https://www.acmicpc.net/problem/10870

import java.util.Scanner;

/* 문제해결 아이디어
 * 피보나치는 DP(동적 프로그래밍)의 대표적인 문제*/

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    //n의 범위가 주어졌으니까 해당사항을 만족해야 탈출할 수 있는 반복문
    while (true) {
      n = sc.nextInt();
      if (n >= 0 && n <= 20) {
        break;
      }
    }
    System.out.println(fibo(n));
  }

  public static int fibo(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return fibo(n-1)  + fibo(n-2);
    }
  }

}
