/**
 * Created at 2022-10-27
 * Site -> LINKEDIN
 * Link -> Two Furthest Houses With Different Colors
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_2078 {
    public static void main(String[] args) {

        int[] colors ={1,8,3,8,3};
        System.out.println(maxDistance(colors));
    }

    public static int maxDistance(int[] colors) {
        int n = colors.length-1;
        int i = 0;
        int j = n;

        while (colors[0] == colors[j]) j--;
        while (colors[n] == colors[i]) {i++;}
        return Math.max(n - i, j);
    }
}