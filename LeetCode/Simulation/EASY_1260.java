import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created at 2022-12-12
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/shift-2d-grid/description/
 * Level -> EASY
 * Topic -> SIMULATION
 */
public class EASY_1260 {
    public static void main(String[] args) {

        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 1;
        System.out.println(shiftGrid(grid, k));
    }
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        int[][] temp = grid;

        while (k-- > 0) {
            // init for each loop
            temp = new int[n][m];

            // 1. shift right
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    temp[i][j] = grid[i][j - 1];
                }
            }

            // 2. move last one in this row to the next row
            for (int i = 1; i < n; i++) {
                temp[i][0] = grid[i - 1][m - 1];
            }

            // 3. move the last one to the first place
            temp[0][0] = grid[n - 1][m - 1];

            // repeat
            grid = temp;
        }

        return (List)Arrays.asList(temp);
    }
}
