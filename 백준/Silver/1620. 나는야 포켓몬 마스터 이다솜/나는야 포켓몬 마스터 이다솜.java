import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        Map<String, Integer> pkmName = new HashMap<>();
        Map<Integer, String> pkmNum = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            pkmName.put(name, i);
            pkmNum.put(i, name);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String query = br.readLine();

            if (isNumber(query)) {
                int num = Integer.parseInt(query);
                sb.append(pkmNum.get(num)).append("\n");
            } else {
                sb.append(pkmName.get(query)).append("\n");
            }
        }

        System.out.print(sb);
    }

    // 숫자 or 문자 확인
    private static boolean isNumber(String s) {
        // 맨 앞 문자로 판별
        return s.charAt(0) >= '0' && s.charAt(0) <= '9';
    }
}