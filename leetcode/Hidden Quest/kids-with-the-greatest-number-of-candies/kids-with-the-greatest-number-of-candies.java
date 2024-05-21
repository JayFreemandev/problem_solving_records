class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maxCandy = 0;
        for(int i=0; i<candies.length; i++){
            maxCandy = Math.max(candies[i], maxCandy);
        }

        List<Boolean> result = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            result.add(candies[i]+extraCandies >= maxCandy);
        }

        return result;
    }
}