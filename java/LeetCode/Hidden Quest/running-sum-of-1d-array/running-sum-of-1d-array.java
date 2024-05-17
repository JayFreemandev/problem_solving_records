class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0;
        while(i<nums.length){
            for(int j=0; j<=i; j++){
                result[i] += nums[j];
            }
        i++;
        }

        return result;
    }
}