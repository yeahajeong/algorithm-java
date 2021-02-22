package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sc {
  public int solution(int[] A, int[] B) {

    int answer = 0;

    Arrays.sort(A);
    Arrays.sort(B);

    List<Integer> bList = new ArrayList<>();
    for (int i : B) {
      bList.add(i);
    }

    for(int i=0; i<A.length; i++){
      for(int j=0; j<bList.size(); j++){
        if (A[i] < B[j]){
          answer++;
          bList.remove(j);
          break;
        }
      }
    }

    return answer;

  }
}
