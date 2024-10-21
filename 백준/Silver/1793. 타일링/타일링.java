// 1793번

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger[] tile = new BigInteger[251];

        tile[0] = BigInteger.ONE;
        tile[1] = BigInteger.ONE;
        tile[2] = BigInteger.valueOf(3);
        tile[3] = BigInteger.valueOf(5);

        for (int i = 4; i <= 250; i++) {
            tile[i] = tile[i - 1].add(tile[i - 2].multiply(BigInteger.valueOf(2)));
        }

        List<Integer> inputs = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int n = Integer.parseInt(line);
            inputs.add(n);
        }

        for (int n : inputs) {
            System.out.println(tile[n]);
        }
    }
}
