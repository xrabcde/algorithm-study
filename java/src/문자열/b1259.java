package 문자열;

import java.util.Scanner;

//제목 : 팰린드롬수
//링크 : https://www.acmicpc.net/problem/1259
public class b1259 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        StringBuilder sb = new StringBuilder("");
        while (!"0".equals(str)) {
            sb.append(solution(str));
            sb.append(" ");
            str = kb.next();
        }

        String[] strings = sb.toString().split(" ");
        for (String s : strings) {
            System.out.println(s);
        }
    }

    private static String solution(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        if (reverse.equals(str)) {
            return "yes";
        }
        return "no";
    }
}
