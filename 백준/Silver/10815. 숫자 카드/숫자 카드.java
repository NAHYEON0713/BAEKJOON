import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cards = sc.nextInt();

        int[] arr = new int[cards];

        for (int i = 0; i < cards; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int search = sc.nextInt();

        int[] arr2 = new int[search];

        for (int i = 0; i < search; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] result = new int[search];

        for (int i = 0; i < search; i++) {
            result[i] = binarySearch(arr, arr2[i]) ? 1 : 0;
        }

        for (int i = 0; i < search; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static boolean binarySearch(int[] arr, int value) {
        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;

            if (arr[mid] == value) {
                return true;
            } else if (arr[mid] < value) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return false;
    }
}