import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int min;
    static int hour;
    static int cookMin;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        hour = Integer.parseInt(st.nextToken());
        min = Integer.parseInt(st.nextToken());
        cookMin = Integer.parseInt(br.readLine());

        int[] ovenTime = ovenCook(hour, min, cookMin);
        hour = ovenTime[0];
        min = ovenTime[1];

        System.out.println(hour + " " + min);
    }

    static int[] ovenCook(int hour, int min, int cookMin) {
        min += cookMin;

        if (min >= 60) {
            hour += min / 60;
            min = min % 60;
        }

        if (hour >= 24) {
            hour = hour % 24;
        }

        return new int[] { hour, min };
    }
}
