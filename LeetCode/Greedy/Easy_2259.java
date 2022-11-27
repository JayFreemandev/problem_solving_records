import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created at 2022-11-27
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_2259 {
    public static void main(String[] args) {
        String number = "1231";
        char digit = '1';
        System.out.println(removeDigit(number, digit));
    }

    public static String removeDigit(String number, char digit) {
        List<String> greedy = new ArrayList<>();

        for(int i=0; i<number.length(); i++){
            if(number.charAt(i) == digit){
                //
                String digitNumber = number.substring(0, i)+number.substring(i+1);
                greedy.add(digitNumber);
            }
        }
        Collections.sort(greedy);

        return greedy.get(greedy.size()-1);
    }
}