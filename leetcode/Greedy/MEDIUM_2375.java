import java.util.HashSet;

/**
 * Created at 2022-12-04
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/construct-smallest-number-from-di-string/
 * Level -> MEDIUM
 * Topic -> GREEDY
 */
public class MEDIUM_2375 {
    public static void main(String[] args) {
        String s = "IIIDIDDD";
        System.out.println(smallestNumber(s));
    }

    public static String smallestNumber(String pattern) {
        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        char ch = '1';
        for (int i = 0; i < pattern.length(); i++) {
            char cur = pattern.charAt(i);
            temp.append(ch++);
            if (cur == 'I') {
                res.append(temp.reverse());
                temp = new StringBuilder();
            }
        }
        temp.append(ch++);
        res.append(temp.reverse());
        return res.toString();
    }
}