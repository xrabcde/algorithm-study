package 자료구조_스택큐;

import java.util.*;

//제목: 괄호의 값
//링크 : https://www.acmicpc.net/problem/2504
public class b2504 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        int answer = solution(str);
        System.out.println(answer);
    }

    private static int solution(String str) {
        int answer = 0;
        int each = 1;
        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if ('(' == tmp) {
                each *= 2;
                brackets.push(tmp);
            } else if ('[' == tmp) {
                each *= 3;
                brackets.push(tmp);
            } else if (')' == tmp) {
                if (brackets.isEmpty() || brackets.peek() != '(') {
                    return 0;
                }
                if (str.charAt(i-1) == '(') {
                    answer += each;
                }
                brackets.pop();
                each /= 2;
            } else if (']' == tmp) {
                if (brackets.isEmpty() || brackets.peek() != '[') {
                    return 0;
                }
                if (str.charAt(i-1) == '[') {
                    answer += each;
                }
                brackets.pop();
                each /= 3;
            } else {
                return 0;
            }
        }
        if (!brackets.isEmpty()) {
            return 0;
        }
        return answer;
    }
}
