/**
 * packageName    : PACKAGE_NAME
 * fileName       : 이상한_문자_만들기
 * author         : 정재윤
 * date           : 2023-09-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-25        정재윤       최초 생성
 */
public class 이상한_문자_만들기 {

    public static void main(String[] args) {
        이상한_문자_만들기 문자 = new 이상한_문자_만들기();
        System.out.println(문자.solution("try hello world"));
    }

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                idx = 0;
                answer.append(' ');
            } else {
                answer.append(idx % 2 == 0 ? Character.toUpperCase(c) : Character.toLowerCase(c));
                idx++;
            }
        }

        return answer.toString();
    }

}
