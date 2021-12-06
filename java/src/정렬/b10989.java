package 정렬;

import java.io.*;
import java.util.Arrays;

//제목: 수 정렬하기 3
//링크: https://www.acmicpc.net/problem/10989
public class b10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }

        StringBuilder sb = new StringBuilder();
        Arrays.sort(list);
        for (int i : list) {
            sb.append(i + "\n");
        }

        System.out.println(sb);
        reader.close();
    }
}
