package PART1_튼튼한기본기.지능형기차;
//https://www.acmicpc.net/problem/2460

/* 문제 해결 아이디어
* 10개 따로 받아서 각각 계산한 후에 최대를 비교해주는 if문을 넣어서 구하는 방식을 생각함
* ide에서 개인적으로 굴릴땐 돌아가는데 백준에서는 런타임에러가뜬다.
* nullPointerException 문제라는데 왜 뭐가 문젠지 모르겠음...*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {

    int numOfPassengers = 0; //현재 승객 수 - 처음에는 0명이니까 0으로 초기화
    int maxPassengers = 0;

    for (int i = 0; i < 10; i++) {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");

      //현재 지하철에 남아있는 승객 수 계산하기
      numOfPassengers = numOfPassengers - Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

      //이전에 저장한 최대보다 현재 승객이 더 많다면 최대값 수정
      if (maxPassengers < numOfPassengers) {
        maxPassengers = numOfPassengers;
      }
    }

    System.out.println(maxPassengers);
  }

}
