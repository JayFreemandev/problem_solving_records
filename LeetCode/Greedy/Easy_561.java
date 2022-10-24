import java.util.Arrays;

/**
 * Created at 2022-10-24
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/array-partition/
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_561 {
    public static void main(String[] args) {
        int[] ints = new int[]{6,2,6,5,1,2};
        System.out.println(arrayPairSum(ints));
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}