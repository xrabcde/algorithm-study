package 자료구조_스택큐;

import java.util.ArrayList;
import java.util.List;

//제목 : 기능개발
//링크 : https://programmers.co.kr/learn/courses/30/lessons/42586
public class p42586 {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        int[] answer = solution(progresses, speeds);

        for (int i : answer) {
            System.out.println(i);
        }
    }

    private static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> days = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            progresses[i] = 100 - progresses[i];
        }
        for (int i = 0; i < progresses.length; i++) {
            days.add((int) Math.ceil((double) progresses[i]/speeds[i]));
        }
        while (!days.isEmpty()) {
            if (days.size() == 1) {
                answer.add(1);
                break;
            }
            int tmp = days.remove(0);
            int cnt = 1;
            for (int day : days) {
                if (day > tmp) {
                    break;
                }
                cnt++;
            }
            answer.add(cnt);
            if (cnt > 1) {
                days.subList(0, cnt - 1).clear();
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
