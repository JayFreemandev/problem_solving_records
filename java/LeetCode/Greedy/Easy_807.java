/**
 * Created at 2022-11-27
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/max-increase-to-keep-city-skyline/
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_807 {
    public static void main(String[] args) {
        int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println(maxIncreaseKeepingSkyline(grid));
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {

        /**
         *  {3,0,8,4},
         *  {2,4,5,7},
         *  {9,2,6,3},
         *  {0,3,1,0}
         */

        // 빌딩 열개수
        int length = grid.length;
        int maxiumIncrease = 0;
        int[] col = new int[length];
        int[] row = new int[length];

        for(int i=0; i<length; i++){
            for(int j=0; j<length; j++){
                /**
                 * {3,0,8,4} -> 8
                 * i가 0부터 3까지 가로 열을 조회하면서 grid i열중 가장 높은수를 row[i]열에 저장
                 * 첫 순회때 3이 저장되고 max를 돌다 8이 저장된다.
                 * {8,7.9,3} 북쪽, 남쪽 max 열값 완성
                 */
                row[i] = Math.max(row[i], grid[i][j]);

                /**
                 * {3, j의 i번째 값들을 조회하면서 grid의 세로값중 가장 큰 값을 col[i]에 저장
                 *  2, 첫 순회때 3이 저장되고 max를 하면 9가 저장된다.
                 *  9, {9,4,8,4} 동쪽과 서쪽 max 행값 완성
                 *  0
                 *  }
                 */
                col[i] = Math.max(col[i], grid[j][i]);
            }
        }

        for(int i=0; i<length; i++){
            for(int j=0; j<length; j++){
                /**
                 * 첫번째 빌딩라인 열의 가장 높은수는 8이였고 행은 9였다.
                 * 9 이상이 되면 동쪽과 서쪽의 스카이라인 카디널 높이가 달라지게된다.
                 * 8까지 올릴수있기때문에 grid[i][j]에서 뺀 값 만큼 높이가 올라가게된다.
                 */

                // i -> 0 row[i] = 8
                // j -> 0 col[i] = 9

                // i -> 0 row[i] = 8
                // j -> 1 col[i] = 4

                // i -> 0 row[i] = 8
                // j -> 2 col[i] = 8

                // i -> 8 row[i] = 8
                // j -> 3 col[j] = //
                int maximum = Math.min(row[i], col[j]);
                maxiumIncrease += maximum - grid[i][j];
            }
        }

        return maxiumIncrease;
    }
}