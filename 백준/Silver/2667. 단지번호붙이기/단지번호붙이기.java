// 2667번

import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static char[][] arr;

    static boolean[][] visited;
    // 상하좌우
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static List<Integer> home = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            arr[i] = s.toCharArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == '1' && !visited[i][j]) {
                    // dfs 해서 각 영역마다의 크기 저장
                    int size = dfs(i, j);
                    home.add(size);
                }
            }
        }

        Collections.sort(home);
        System.out.println(home.size()); // 단지수
        for (int i = 0; i < home.size(); i++) {
            System.out.println(home.get(i));
        }

    }

    public static int dfs(int x, int y) {
        visited[x][y] = true;
        int count = 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (arr[nx][ny] == '1' && !visited[nx][ny]) {
                    count += dfs(nx, ny);
                }
            }
        }

        return count;
    }
}
