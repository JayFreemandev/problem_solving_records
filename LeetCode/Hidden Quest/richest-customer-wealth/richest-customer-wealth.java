class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = Arrays.stream(accounts)
            .mapToInt(num -> Arrays.stream(num).sum())
            .max()
            .orElse(0);
        return result;
    }
}