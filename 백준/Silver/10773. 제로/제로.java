import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int k, num;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());

        arr = new int[k];
        int top = -1;

        for (int i = 0; i < k; i++) {
            num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (top >= 0) top--;
            } else {
                arr[++top] = num;
            }
        }

        int sum = 0;
        for (int i = 0; i <= top; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
