import java.util.Enumeration;

/**
 * Created at 2022-12-10
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/flipping-an-image/
 * Level -> EASY
 * Topic -> SIMULATION
 */
public class EASY_832 {
    public static void main(String[] args) {

        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(flipAndInvertImage(image));
    }

    public static int[][] flipAndInvertImage(int[][] image) {

        for(int[] num : image){
            int previous = 0;
            int current = num.length-1;

            while(previous <= current){
                if(num[previous] == num[current]){
                    num[previous] = 1 - num[previous];
                    num[current] = num[previous];
                }

                previous++;
                current--;
            }
        }

        return image;
    }
}
