package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//제목: 회의실 배정
//링크: https://www.acmicpc.net/problem/1931
public class b1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;
        int n = Integer.parseInt(reader.readLine());
        int[][] schedules = new int[n][2];

        for (int i = 0; i < n; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int start = Integer.parseInt(tokenizer.nextToken());
            int end = Integer.parseInt(tokenizer.nextToken());
            schedules[i][0] = start;
            schedules[i][1] = end;
        }

        int answer = solution(schedules);
        System.out.println(answer);
        reader.close();
    }

    private static int solution(int[][] schedules) {
        int answer = 1;
        Arrays.sort(schedules, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int min = schedules[0][1];
        for (int i = 1; i < schedules.length; i++) {
            if (min <= schedules[i][0]) {
                min = schedules[i][1];
                answer++;
            }
        }
        return answer;
    }
}
