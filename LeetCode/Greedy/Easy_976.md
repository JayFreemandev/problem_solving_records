/**
 * Created at 2022-11-03
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/largest-perimeter-triangle/
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_976 {
    public static void main(String[] args) {
        int[] num = {2,1,2};
        System.out.println(largestPerimeter(num));
    }

    public static int largestPerimeter(int[] nums) {

        Arrays.sort(nums);

        for (int i = nums.length - 1; i > 1; i--)
            if(nums[i] < nums[i-1] + nums[i-2]){
                return nums[i] + nums[i-1] + nums[i-2];
            }

        return 0;
    }
}
