import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String pizza = "pizza";
        String hitzza = "piazz";

        // 공백 제거
        pizza.trim();
        hitzza.trim();

        // 문자열 길이 체크
        if(pizza.length() != hitzza.length()){
            System.out.println("false");
        }

        // 소문자 정렬
        char[] char1 = pizza.toLowerCase().toCharArray();
        char[] char2 = hitzza.toLowerCase().toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        // 스트링 비교
        String result1 = new String(char1);
        String result2 = new String(char2);

        System.out.println(result1.equals(result2));
    }
}
