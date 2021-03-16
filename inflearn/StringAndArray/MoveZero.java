package StringAndArray;

/*
* Given an array nums, write a function to move all 0's to the end of it
* while maintaining the relative order of the non-zero elements.
*
* Input: [0,1,0,3,12]
* Output: [1,3,12,0,0]
*
* You must do this in-place without making a copy of the array.
* Minimize the total number of operations.
*
* 배열 num을 감안할 때 0이 아닌 요소의 상대적인 순서를 유지하면서
* 모든 0을 끝으로 이동시키는 함수를 작성하시오
* input: [0,3,2,0,8,5]
* output: [3,2,8,5,0,0]
*
* 1. 값이 0 이 아닌 값을 먼저 array에 담는다.
* 2. index를 기억한다.
* 3. 해당 index 0인 값을 넣는다.
*
* 핵심 : Array의 개념을 알고 Array의 인덱스를 조절할 수 있으면 된다.
*
* */


public class MoveZero {

  public static void main(String[] args) {
    // 1
//    int[] nums = {0, 3, 2, 0, 8, 5};
    int[] nums = {9, 0, 2, 0, 8, 5};
    int index = 0;

    // 2
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[index] = nums[i];
        index++;
      }
    }

    // 3
    while (index < nums.length) {
      nums[index] = 0;
      index++;
    }

    // 4
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
  }

  public void moveZeroes(int[] nums) {


  }

}
