// 1343번

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();

        String result = polyomino(board);
        System.out.println(result);
    }

    static String polyomino(String board) {
        StringBuilder newBoard = new StringBuilder();
        int i = 0;

        while (i < board.length()) {
            if ((i + 3 < board.length()) && (board.charAt(i) == 'X') && (board.charAt(i + 1) == 'X') &&
                    (board.charAt(i + 2) == 'X') && (board.charAt(i + 3) == 'X')) {
                newBoard.append("AAAA");
                i += 4;
            } else if ((i + 1 < board.length()) && (board.charAt(i) == 'X') && (board.charAt(i + 1) == 'X')) {
                newBoard.append("BB");
                i += 2;
            } else if (board.charAt(i) == '.') {
                newBoard.append('.');
                i++;
            } else {
                return "-1";
            }
        }

        return newBoard.toString();
    }
}
