package 자료구조_스택큐;

import java.util.*;

//제목: 주식가격
//링크: https://programmers.co.kr/learn/courses/30/lessons/42584
public class p42584 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        int[] answer = solution(prices);

        for (int i : answer) {
            System.out.println(i);
        }
    }

    private static int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < len; i++) {
            while (!st.isEmpty() && prices[i] < prices[st.peek()]) {
                answer[st.peek()] = i - st.peek(); // 시간 차이
                st.pop();
            }
            st.push(i); // 가격이 안 떨어졌다면 인덱스를 저장
        }

        while (!st.isEmpty()) { // 마지막까지 안 떨어진 애들
            answer[st.peek()] = (len - 1) - st.peek();
            st.pop();
        }

        return answer;
    }
}
