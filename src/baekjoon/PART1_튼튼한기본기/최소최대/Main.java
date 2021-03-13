package baekjoon.PART1_튼튼한기본기.최소최대;
// https://www.acmicpc.net/problem/10818

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
* 백준에는 입력값을 한줄로, 공백으로 구분해서 받는 경우가 많다
* -> 이경우에는 BufferedReader와 StringTokenizer를 사용하자!
* 참고 - https://devzzi.tistory.com/7
*
* 문제 해결 아이디어
* 1. 배열로 입력받아 배열을 정렬해서 처음과 마지막을 반환
* 2. Math 함수를 사용해 최소, 최대 구하기 -> 이건 값이 2개일때만 유용
* 3. 바로 바로 비교하기
* */

public class Main {

  public static void solution1() throws IOException {
    /* Scanner vs BufferedReader 비교
    - Scanner 사용
    선언 방식이 쉽고 간단, 다양한 자료형을 입력값으로 저장 가능
    next() : 공백 이전까지의 문자를 입력받음
    nextLine() : 개행 전까지의 문자열 전체를 입력받음 -> 한줄씩 입력받음
    버퍼의 길이가 1024로 한정적, 한번에 많은 입력값을 저장하는데 비효율적

    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt(); //몇개의 정수를 받을 건지
    //배열
    int[] array = new int[N];
    for (int i = 0; i < N; i++) {
      array[i] = scan.nextInt();
    }
    scan.close();

    - BufferedReader 사용
    버퍼의 길이가 scanner보다 크고 많은 데이터를 한 번에 받아오고자 할 때 효율적
    String 타입만 받고 다른 자료형을 사용하고싶다면 추가변환 or 파싱 필요
    개행 기준으로 입력받기 때문에 공백기준으로 받는 경우 별도 파싱필요
    IOException 처리해줘야함
    */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    // 공백도 같이 입력되니까 분리를 해준다.
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int[] array = new int[N];
    int i = 0;
    while (st.hasMoreTokens()) {
      array[i] = Integer.parseInt(st.nextToken()); //다음 토큰을 반환
      i++;
    }

    Arrays.sort(array); //최대 O(n^2)
    System.out.println(array[0] + " " + array[N-1]);
  }

  // 바로바로 비교하는 풀이
  public static void solution2() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int min = 1000000;
    int max = -1000000;

    // O(n)
    while (st.hasMoreTokens()) {
      int temp = Integer.parseInt(st.nextToken());
      if (min > temp) min = temp;
      if (max < temp) max = temp;
    }

    System.out.println(min + " " + max);
  }

  public static void main(String[] args) throws IOException {
    solution2();
  }

}
