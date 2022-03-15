import java.util.Stack;

/**
 * leetcode_9.java
 *
 * @author Jaeyun Jeong
 */
public class leetcode_9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome (122));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        Stack<Integer> stack = new Stack();

        int n = x;
        while (n > 0) {
            stack.push(n % 10);
            n /= 10;
        }

        n = x;
        while (n > 0) {
            if (n % 10 != stack.pop()) return false;
            n /= 10;
        }

        return true;
    }
}
