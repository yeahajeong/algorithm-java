import java.util.LinkedList;
import java.util.Queue;

public class Basic_BFS {

  public static void main(String[] args) {

    //뭉쳐있는 물웅덩이가 몇개인지 찾아라
    char[][] grid = {
      {'1','1','0','0','1'},
      {'1','1','0','0','0'},
      {'0','0','0','0','0'},
      {'0','0','0','1','1'}
    };

    Basic_BFS solution = new Basic_BFS();
    System.out.println(solution.bfs(grid));
  }

  //2. 방향설정 & 이차원 배열 사이즈 설정
  // 가로, 세로를 기본적으로 셋팅해주기위해 변수 선언
  int m, n = 0;

  //방향 배열 (상하우좌)
  int[][] direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

  public int bfs(char[][] grid) {
    //물웅덩이가 null이거나 비어있으면 return 0
    if (grid == null || grid.length == 0) return 0;

    //정답 변수
    int count = 0;

    m = grid.length;    //row 4
    n = grid[0].length; //col 5

    //1. 맞는 조건을 찾아내는 부분
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        //물웅덩이일경우
        if (grid[i][j] == '1') {
          count++; //카운트 증가
          bfs(grid, i, j); //해당 위치에서 사방을 0으로 만들어 주기 위함
        }
      }
    }
    return count;
  }

  //BFS는 Queue를 활용
  //3. 큐에서 빼내는 부분
  //4. 조건 체크 부분
  public void bfs(char[][] grid, int x, int y) {
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[] {x,y}); //해당 x좌표 y좌표를 queue에 넣는다.

    while (!queue.isEmpty()) {
      int[] point = queue.poll(); //뽑아서 뽑은 위치의 사방을 확인
      for (int[] dir : direction) {
        int newX = point[0] + dir[0];
        int newY = point[1] + dir[1];

        //사방의 좌표 조건 체크!
        //1. 마이너스인지 확인, 2. M*N 범위 안인지 확인, 3. grid[x][y]값 체크(문제제시값)
        if (newX >= 0 && newY >= 0 && newX < m &&  newY < n && grid[newX][newY] == '1') {
          grid[newX][newY] = 0;
          queue.offer(new int[]{newX, newY});
        }
      }
    }
  }
}
