class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0;
        int end = height.length - 1;

        while(start < end){
            int area = Math.min(height[start], height[end]) * (end-start);
            maxArea = Math.max(maxArea, area);  

            if(height[start] < height[end]){
                start++;
            }else{
                end--;
            }
        }

        return maxArea;
    }
}