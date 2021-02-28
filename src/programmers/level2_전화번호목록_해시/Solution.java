package programmers.level2_전화번호목록_해시;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/425
// 제일 짧은 글자를 찾는다 -> 그게 접두어
// 글자 수가 짧은 순으로 오름차순 정렬 후 다 비교하는 방식을 사용

public class Solution {

  public boolean solution(String[] phone_book) {

    Arrays.sort(phone_book, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length()); //문자열 길이순 정렬
      }
    });
    //람다식으로도 사용가능
    /*Arrays.sort(phone_book, ((o1, o2) -> Integer.compare(o1.length(), o2.length())));*/

    int len = phone_book[0].length();
    for (int i = 1; i < phone_book.length; i++) {
      if (phone_book[0].equals(phone_book[i].substring(0, len))) {
        return false;
      }
    }
    return true;
  }

}
