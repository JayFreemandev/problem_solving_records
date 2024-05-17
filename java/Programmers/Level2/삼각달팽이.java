import java.util.Arrays;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : 삼각달팽이
 * author         : 정재윤
 * date           : 2023-09-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-21        정재윤       최초 생성
 */
public class 삼각달팽이 {
    private int n;
    private int max;
    private int[][] map;
    private int start;
    public 삼각달팽이(int n){
        this.n = n;
        this.map = new int [n][n];
        this.max = n*(n+1)/2;
        this.start = 1;
    }

    public int[][] 막돌려(){

        int x = 0;
        int y = 0;
        map[0][0] = 1;

        while(start < max){
            // 수직 낙하
            while(x+1 < n && map[x+1][y] == 0){
                map[++x][y] = ++start;
            }

            // 오른쪽 직진
            while(y+1 < n && map[x][y+1] == 0){
                map[x][++y] = ++start;
            }

            // 왼쪽 대각선
            while(x-1 > 0 && y-1 > 0 && map[x-1][y-1] == 0){
                map[--x][--y] = ++start;
            }

        }

        return map;
    }

    public int[] 배열조합(int[][] map){

        int[] result = new int[max];

        int count = 0;
        for(int i =0; i < map.length; i++){
            for(int j=0; j < map[0].length; j++){
                if(map[i][j] == 0){
                    break;
                }
                result[count] = map[i][j];
                count++;
            }
        }

        return Arrays.copyOf(result, count);
    }

    public static void main(String[] args) {
        삼각달팽이 삼각달팽이 = new 삼각달팽이(999);
        int[][] map = 삼각달팽이.막돌려();
        int[] result = 삼각달팽이.배열조합(map);
        System.out.println(result);
    }

}
