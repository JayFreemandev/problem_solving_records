/**
 * Created at 2022-12-04
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_1605 {
    public static void main(String[] args) {
        int[] rowSum = {3,8}, colSum = {4,7};
        System.out.println(restoreMatrix(rowSum, colSum));
    }

    public static int[][] restoreMatrix(int[] row, int[] col) {
        // row, col 길이
        int m = row.length, n = col.length;

        // 결과값
        int[][] A = new int[m][n];

        // i는 m의 길이만큼 반복
        for (int i = 0; i < m; ++i) {
            // j는 col의 길이 만큼 반복
            for (int j = 0 ; j < n; ++j) {
                A[i][j] = Math.min(row[i], col[j]);
                row[i] -= A[i][j];
                col[j] -= A[i][j];
            }
        }
        return A;
    }
}