import java.util.Scanner;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : B1_평균_구하기
 * author         : 정재윤
 * date           : 2023-08-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-02        정재윤       최초 생성
 */
public class B1_평균_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int examCount = sc.nextInt();
        int[] scores = new int[examCount];

        for(int i=0; i<examCount; i++){
            scores[i] = sc.nextInt();
        }

        long max = 0;
        long sum = 0;

        for(int score : scores){
            max = Math.max(max, score);
            sum+= score;
        }

        System.out.println(sum * 100.0 / max / examCount);
    }
}
