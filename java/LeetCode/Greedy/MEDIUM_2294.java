import java.util.Arrays;
import java.util.Objects;

/**
 * Created at 2022-12-06
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/partition-array-such-that-maximum-difference-is-k/
 * Level -> MEDIUM
 * Topic -> GREEDY
 */
public class MEDIUM_2294 {
    public static void main(String[] args) {
        int[] nums = {3,6,1,2,5};
        int k = 2;
        System.out.println(partitionArray(nums, k));
    }

    public static int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int current = nums[0];
        int count = 1;

        for(int num : nums){
            if(num-current > k){
                count++;
                current = num;
            }
        }

        return count;
    }
}
