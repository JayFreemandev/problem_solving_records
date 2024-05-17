import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : S3_구간_합_구하기
 * author         : 정재윤
 * date           : 2023-08-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-02        정재윤       최초 생성
 */
public class S3_구간_합_구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int dataCount = Integer.parseInt(stringTokenizer.nextToken());
        int quizeCount = Integer.parseInt(stringTokenizer.nextToken());

        long[] sum = new long[dataCount + 1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 1; i <= dataCount; i++){
            sum[i] = sum[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int q = 0; q < quizeCount; q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(sum[j] - sum[i-1]);
        }
    }
}
