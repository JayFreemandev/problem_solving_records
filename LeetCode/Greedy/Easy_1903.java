/**
 * Created at 2022-11-01
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/largest-odd-number-in-string/
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_1903 {
    public static void main(String[] args) {
        String num = "35427";
        System.out.println(largestOddNumber(num));
    }

    public static String largestOddNumber(String num) {

        for(int i = num.length()-1; i >= 0; --i){
            if(num.charAt(i) % 2 == 1)
                return num.substring(0, i+1);
        }

        return "";
    }
}