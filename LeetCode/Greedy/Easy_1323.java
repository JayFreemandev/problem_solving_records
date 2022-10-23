import java.sql.Array;
import java.util.Arrays;

/**
 * Created at 2022-10-23
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/maximum-69-number/
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_1323 {
    public static void main(String[] args) {
        int num = 696;
        System.out.println(maximum69Number(num));
    }
    public static int maximum69Number (int num) {

        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length; i++){
            if(chars[i] == '6'){
                chars[i] = '9' ;
                break;
            }
        }

        return Integer.parseInt(String.valueOf(chars));
    }
}
