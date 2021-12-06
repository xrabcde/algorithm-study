package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//제목: 듣보잡
//링크: https://www.acmicpc.net/problem/1764
public class b1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        Set<String> set = new HashSet<>();
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            set.add(reader.readLine());
        }
        for (int i = 0; i < m; i++) {
            String name = reader.readLine();
            if (set.contains(name)) {
                answer.add(name);
            }
        }

        Collections.sort(answer);
        System.out.println(answer.size());
        for (String s : answer) {
            System.out.println(s);
        }
        reader.close();
    }
}
