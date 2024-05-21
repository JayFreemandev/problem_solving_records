/**
 * Created at 2022-12-10
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/min-max-game/description/
 * Level -> EASY
 * Topic -> SIMULATION
 */
public class EASY_2293 {
    public static void main(String[] args) {

        int[] nums = {1,3,5,2,4,8,2,2};
        System.out.println(minMaxGame(nums));
    }

    public static int minMaxGame(int[] nums) {
        if(nums.length == 1) return nums[0];

        int[] temp = new int[nums.length/2];
        int count =0;
        int index = 0;

        for(int i=0; i<nums.length-1; i+=2){
            if(count%2==0){
                temp[index] = Math.min(nums[i],nums[i+1]);
            }else{
                temp[index] = Math.max(nums[i],nums[i+1]);
            }
            count ++;
            index ++;
        }

        return minMaxGame(temp);
    }
}
