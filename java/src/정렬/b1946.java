package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//제목: 신입 사원
//링크: https://www.acmicpc.net/problem/1946
public class b1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;

        int t = Integer.parseInt(reader.readLine());
        int[] answer = new int[t];

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(reader.readLine());
            int[] rank = new int[n];

            for (int j = 0; j < n; j++) {
                tokenizer = new StringTokenizer(reader.readLine());
                int a = Integer.parseInt(tokenizer.nextToken()) - 1;
                int b = Integer.parseInt(tokenizer.nextToken());
                rank[a] = b;
            }
            answer[i] = solution(rank);
        }
        for (int i : answer) {
            System.out.println(i);
        }
        reader.close();
    }

    private static int solution(int[] rank) {
        int answer = 1;
        int min = rank[0];
        for (int i = 1; i < rank.length; i++) {
            if (rank[i] < min) {
                min = rank[i];
                answer++;
            }
        }

        return answer;
    }
}
