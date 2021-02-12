package programmers.level3_베스트앨범_다시풀것;

// https://programmers.co.kr/learn/courses/30/lessons/42579?language=java#

import java.util.*;

// 총 재생시간 합한 해시맵 {'classic':1450, 'pop':3100}
// 장르별로 재생시간을 내림차순 정렬한 것이 필요
// 중복되는 문자열을 걸러야한다 -> 해시

/*
* 장르별로 총 재생 횟수 - {'classic':1450, 'pop':3100}
* 장르별 고유번호와 재생횟수 - {'classic':[[800, 3], [500,0], [150, 2]], 'pop':[[2500, 4], [600, 1]]}
* -> 이렇게 어떻게 집어넣지,,, 방법을 몰라서 포기;
*
*
*
* */



public class Solution {
  public int[] solution(String[] genres, int[] plays) {

    // 장르와 곡 정보 담은 해시맵 <장르, 곡정보>
    HashMap<String, Object> genreAndInfo = new HashMap<>();

    // 장르와 총 장르 재생 수를 담은 해시맵 <장르, 총 장르 재생수>
    HashMap<String, Integer> numOfPlayByGenre = new HashMap<>();

    for (int i = 0; i < genres.length; i++) {
      String key = genres[i];
      HashMap<Integer, Integer> infoOfPlay;   //곡 정보 : <곡 고유번호, 재생횟수>

      if (genreAndInfo.containsKey(key)) {
        infoOfPlay = (HashMap<Integer, Integer>) genreAndInfo.get(key);
      } else {
        infoOfPlay = new HashMap<Integer, Integer>();
      }

      infoOfPlay.put(i, plays[i]);
      genreAndInfo.put(key, infoOfPlay);

      // 재생수
      numOfPlayByGenre.put(key, numOfPlayByGenre.getOrDefault(key, 0) + plays[i]);


    }


    int[] answer = {};
    return answer;
  }
}
