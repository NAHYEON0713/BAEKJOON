import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int hour;
    static int min;
    static int alramHour;
    static int alramMin;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        hour = Integer.parseInt(st.nextToken());
        min = Integer.parseInt(st.nextToken());

        alram(hour, min);

        System.out.println(alramHour + " " + alramMin);
    }

    static void alram(int hour, int min) {
        if (min >= 45) {
            alramMin = min - 45;
            alramHour = hour;
        } else {
            alramMin = min + 15;
            alramHour = hour -1;
            if (hour == 0) {
                alramHour = 23;
            }
        }
    }
}
