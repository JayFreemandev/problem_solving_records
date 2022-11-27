import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created at 2022-11-27
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_1013 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0};
        System.out.println(canThreePartsEqualSum(arr));
    }

    public static boolean canThreePartsEqualSum(int[] arr) {
        int sum = Arrays.stream(arr).sum();

        if(sum%3 != 0 || sum == 0) return false;

        int each = sum / 3;
        int temp = 0;
        int partition = 0;

        for(int i=0; i<arr.length; i++){
            temp+=arr[i];
            if(temp == each){
                temp = 0;
                partition++;
            }
        }

        return partition == 3 ? true : false;
    }
}