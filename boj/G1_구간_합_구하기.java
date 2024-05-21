import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : G1_구간_합_구하기
 * author         : 정재윤
 * date           : 2023-08-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-02        정재윤       최초 생성
 */
public class G1_구간_합_구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int dataCount = Integer.parseInt(stringTokenizer.nextToken());
        int changeCount = Integer.parseInt(stringTokenizer.nextToken());
        int rangeCount = Integer.parseInt(stringTokenizer.nextToken());

        long[][] map = new long[dataCount + 1][2];
        for (int i = 1; i <= dataCount; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            map[i][1] = Long.parseLong(stringTokenizer.nextToken());
        }

        long[][] sumMap = new long[dataCount + 1][2];
        for (int i = 1; i <= dataCount; i++) {
            sumMap[i][1] = sumMap[i - 1][1] + sumMap[i][0] - sumMap[i - 1][0] + map[i][1];
        }

        int count = 0;

        while (true) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int c = Integer.parseInt(stringTokenizer.nextToken());

            if (a == 1) {
                long gap = c - map[b][1];
                map[b][1] = c;
                for (int changeStart = b; changeStart <= dataCount; changeStart++) {
                    sumMap[changeStart][1] += gap;
                }
            }

            if (a == 2) {
                System.out.println(sumMap[c][1] - sumMap[b - 1][1]);
            }

            count++;

            if (count > changeCount + rangeCount) {
                break;
            }
        }
    }
}
