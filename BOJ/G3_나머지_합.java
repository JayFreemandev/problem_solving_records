import java.util.Scanner;

/**
 * Created at 2023-08-03
 * Site ->
 * Link ->
 * Level ->
 * Topic ->
 */
public class G3_나머지_합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        long[] sumArray = new long[N];
        long[] countArray = new long[M];

        long answer = 0;
        sumArray[0] = sc.nextInt();
        for(int i =1; i< N; i++){
            sumArray[i] = sumArray[i-1] + sc.nextInt();
        }

        for(int i=0; i<N; i++){
            int remainder = (int) (sumArray[i] % M);
            if(remainder == 0) answer++;
            countArray[remainder]++;
        }

        for(int i=0; i<M; i++){
            if(countArray[i] > 1){
                answer = answer + (countArray[i] * (countArray[i]-1)/ 2);
            }
        }

        System.out.println(answer);
    }
}
