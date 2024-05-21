/**
 * Created at 2022-10-24
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_1827 {
    public static void main(String[] args) {
        int[] ints = new int[]{1,5,2,4,1};
        System.out.println(minOperations(ints));
    }

    public static int minOperations(int[] nums) {

        if (nums.length <= 1) {
            return 0;
        }

        int count = 0;
        int previous = nums[0];

        for(int i = 1; i<nums.length; i++){
            int current = nums[i];
            while(previous >= current){
                count++;
                current += 1;
            }
            previous = current;
        }

        return count;
    }
}
