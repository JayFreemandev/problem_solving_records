/**
 * Created at 2022-12-06
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/minimum-suffix-flips/description/
 * Level -> MEDIUM
 * Topic -> GREEDY
 */
public class MEDIUM_1529 {
    public static void main(String[] args) {
        String target = "10111";
        System.out.println(minFlips(target));
    }

    public static int minFlips(String target) {
        char prev = '0';
        int res = 0;
        for (char c : target.toCharArray()) {
            if (c != prev) {
                prev = c;
                res++;
            }
        }
        return res;
    }
}
