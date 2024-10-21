import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 정수 N과 N개의 정수값 입력 받기
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        // 정수 M과 M개의 정수값 입력 받기
        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];

        StringTokenizer st_ = new StringTokenizer(br.readLine());
        for (int i =0; i < m; i++) {
            arr2[i] = Integer.parseInt(st_.nextToken());
        }

        int[] result = new int[m];

        for (int i = 0 ; i < result.length; i++) {
            result[i] = binarySearch(arr, arr2[i]) ? 1 : 0;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static boolean binarySearch(int[] arr, int num) {
            int first = 0;
            int last = arr.length - 1;

            while (first <= last) {
                int mid = (first + last) / 2;

                if (arr[mid] == num) {
                    return true;
                } else if (arr[mid] > num) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            }
        return false;
    }
}