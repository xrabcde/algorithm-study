package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inflearn12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String str = reader.readLine();

        String answer = solution(str);
        System.out.println(answer);
        reader.close();
    }

    private static String solution(String str) {
        int len = str.length() / 7;
        String answer = "";
        for (int i = 0; i < len; i++) {
            String substring = str.substring(i * 7, ((i + 1) * 7));
            substring = substring.replace('#', '1');
            substring = substring.replace('*', '0');
            answer += (char) Integer.parseInt(substring, 2);
        }
        return answer;
    }
}
