import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dice;
    static int cash;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        dice = new int[3];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = Integer.parseInt(st.nextToken());
        }

        cash = rule(dice);
        System.out.println(cash);
    }

    static int rule(int[] dice) {
        cash = 0;

        if (dice[0] == dice[1] && dice[1] == dice[2]) {
            cash = 10000 + (dice[0] * 1000);
        } else if (dice[0] == dice[1] || dice[1] == dice[2] || dice[0] == dice[2]) {
            if (dice[0] == dice[1] || dice[0] == dice[2]) {
                cash = 1000 + (dice[0] * 100);
            } else {
                cash = 1000 + (dice[1] * 100);
            }
        } else {
            int max = Math.max(dice[0], Math.max(dice[1], dice[2]));
            cash = max * 100;
        }
        return cash;
    }
}