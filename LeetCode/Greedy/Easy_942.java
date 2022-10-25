/**
 * Created at 2022-10-25
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/di-string-match/
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_942 {
    public static void main(String[] args) {
        String str = "IDID";
        System.out.println(diStringMatch(str));
    }

    public static int[] diStringMatch(String s) {
        int min = 0;
        int max = s.length();
        String[] strings = s.split("");
        int[] result = new int[s.length()+1];
        for(int i=0; i<s.length(); i++){

            if(strings[i].equals("I")){
                result[i] = min;
                min++;
            }else{
                result[i] = max;
                max--;
            }
        }
        result[s.length()] = min;
        return result;
    }
}