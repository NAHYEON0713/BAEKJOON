import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        HashMap<String, String> log = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String action = st.nextToken();

            if (action.equals("enter")) {
                log.put(name, "enter");
            } else {
                log.remove(name);
            }
        }

        List<String> result = new ArrayList<>(log.keySet());
        result.sort(Collections.reverseOrder());

        for (int i = 0; i < result.size(); i++) {
            String name = result.get(i);
            System.out.println(name);
        }

    }
}
