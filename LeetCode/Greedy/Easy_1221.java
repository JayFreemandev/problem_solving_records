/**
 * Created at 2022-10-23
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/split-a-string-in-balanced-strings/
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_1221 {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
    public static int balancedStringSplit(String s) {
        String[] strings = s.split("");
        int left = 0;
        int right = 0;
        int maximumBalance = 0;
        for(int i=0; i<strings.length; i++){
            if(strings[i].equals("L")){
                left++;
            }else{
                right++;
            }

            if(left == right){
                maximumBalance++;
            }
        }
        return maximumBalance;
    }
}
