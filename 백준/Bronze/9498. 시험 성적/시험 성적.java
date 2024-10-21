import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int grade = Integer.parseInt(br.readLine());

        if (grade >= 90 && grade <= 100) {
            System.out.println('A');
        } else if (grade >= 80 && grade <= 89) {
            System.out.println('B');
        } else if (grade >= 70 && grade <= 79) {
            System.out.println('C');
        } else if (grade >= 60 && grade <= 69) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }
}
