import java.util.Arrays;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : 삼총사
 * author         : 정재윤
 * date           : 2023-09-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-26        정재윤       최초 생성
 */
public class 삼총사 {
    public static void main(String[] args) {
        삼총사 삼총사 = new 삼총사();
        int[] number = {-2, 3, 0, 2, -5};
        System.out.println(삼총사.solution(number));
    }

    public int solution(int[] number) {
        int answer = 0;

        for(int i=0; i<number.length; i++){
            for(int j=i+1; j<number.length; j++){
                for(int k= j+1; k<number.length; k++){
                    if(number[i]+number[j]+number[k] == 0){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
