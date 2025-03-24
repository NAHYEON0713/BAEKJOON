import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int hour;
    static int min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        hour = Integer.parseInt(st.nextToken());
        min = Integer.parseInt(st.nextToken());

        int[] newTime = alarm(hour, min);
        hour = newTime[0];
        min = newTime[1];

        System.out.println(hour + " " + min);
    }

    static int[] alarm(int hour, int min) {
        if (min >= 45) {
            min -= 45;
        } else {
            min += 15;
            if (hour == 0) {
                hour = 23;
            } else {
                hour -= 1;
            }
        }

        return new int[] { hour, min };
    }
}
