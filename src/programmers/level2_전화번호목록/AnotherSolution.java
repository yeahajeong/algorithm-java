package programmers.level2_전화번호목록;

// 여러가지 함수가 있구나 새로운 것을 알게됨
// 내가 푼 코드보다 훨씬 빠른 속도로 해결됨
/*
* startsWith(), endsWith() - 특정 문자로 시작하거나 끝나는지 체크
* - boolean startsWith(String prefix) : 대상 문자열이 특정 문자 또는 문자열로 시작하는지 체크
* - boolean endsWith(String suffix) : 대상 문자열이 특정 문자 또는 문자열로 끝나는지 체크
* - 공백도 취급하기 때문에 확인을 하고 사용할 것
* */

// contains를 사용하면 접두사만 체크하지 않기 때문에 사용하지 않는다.
// indexOf도 있음

public class AnotherSolution {

  public boolean solution(String[] phoneBook) {
    for(int i=0; i<phoneBook.length-1; i++) {
      for(int j=i+1; j<phoneBook.length; j++) {
        if(phoneBook[i].startsWith(phoneBook[j])) {return false;}
        if(phoneBook[j].startsWith(phoneBook[i])) {return false;}
      }
    }
    return true;
  }
}
