/**
 * packageName    : PACKAGE_NAME
 * fileName       : 콜라
 * author         : 정재윤
 * date           : 2023-09-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-27        정재윤       최초 생성
 */
public class 콜라 {
    public static void main(String[] args) {
        콜라 콜라 = new 콜라();
        System.out.println(콜라.solution(2, 1, 20));
    }

    public int solution(int a, int b, int n) {
        int answer = 0;

        while(true) {
            //1. 가지고 있는 빈 병 수가 a개보다 미만이면 return
            if(n < a) {
                break;
            }

            //2. 가지고 있는 빈 병 수가 a개보다 크면 시작
            answer += (n / a) * b;
            int remain = n % a;
            n = (n / a) * b + remain;
        }

        return answer;
    }
}
