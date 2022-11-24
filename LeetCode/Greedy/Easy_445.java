import java.util.Arrays;

/**
 * Created at 2022-11-24
 * Site -> LINKEDIN
 * Link -> Assign Cookies
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_455 {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        // two pointer 시작전 정렬
        Arrays.sort(g);
        Arrays.sort(s);

        // two point 초기화
        int pointA=0;
        int pointB=0;

        while(pointA < g.length && pointB < s.length){
            if(g[pointA] <= s[pointB]){
                pointA++;
                pointB++;
            }else{
                pointB++;
            }
        }

        return pointA;
    }
}
