/**
 * packageName    : PACKAGE_NAME
 * fileName       : 크기가_작은_문자열
 * author         : 정재윤
 * date           : 2023-09-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-25        정재윤       최초 생성
 */
public class 크기가_작은_문자열 {
    public static void main(String[] args) {
        크기가_작은_문자열 문자열 = new 크기가_작은_문자열();
        System.out.println(문자열.solution("3141592", "271"));
    }

    public int solution(String t, String p) {
        int answer = 0;
        int target = Integer.parseInt(p);
        for (int i = 0; i <= t.length() - p.length(); i++) {
            int num = Integer.parseInt(t.substring(i, i + p.length()));
            if (num <= target) answer++;
        }
        return answer;
    }
}
