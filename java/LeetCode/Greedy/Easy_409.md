import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created at 2022-11-04
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/longest-palindrome/
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_406 {
    public static void main(String[] args) {
        String s = "bb";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        if(s==null || s.length()==0) return 0;

        Set<Character> set = new HashSet<>();

        int count = 0;
        char[] chars = s.toCharArray();
        for(char c: chars) {
            if(set.remove(c)) {
                count++;
            } else {
                set.add(c);
            }
        }
        return set.isEmpty() ? count*2 : count*2+1;
    }
}
