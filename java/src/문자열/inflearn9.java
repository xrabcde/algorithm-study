package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inflearn9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        int answer = solution(str);
        System.out.println(answer);
        reader.close();
    }

    private static int solution(String str) {
        str = str.replaceAll("[^0-9]", "");
        return Integer.parseInt(String.valueOf(str.toCharArray()));
    }
}
