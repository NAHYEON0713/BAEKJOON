import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> cards = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int nNumbers = Integer.parseInt(st.nextToken());
            cards.put(nNumbers,cards.getOrDefault(nNumbers,0) + 1);
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int mNumbers = Integer.parseInt(st.nextToken());
            sb.append(cards.getOrDefault(mNumbers, 0)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

}
