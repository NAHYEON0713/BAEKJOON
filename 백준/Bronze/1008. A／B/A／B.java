import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double result;

    result = a / b;

    System.out.printf("%.9f", result);

    }
}