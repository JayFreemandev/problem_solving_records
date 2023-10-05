import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created at 2023-10-05
 * Site ->
 * Link ->
 * Level ->
 * Topic ->
 */
public class 추억점수_스트림즈 {
    public static void main(String[] args) {
        추억점수_스트림즈 추억점수 = new 추억점수_스트림즈();
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearring = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        System.out.println(추억점수.solution(name, yearring, photo));
    }

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int [photo.length];

        Map<String, Integer> missPoint = IntStream.range(0, name.length)
            .boxed()
            .collect(Collectors.toMap(i -> name[i], i-> yearning[i]));

        answer = Arrays.stream(photo)
            .mapToInt(p -> Arrays.stream(p)
                .filter(missPoint::containsKey)
                .mapToInt(missPoint::get)
                .sum())
            .toArray();

        return answer;
    }
}
