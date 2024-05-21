import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created at 2022-12-10
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/
 * Level -> EASY
 * Topic -> SIMULATION
 */
public class EASY_2357 {
    public static void main(String[] args) {

        int[] nums = {1,5,0,3,5};
        System.out.println(minimumOperations(nums));
    }
    public static int minimumOperations(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int a: nums)
            if (a > 0)
                set.add(a);
        return set.size();
    }
}
