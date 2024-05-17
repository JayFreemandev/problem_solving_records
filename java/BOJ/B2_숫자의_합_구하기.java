import java.util.Scanner;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : B2_숫자의_합_구하기
 * author         : 정재윤
 * date           : 2023-08-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-02        정재윤       최초 생성
 */
public class B2_숫자의_합_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sNum = sc.next();
        char[] valueStrings = sNum.toCharArray();

        int result = 0;

        for(int i=0; i<valueStrings.length; i++){
            result += valueStrings[i] - '0';
        }

        System.out.println(result);
    }
}
