package PART1_튼튼한기본기.약수구하기;
//https://www.acmicpc.net/problem/2501

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();

    String[] strArr = input.split(" ");
    int N = Integer.parseInt(strArr[0]);
    int K = Integer.parseInt(strArr[1]);

    ArrayList<Integer> divisor = new ArrayList();

    for (int i = 1; i < N+1; i++) {
      if (N % i == 0) {
        divisor.add(i);
      }
    }

    System.out.println(divisor.size() < K ? 0 : divisor.get(K-1));
  }

  public int solution(int n, int k) {

    ArrayList<Integer> divisor = new ArrayList();

    for (int i = 1; i < n+1; i++) {
      if (n % i == 0) {
        divisor.add(i);
      }
    }

    return divisor.size() < k ? 0 : divisor.get(k-1);
  }
}
