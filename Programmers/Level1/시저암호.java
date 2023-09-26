/**
 * packageName    : PACKAGE_NAME
 * fileName       : 시저암호
 * author         : 정재윤
 * date           : 2023-09-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-26        정재윤       최초 생성
 */
public class 시저암호 {
    public static void main(String[] args) {
        시저암호 시저암호 = new 시저암호();
        System.out.println(시저암호.solution("AB", 1));
    }

    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char current = s.charAt(i);

            if (Character.isLowerCase(current)) {
                current = (char) ((current - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(current)) {
                current = (char) ((current - 'A' + n) % 26 + 'A');
            }

            answer.append(current);
        }

        return answer.toString();
    }
}
