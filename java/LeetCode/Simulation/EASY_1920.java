/**
 * Created at 2022-12-07
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/build-array-from-permutation
 * Level -> EASY
 * Topic -> SIMULATION
 */
public class EASY_1920 {
    public static void main(String[] args) {
        int[] people = {0,2,1,5,3,4};
        System.out.println(buildArray(people));
    }

    public static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i< nums.length; i++){
            result[i] = nums[nums[i]];
        }
        return result;
    }
}
