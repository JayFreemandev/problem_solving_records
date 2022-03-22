import java.util.ArrayList;
import java.util.List;

/**
 * leetcode_509.java
 *
 * @author Jaeyun Jeong
 */
public class leetcode_509 {
    static int[] fib_cache = new int[31];

    public static void main(String[] args) {
        System.out.println(fib(2));
    }

    public static int fib(int N) {
        fib_cache[0] = 0;
        fib_cache[1] = 1;
        fib_cache[2] = 1;

        if (N <= 1)
            return N;
        else if (fib_cache[N] != 0)
            return fib_cache[N];
        else
            return fib_cache[N] = fib(N - 1) + fib(N - 2);
    }
}
 
