package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//제목: 잃어버린 괄호
//링크: https://www.acmicpc.net/problem/1541
public class b1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        int answer = solution(str);

        System.out.println(answer);
        reader.close();
    }

    private static int solution(String str) {
        String[] numbers = str.split("-");
        List<Integer> results = new ArrayList<>();

        for (String num : numbers) {
            if (num.contains("+")) {
                String[] n = num.split("\\+");
                results.add(Arrays.stream(n).mapToInt(Integer::parseInt).sum());
            } else {
                results.add(Integer.parseInt(num));
            }
        }

        int answer = results.get(0);
        for (int i = 1; i < results.size(); i++) {
            answer -= results.get(i);
        }

        return answer;
    }
}
