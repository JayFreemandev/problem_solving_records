class Solution {
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        int tempMax = nums[0];
        int max = nums[0];

        for(int i=1; i < length; i++){
            tempMax = Math.max(tempMax+nums[i], nums[i]);
            max = Math.max(tempMax, max);
        }

        return max;
    }
}