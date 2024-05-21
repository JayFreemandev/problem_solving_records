/**
 * Created at 2022-12-17
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/description/
 * Level -> EASY
 * Topic -> SIMULATION
 */
public class EASY_2180 {
    public static void main(String[] args) {
        int k = 30;
        System.out.println(countEven(k));
    }

    public static int countEven(int num) {
        int sum = 0;

        for (int i = 2; i <= num; i++) {
            if (isEven(i)) sum++;
        }

        return sum;
    }

    public static boolean isEven(int n){
        int sum = 0;

        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }

        // 2로 나누어 떨어지면 true even
        return sum%2==0;
    }
}

