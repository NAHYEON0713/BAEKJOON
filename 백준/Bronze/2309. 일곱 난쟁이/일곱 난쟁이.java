import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] height = new int[9];    // 키를 담을 배열

        for (int i = 0; i < height.length; i++) {
            height[i] = Integer.parseInt(br.readLine());
        }

        findDwarfs(height);



    }

    // 키의 합이 100이 되는 7명의 키 찾기
    public static void findDwarfs(int[] height) {
        int sum = 0;
        int dwarf1 = 0;
        int dwarf2 = 0;

        // 모든 난쟁이들의 합 구하기
        for (int i = 0; i < height.length; i++) {
            sum += height[i];
        }

        // 두 난쟁이의 키를 합에서 빼서 100이 되는 경우 구하기
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if ((sum - height[i] - height[j]) == 100) {
                    dwarf1 = height[i];
                    dwarf2 = height[j];
                }
            }
        }

        Arrays.sort(height);

        for (int i = 0; i < height.length; i++) {
            if (height[i] == dwarf1 || height[i] == dwarf2) {
                continue;
            } else {
                System.out.println(height[i]);
            }
        }
    }
}