package programmers.level1;

import java.util.*;

public class Kakao_report {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        System.out.println(solution(id_list, report, k));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {

        int[] answer = new int[id_list.length];

        Map<String, HashSet<String>> reportHistory = new HashMap<>();
        Map<String, Integer> deadLine = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            reportHistory.put(name, new HashSet<>());
            deadLine.put(name, i);
        }

        for (String s : report) {
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            reportHistory.get(to).add(from);
        }

        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = reportHistory.get(id_list[i]);
            if (send.size() >= k) {
                for (String name : send) {
                    answer[deadLine.get(name)]++;
                }
            }
        }

        return answer;
    }
}
