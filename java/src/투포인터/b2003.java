package 투포인터;

import java.util.Scanner;

//제목: 수들의 합 2
//링크: https://www.acmicpc.net/problem/2003
public class b2003 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i]= kb.nextInt();
        }

        int answer = solution(list, m);
        System.out.println(answer);
    }

    private static int solution(int[] list, int m) {
        int answer = 0;
        int start = 0, end = 0;
        int sum = 0;
        while (true) {
            if (sum >= m) {
                sum -= list[start++];
            } else if (end >= list.length) {
                break;
            } else {
                sum += list[end++];
            }

            if (sum == m) {
                answer++;
            }
        }

        return answer;
    }
}
