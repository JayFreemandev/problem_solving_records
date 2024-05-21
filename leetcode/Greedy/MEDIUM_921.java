import java.util.Stack;

/**
 * Created at 2022-12-04
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
 * Level -> MEDIUM
 * Topic -> GREEDY
 */
public class MEDIUM_921 {
    public static void main(String[] args) {
        String s = "())";
        System.out.println(minAddToMakeValid(s));
    }

    public static int minAddToMakeValid(String s) {

        int right =0, left =0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                right++;
            }else if(right > 0){
                right--;
            }else{
                left++;
            }
        }
        return right + left;
    }
}