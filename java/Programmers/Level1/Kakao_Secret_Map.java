import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Kakao_Secret_Map {
    public static void main(String[] args) {
        int[] a = {9, 20, 28, 18, 11};
        int[] b = {30, 1, 21, 17, 28};
        int k = 5;
        System.out.println(solution(k, a, b));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {

        String[] answer = new String[n];
        String[] hint1 = createHint(arr1, n);
        String[] hint2 = createHint(arr2, n);

        for(int i=0; i<n; i++){
            StringBuilder hint = new StringBuilder();
            for(int j=0; j<n; j++) {
                if (hint1[i].charAt(j) == '0' && hint2[i].charAt(j) == '0') {
                    hint.append(" ");
                } else {
                    hint.append("#");
                }
            }
            answer[i] = hint.toString();
        }
        return answer;
    }

    private static String[] createHint(int[] arr, int n){

        String[] hints = new String[n];

        for(int i=0; i<n; i++){

            String hint = Integer.toBinaryString(arr[i]);
            String zero = "";
            if(hint.length() < n){
                int zeroCount = n-hint.length();
                while(zeroCount > 0){
                    zero += "0";
                    zeroCount--;
                }
            }

            hints[i] = zero+hint;
        }

        return hints;
    }
}
