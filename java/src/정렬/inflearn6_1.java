package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//제목: 선택정렬
public class inflearn6_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(tokenizer.nextToken());
        }
        int[] answer = solution(list);
        for (int i : answer) {
            System.out.print(i + " ");
        }
        reader.close();
    }

    private static int[] solution(int[] list) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (list[j] < list[idx]) {
                    idx = j;
                }
            }
            int tmp = list[i];
            list[i] = list[idx];
            list[idx] = tmp;
        }
        return list;
    }
}
