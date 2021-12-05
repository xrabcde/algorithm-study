package 문자열;

import java.util.Scanner;

public class inflearn4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }

        for (String s : str) {
            System.out.println(solution(s));
        }
    }

    private static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
