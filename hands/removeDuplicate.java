import java.util.*;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] array = {3,2,7,2,7,5,8};
        List<Integer> numbers = new ArrayList<>();
        Arrays.stream(array).forEach(number -> numbers.add(number));

        // 중복 제거 및 순서 유지(linkedHashSet 특징)
        Set<Integer> removeDuplicate = new LinkedHashSet<>(numbers);
        removeDuplicate.forEach(number -> System.out.println(number));

        // 첫배열 그대로 출력
        List<Integer> result = new ArrayList<>(removeDuplicate);
        System.out.println(result);
    }
}
