import java.util.Arrays;
import java.util.HashMap;

/**
 * Created at 2023-10-05
 * Site ->
 * Link ->
 * Level ->
 * Topic ->
 */
public class 추억점수 {
    public static void main(String[] args) {
        추억점수 추억점수 = new 추억점수();
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearring = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        System.out.println(추억점수.solution(name, yearring, photo));
    }

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int [photo.length];

        HashMap<String, Integer> missPoint = new HashMap<>();
        for(int i=0; i<name.length; i++){
            missPoint.put(name[i], yearning[i]);
        }

        for(int i=0; i<photo.length; i++){
            for(int j=0; j<photo[i].length; j++){
                if(missPoint.containsKey(photo[i][j])){
                    answer[i]+=missPoint.get(photo[i][j]);
                }
            }
        }

        return answer;
    }
}
