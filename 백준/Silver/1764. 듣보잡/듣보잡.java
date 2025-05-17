import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        Set<String> name = new HashSet<String>();
        List<String> result = new ArrayList<String>();

        // 듣도 못한
        for (int i = 0; i < N; i++) {
            name.add(br.readLine());
        }

        // 보도 못한
        for (int i = 0; i < M; i++) {
            String name2 = br.readLine();
            if (name.contains(name2)) {
                result.add(name2);
            }
        }

        Collections.sort(result);

        System.out.println(result.size());
        
        for (int i = 0; i < result.size(); i++) {
            String name2 = result.get(i);
            System.out.println(name2);
        }
    }
}