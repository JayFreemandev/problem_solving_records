package one;

/**
 * packageName    : one
 * fileName       : Recursion_Sum_100
 * author         : 정재윤
 * date           : 2023-09-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-17        정재윤       최초 생성
 */
public class Recursion_Sum_100 {
    // 1부터 n까지의 합
    public int recursiveSum(int number){
        if(number==1){
            return 1;
        }else{
            return number + recursiveSum(number - 1);
        }
    }
}
