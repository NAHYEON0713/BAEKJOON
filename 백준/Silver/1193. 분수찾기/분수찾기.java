import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int count = 1;
        int sum =  0;

        while(true){
            if(X <= sum + count) {
                if(count % 2 == 1){
                    System.out.println((count-(X - sum -1) + "/" + (X - sum)));
                    break;
                } else {
                    System.out.println((X - sum) + "/" + (count-(X - sum -1)));
                    break;
                }
            } else {
                sum += count;
                count++;
            }
        }
    }
}