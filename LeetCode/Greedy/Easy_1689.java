/**
 * Created at 2022-11-28
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_1689 {
    public static void main(String[] args) {

        String n = "82734";
        System.out.println(minPartitions(n));
    }

    public static int minPartitions(String n) {
        int tmp = 0;
        for(int i=0; i<n.length(); i++)
        {
            int curr = n.toCharArray()[i] - '0';
            if(tmp<curr)
            {
                tmp = curr;
            }
        }
        return tmp;
    }
}
