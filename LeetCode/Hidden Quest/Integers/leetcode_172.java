import java.util.Stack;

/**
 * leetcode_172.java
 *
 * @author Jaeyun Jeong
 */
public class leetcode_172 {
    public static void main(String[] args) {
        System.out.println(trailingZeroes (5));
    }

    public static int trailingZeroes(int n) {
        int count = 0;

        while(n > 0){
            n/=5;

            count+=n;
        }

        return count;
    }
}
