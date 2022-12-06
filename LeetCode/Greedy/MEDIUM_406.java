import java.util.*;

/**
 * Created at 2022-12-06
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/queue-reconstruction-by-height/
 * Level -> MEDIUM
 * Topic -> GREEDY
 */
public class MEDIUM_406 {
    public static void main(String[] args) {
        int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        System.out.println(reconstructQueue(people));
    }

    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a,b)-> a[0]==b[0]?Integer.compare(a[1], b[1]):Integer.compare(b[0], a[0]));

        LinkedList<int[]> list = new LinkedList<>();
        for (int i = 0; i < people.length; i++)
            list.add(people[i][1], people[i]);

        return list.toArray(people);
    }
}
