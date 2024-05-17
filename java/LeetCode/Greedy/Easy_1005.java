import java.util.Arrays;

/**
 * Created at 2022-11-21
 * Site -> LINKEDIN
 * Link -> Maximize Sum Of Array After K Negations
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_1005 {
    public static void main(String[] args) {
        int[] nums = {4,2,3};
        int k = 1;
        System.out.println(largestSumAfterKNegations(nums, k));
    }

    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count < k) {
                if (nums[i] < 0) {
                    nums[i] = -1 * nums[i];
                    count++;
                }
            }
        }

        if (count < k) {
            Arrays.sort(nums);
            while (count < k) {
                nums[0] = -1 * nums[0];
                count++;
            }
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }
}
