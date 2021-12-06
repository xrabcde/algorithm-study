package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inflearn5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        String answer = solution(str);

        System.out.println(answer);
        reader.close();
    }

    private static String solution(String str) {
        char[] arr = str.toCharArray();
        int start = 0, end = arr.length-1;

        while (start < end) {
            if (Character.isAlphabetic(arr[start]) && Character.isAlphabetic(arr[end])) {
                char tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
                start++;
                end--;
            } else {
                if (!Character.isAlphabetic(arr[start])) {
                    start++;
                }
                if (!Character.isAlphabetic(arr[end])) {
                    end--;
                }
            }
        }

        return String.valueOf(arr);
    }
}
