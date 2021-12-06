package 자료구조_배열;

import java.util.*;

//제목 : N번째 큰 수
//링크 : https://www.acmicpc.net/problem/2075
public class b2075 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Queue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = kb.nextInt();
                pq.offer(num);
                if (pq.size() > n) {
                    pq.remove();
                }
            }
        }

        System.out.println(pq.peek());
    }
}
