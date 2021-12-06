package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inflearn8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        String answer = solution(str);
        System.out.println(answer);
        reader.close();
    }

    private static String solution(String str) {
        str = str.replaceAll("[^A-Za-z]", "");

        String reverse = new StringBuilder(str).reverse().toString();
        if (reverse.equalsIgnoreCase(str)) {
            return "YES";
        }
        return "NO";
    }
}
