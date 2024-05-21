import java.util.Arrays;

/**
 * Created at 2022-10-23
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_2160 {
    public static void main(String[] args) {
        int num = 4009;
        System.out.println(minimumSum(num));
    }
    public static int minimumSum(int num) {
        int[] dig = new int[4];
        int cur = 0;
        while(num > 0)
        {
            dig[cur++] = num % 10;
            num /= 10;
        }
        Arrays.sort(dig);
        return dig[0]*10 + dig[2] + dig[1]*10 + dig[3];
    }
}
