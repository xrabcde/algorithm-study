package 문자열;

import java.util.Scanner;

public class inflearn3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        String answer = solution(str);

        System.out.println(answer);
    }

    private static String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] strings = str.split(" ");
        for (String string : strings) {
            int len = string.length();
            if (len > m) {
                m = len;
                answer = string;
            }
        }

        return answer;
    }
}
