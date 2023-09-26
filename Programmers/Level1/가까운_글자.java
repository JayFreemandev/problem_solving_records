import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : 가까운_글자
 * author         : 정재윤
 * date           : 2023-09-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-26        정재윤       최초 생성
 */
public class 가까운_글자 {
    public static void main(String[] args) {
        가까운_글자 가까운글자 = new 가까운_글자();
        System.out.println(가까운글자.solution("banana"));
    }

    public int[] solution(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hashMap.containsKey(c)) {
                answer[i] = i - hashMap.get(c);
            } else {
                answer[i] = -1;
            }
            hashMap.put(c, i);
        }

        return answer;
    }
}