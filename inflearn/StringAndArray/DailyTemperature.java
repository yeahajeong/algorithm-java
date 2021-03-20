package StringAndArray;

/*
* Given a list of daily temperatures T, return a list such that, for each day in the input,
* tells you how many days you would have to wait until a warmer temperature.
* If there is no future day for which this is possible, put 0 instead.

  For example, given the list of temperatures
  T = [73, 74, 75, 71, 69, 72, 76, 73],
  your output should be [1, 1, 4, 2, 1, 1, 0, 0].

  Note: The length of temperatures will be in the range [1, 30000].
  Each temperature will be an integer in the range [30, 100].
*
* 문제해결 아이디어
* 저장해두고 비교를 해야한다 -> stack 사용
* */

import java.util.Stack;

public class DailyTemperature {
  public static void main(String[] args) {
    int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
    int[] result = solve(nums);

    System.out.println("=== result ===");
    for (int i : result) {
      System.out.print(i + " ");
    }

  }

  public static int[] solve(int[] temper) {
    //1. 담아야할 그릇
    Stack<Integer> stack = new Stack<>();
    int[] result = new int[temper.length]; //결과값을 담을 배열

    //2. 값을 빼내자 -> for & while
    for (int i = 0; i < temper.length; i++) {

      //스택에 값이 들어있으면 값을 비교해야한다.
      //스택의 값이랑 현재 온도랑 비교를해서 현재온도가 높으면
      while (!stack.empty() && temper[stack.peek()] < temper[i]) {
        //1-0
        int index = stack.pop();
        result[index] = i - index;
      }
      stack.push(i);
    }
    return result;
  }
}
