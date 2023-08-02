import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : S1_구간_합_구하기
 * author         : 정재윤
 * date           : 2023-08-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-02        정재윤       최초 생성
 */
public class S1_구간_합_구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int dataCount = Integer.parseInt(stringTokenizer.nextToken());
        int quizeCount = Integer.parseInt(stringTokenizer.nextToken());

        int[][] map = new int[dataCount+1][dataCount+1];
        for(int i = 1; i <= dataCount; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j = 1; j <= dataCount; j++){
                map[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        int[][] sumMap = new int[dataCount+1][dataCount+1];
        for(int i = 1; i <= dataCount; i++){
            for(int j = 1; j <= dataCount; j++){
                sumMap[i][j] = sumMap[i][j-1] + sumMap[i-1][j] - sumMap[i-1][j-1] + map[i][j];
            }
        }

        for(int q = 0; q < quizeCount; q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(sumMap[x2][y2] - sumMap[x1 -1][y2] - sumMap[x2][y1-1] + sumMap[x1-1][y1-1]);
        }
    }
}
