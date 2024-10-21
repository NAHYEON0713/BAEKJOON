// 16173번

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];    // 게임판
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        if (search(0,0)) {
            System.out.println("HaruHaru");
        } else {
            System.out.println("Hing");
        }
    }

    public static boolean search(int x, int y) {
        if (map[x][y] == -1) {
            return true;
        }

        visited[x][y] = true;
        int jump = map[x][y];

        // 오른쪽 이동
        if (y + jump < n && !visited[x][y + jump]) {
            if (search(x, y + jump)) {
                return true;
            }
        }

        // 아래로 이동
        if (x + jump < n && !visited[x + jump][y]) {
            if (search(x + jump, y)) {
                return true;
            }
        }

        return false;
    }
}
