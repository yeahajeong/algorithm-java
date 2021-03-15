package nf;

/* 문제 해결 아이디어
* 1. x와 y가 범위 안에 있으면 카운트하기 -> 실패
* 2. x와 y의 차를 이용해서 카운트하기 -> 실패
* 3. (0,0)에서의 거리를 이용해 풀이 -> 성공
*   값을 모두 1의 분면? (배운지 너무 오래돼서 기억이 안나는데 이게 맞나) 으로 옮긴다.
*   for을 돌려 x와 y값을 가져온후 원점으로 부터 거리를 구한다.
*   그 거리가 inner와 outer 사이에 있다면 포함될 수 있는 점이다.
*
* 역시 새로운 마음가짐으로 다시 푸니 바로 해결 아이디어가 떠올랐죠?..
* */

public class Solution2 {

  // 생각해보니까 제곱을 하면 굳이 Math를 써서 안바꿔줘도 될거같아 -> 통과된 풀이
  public int solution2(int inner, int outer, int[] points_x, int[] points_y) {
    long startTime = System.currentTimeMillis();
    int answer = 0;
    int x, y;

    for (int i = 0; i < points_x.length; i++) {
      x = points_x[i];
      y = points_y[i];
      if (inner < Math.sqrt((double) ((x * x) + (y * y))) && Math.sqrt((double) ((x * x) + (y * y))) < outer) {
        answer += 1;
      }
    }
    long endTime = System.currentTimeMillis();
    System.out.println("수행시간 : " + (float) (endTime - startTime) / 1000);
    return answer;
  }

  public int solution1(int inner, int outer, int[] points_x, int[] points_y) {
    int answer = 0;
    int x, y;

    for (int i = 0; i < points_y.length; i++) {
      x = Math.abs(points_x[i]);
      y = Math.abs(points_y[i]);

      if (inner < Math.sqrt((double) ((x * x) + (y * y))) && Math.sqrt((double) ((x * x) + (y * y))) < outer) {
        answer += 1;
      }
    }
    return answer;
  }

  // 다른사람이 푼 풀이
  public int solution3(int inner, int outer, int[] points_x, int[] points_y) {
    long startTime = System.currentTimeMillis();
    int cnt=0;
    for(int i=0; i<points_x.length; i++){
      for(int j=i; j<points_y.length; j++){
        if (i!=j) continue;
        if (inner <= Math.abs(points_x[i]) && inner <= Math.abs(points_y[j])
          && outer >= Math.abs(points_x[i]) && outer >= Math.abs(points_y[j])){
          cnt++;
        }
      }
    }
    long endTime = System.currentTimeMillis();
    System.out.println("수행시간 : " + (float) (endTime - startTime) / 1000);
    return cnt;
  }

}
