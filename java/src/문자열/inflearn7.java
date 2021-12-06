package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inflearn7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        String answer = solution(str);
        System.out.println(answer);
        reader.close();
    }

    private static String solution(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        if (reverse.equalsIgnoreCase(str)) {
            return "YES";
        }
        return "NO";
    }

    //직접 확인하기
    private static String solution2(String str) {
        str = str.toUpperCase();
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return "NO";
            }
        }
        return "YES";
    }
}
