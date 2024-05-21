import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

/**
 * Created at 2022-12-25
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/partition-array-according-to-given-pivot/
 * Level -> EASY
 * Topic -> SIMULATION
 */
public class MEDIUM_2161 {
    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        pivotArray(nums, pivot);
    }
    public static int[] pivotArray(int[] nums, int pivot) {
        Queue<Integer> left = new LinkedList<>();
        Queue<Integer> piv = new LinkedList<>();
        Queue<Integer> right = new LinkedList<>();
        for(int n : nums){
            if(n < pivot){
                left.add(n);
            }else if( n > pivot){
                right.add(n);
            }else{
                piv.add(pivot) ;
            }
        }
        for (int i = 0; i < nums.length ; i++) {
            Queue<Integer> current = !left.isEmpty() ? left :!piv.isEmpty() ? piv : right;
            nums[i] = current.poll();
        }
        return nums;
    }
}
