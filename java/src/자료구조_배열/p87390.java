package 자료구조_배열;

//제목: n^2 배열 자르기
//링크: https://programmers.co.kr/learn/courses/30/lessons/87390
public class p87390 {
    public static void main(String[] args) {
        int n = 4;
        int left = 7;
        int right = 14;

        int[] answer = solution(n, left, right);

        for (int i : answer) {
            System.out.println(i);
        }
    }

    private static int[] solution(int n, long left, long right) {
        int len = (int) (right-left) + 1;
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            int a = (int) ((left+i) / n) + 1;
            int b = (int) ((left+i) % n) + 1;
            answer[i] = Math.max(a, b);
        }
        return answer;
    }
}
