package baekjoon.약수구하기;
//https://www.acmicpc.net/problem/2501

import java.util.ArrayList;

public class Solution {
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
