package 문자열;

import java.util.Scanner;

public class inflearn2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        String answer = solution(str);
        System.out.println(answer);
    }

    private static String solution(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);
            }
        }

        return answer;
    }
}
