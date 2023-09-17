package one;

/**
 * packageName    : one
 * fileName       : Fibo
 * author         : 정재윤
 * date           : 2023-09-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-17        정재윤       최초 생성
 */
public class Fibo {
    int[] cache = new int[11];
    public int recursion(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return recursion(n - 1) + recursion(n - 2);
    }

    public int dp(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        int temp = cache[n];
        if(temp != 0) return temp;

        return cache[n] = dp(n-1) + dp(n-2);
    }
}
