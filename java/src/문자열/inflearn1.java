package 문자열;

import java.util.Scanner;

public class inflearn1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        int answer = solution(str, c);
        System.out.println(answer);
    }

    private static int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (char x : str.toCharArray()) {
            if (x == t) {
                answer++;
            }
        }

        return answer;
    }
}
