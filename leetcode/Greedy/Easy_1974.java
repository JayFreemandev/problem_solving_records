import java.util.Arrays;

/**
 * Created at 2022-10-26
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter/
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_1974 {
    public static void main(String[] args) {
        String word = "bza";
        System.out.println(minTimeToType(word));
    }

    public static int minTimeToType(String word) {
        int count = word.length();
        char init = 'a';
        for(int i=0; i<word.length(); i++){
            char current = word.charAt(i);
            int difference = Math.abs(current - init);
            count += Math.min(difference, 26 - difference);
            init = current;
        }

        return count;
    }
}