/**
 * leetcode_338.java
 *
 * @author Jaeyun Jeong
 */
public class leetcode_338 {
    public static void main(String[] args) {
        System.out.println(countBits (5));
    }

    public static int[] countBits(int n) {
        int[] result = new int[n+1];
        result[0] = 0;
        result[1] = 1;

        for(int i=0; i<n; i++){
            result[i] = result[i/2];
            if(i%2 == 1){
                result[i]++;
            }
        }
        return result;
    }
}
