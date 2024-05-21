/**
 * packageName    : PACKAGE_NAME
 * fileName       : 삼진법_뒤집기
 * author         : 정재윤
 * date           : 2023-09-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-24        정재윤       최초 생성
 */
public class 삼진법_뒤집기 {
    public static void main(String[] args) {
        삼진법_뒤집기 삼진법 = new 삼진법_뒤집기();
        System.out.println(삼진법.solution(45));
    }

    public int solution(int n) {

        StringBuilder stringBuilder = new StringBuilder();

        while(n > 0){
            stringBuilder.append(n%3);
            n/=3;
        }

        String test = stringBuilder.toString();

        return Integer.parseInt(test, 3);
    }
}
