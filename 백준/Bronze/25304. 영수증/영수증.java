import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int X;
    static int N;
    static int price;
    static int[][] goods;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        X = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());

        goods = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            goods[i][0] = Integer.parseInt(st.nextToken());
            goods[i][1] = Integer.parseInt(st.nextToken());
        }

        price = 0;
        sum(X, N, price, goods);

    }

    static void sum(int X, int N, int price, int[][] goods) {
        for(int i = 0; i < N; i++) {
                price += goods[i][0] * goods[i][1];
        }

        if (price == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
