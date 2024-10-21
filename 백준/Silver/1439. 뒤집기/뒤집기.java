// 1439번

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();
        int count1 = 0;
        int count0 = 0;

        if (num.charAt(0) == '0') {
            count0++;
        } else {
            count1++;
        }

        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) != num.charAt(i - 1)) {
                if (num.charAt(i) == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }
        }

        System.out.println(count0 > count1 ? count1 : count0);

    }
}
