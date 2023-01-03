import java.util.ArrayList;

/**
 * Created at 2023-01-03
 * Site -> LINKEDIN
 * Link -> https://github.com/JayFreemandev/Problem-Solving/tree/main/LeetCode/Simulation
 * Level -> MEDIUM
 * Topic -> SIMULATION
 */
public class MEDIUM_2149 {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        rearrangeArray(nums);
    }
    public static int[] rearrangeArray(int[] nums) {

        int ans[]=new int[nums.length];

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                a.add(nums[i]);
            }else{
                b.add(nums[i]);
            }
        }

        int k=0,l=0;

        for(int i=0;i<ans.length;i++)
        {
            if(i%2==0)
            {
                ans[i]=a.get(k);
                k++;
            }else{
                ans[i]=b.get(l);
                l++;
            }
        }

        return ans;
    }
}
