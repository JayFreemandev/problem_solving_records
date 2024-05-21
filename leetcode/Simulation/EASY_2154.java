/**
 * Created at 2022-12-10
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/keep-multiplying-found-values-by-two/description/
 * Level -> EASY
 * Topic -> SIMULATION
 */
public class EASY_2154 {
    public static void main(String[] args) {

        int[] nums = {8,19,4,2,15,3};
        int original = 2;
        System.out.println(findFinalValue(nums, original));
    }
    public static int findFinalValue(int[] nums, int original) {

        int left = 0;
        int right = nums.length;

        while(left <= right)
            for(int num : nums){
                if(num == original){
                    original*=2;
                    left = 0;
                    break;
                }else{
                    left++;
                }
            }

        return original;
    }
}
