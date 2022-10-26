import java.util.Arrays;

/**
 * Created at 2022-10-25
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/maximum-units-on-a-truck/
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_1710 {
    public static void main(String[] args) {

        int[][] boxTypes = {
            {1,3},
            {2,2},
            {3,1}
        };

        int truckSize = 4;
        System.out.println(maximumUnits(boxTypes, truckSize));
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b)-> Integer.valueOf(b[1]).compareTo(Integer.valueOf(a[1])));
        int maximumWeight = 0;

        for(int[] box : boxTypes){
            if(truckSize >= box[0]){
                maximumWeight += box[0] * box[1];
                truckSize -= box[0];
            }else{
                maximumWeight += truckSize * box[1];
                return maximumWeight;
            }
        }
        return maximumWeight;
    }
}