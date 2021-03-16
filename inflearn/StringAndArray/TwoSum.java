package StringAndArray;

/*
* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
* You may assume that each input would have exactly one solution, and you may not use the same element twice.
*
* Example:
* Given nums = [2, 7, 11, 15], target = 9,
* Because nums[0] + nums[1] = 2 + 7 = 9,
* return [0, 1].
*
* -> Use Map, Array
*
* 문제 해결 flow
* 1. Array Index 0부터 끝가지 for 문을 돌려서 target과 비교
*    0  1   2   3
*  { 2  8  11  14 }
*
* 2. 16 - 2 = 11
* 3. Map(숫자, 방번호)
*
*   int target = 16
*     key        value
*   14(16-2)    방번호 0
*   8 (16-8)    방번호 1
*   5 (16-11)   방번호 2
*
* 4. 방번호만 리턴한다.*/

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public static void main(String[] args) {
    TwoSum twoSum = new TwoSum();

    int[] nums = {1, 8, 11, 14};
    int target = 16;
    int[] result = twoSum.solve(nums, target);
    for (int i : result) {
      System.out.println(i + " ");
    }
  }

  public int[] solve(int[] nums, int target) {
    //1. data structure : 담을 그릇
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<>();

    //2. for문
    for (int i = 0; i < nums.length; i++) {
      //containsKey() : 맵에 키값이 있는지 확인
      if (map.containsKey(nums[i])) {
        result[0] = map.get(nums[i]) + 1;
        result[1] = i+1;

      // map에 들어있지 않다면
      } else {
        map.put(target - nums[i], i);
      }
    }
    return result;
  }
}
