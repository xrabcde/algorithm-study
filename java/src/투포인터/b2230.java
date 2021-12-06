package 투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//제목: 수 고르기
//링크: https://www.acmicpc.net/problem/2230
public class b2230 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }

        int answer = solution(list, m);
        System.out.println(answer);
        reader.close();
    }

    private static int solution(int[] list, int m) {
        Arrays.sort(list);
        int answer = Integer.MAX_VALUE;
        int start = 0, end = 1;
        while (true) {
            if (end == list.length || start == list.length) {
                break;
            }
            int gap = list[end] - list[start];
            if (gap >= m) {
                answer = Math.min(gap, answer);
                start++;
            } else {
                end++;
            }
        }
        return answer;
    }
}
