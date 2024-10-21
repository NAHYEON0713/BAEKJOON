import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<String> words = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            String reverseWord = new StringBuilder(word).reverse().toString();

            if (words.contains(reverseWord) || word.equals(reverseWord)) {
                System.out.println(word.length() + " " + word.charAt(word.length()/2));
            } else {
                words.add(word);
            }
        }
    }
}