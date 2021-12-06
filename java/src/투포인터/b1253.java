package 투포인터;

import java.util.Arrays;
import java.util.Scanner;

//제목: 좋다
//링크: https://www.acmicpc.net/problem/1253
public class b1253 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = kb.nextInt();
        }

        int answer = solution(list);
        System.out.println(answer);
    }

    private static int solution(int[] list) {
        Arrays.sort(list);
        int answer = 0;
        int n = list.length;

        for (int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                int sum = list[start] + list[end];
                if (sum < list[i]) {
                    start++;
                } else if (sum > list[i]) {
                    end--;
                } else {
                    if (i != start && i != end) {
                        answer++;
                        break;
                    }
                    if (start == i) {
                        start++;
                    }
                    if (end == i) {
                        end--;
                    }
                }
            }
        }
        return answer;
    }
}
