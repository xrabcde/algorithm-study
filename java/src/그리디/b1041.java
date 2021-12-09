package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//제목: 주사위
//링크: https://www.acmicpc.net/problem/1041
public class b1041 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int[] dice = new int[6];
        for (int i = 0; i < 6; i++) {
            dice[i] = Integer.parseInt(tokenizer.nextToken());
        }

        long answer = solution(dice, n);
        System.out.println(answer);
        reader.close();
    }

    private static long solution(int[] dice, long n) {
        if (n == 1) {
            int sum = Arrays.stream(dice).sum();
            int max = Arrays.stream(dice).max().getAsInt();
            return sum - max;
        }

        //3면 : 4개
        // (0, 1, 2), (0, 1, 3), (0, 2, 4), (0, 3, 4)
        // (1, 2, 5), (1, 3, 5), (2, 4, 5), (3, 4, 5)

        int[] three = new int[8];
        three[0] = dice[0] + dice[1] + dice[2];
        three[1] = dice[0] + dice[1] + dice[3];
        three[2] = dice[0] + dice[2] + dice[4];
        three[3] = dice[0] + dice[3] + dice[4];
        three[4] = dice[1] + dice[2] + dice[5];
        three[5] = dice[1] + dice[3] + dice[5];
        three[6] = dice[2] + dice[4] + dice[5];
        three[7] = dice[3] + dice[4] + dice[5];
        long threeMin = Arrays.stream(three).min().getAsInt();
        long threeCnt = 4;

        //2면 : (n - 1) * 4 + (n - 2) * 4
        // (0, 1), (0, 2), (0, 3), (0, 4), (1, 2), (1, 3), (1, 5)
        // (2, 4), (2, 5), (3, 4), (3, 5), (4, 5)

        int[] two = new int[12];
        two[0] = dice[0] + dice[1];
        two[1] = dice[0] + dice[2];
        two[2] = dice[0] + dice[3];
        two[3] = dice[0] + dice[4];
        two[4] = dice[1] + dice[2];
        two[5] = dice[1] + dice[3];
        two[6] = dice[1] + dice[5];
        two[7] = dice[2] + dice[4];
        two[8] = dice[2] + dice[5];
        two[9] = dice[3] + dice[4];
        two[10] = dice[3] + dice[5];
        two[11] = dice[4] + dice[5];
        long twoMin = Arrays.stream(two).min().getAsInt();
        long twoCnt = (n - 1) * 4 + (n - 2) * 4;

        //1면 : (n - 2) * (n - 1) * 4 + (n - 2) * (n - 2)
        long oneMin = Arrays.stream(dice).min().getAsInt();
        long oneCnt = (n - 2) * (n - 1) * 4 + (n - 2) * (n - 2);

        return threeMin * threeCnt + twoMin * twoCnt + oneMin * oneCnt;
    }
}
