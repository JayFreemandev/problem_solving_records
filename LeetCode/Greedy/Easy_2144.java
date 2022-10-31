import java.util.Arrays;

/**
 * Created at 2022-10-30
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_2144 {
    public static void main(String[] args) {
        int[] cost = {1,2,3};
        System.out.println(minimumCost(cost));
    }

    public static int minimumCost(int[] cost) {

        Arrays.sort(cost);
        int index = cost.length -1;
        int minCost = 0;

        while (index > 1) {
            minCost += cost[index] + cost[index -1];
            index -= 3;
        }

        while(index >= 0) {
            minCost += cost[index--];
        }
        return minCost;
    }
}