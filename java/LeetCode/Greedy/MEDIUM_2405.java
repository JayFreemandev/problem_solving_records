import java.util.*;

/**
 * Created at 2022-12-04
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/optimal-partition-of-string/
 * Level -> MEDIUM
 * Topic -> GREEDY
 */
public class MEDIUM_2405 {
    public static void main(String[] args) {
        String s = "abacaba";
        System.out.println(partitionString(s));
    }

    public static int partitionString(String s) {

        int ans = 1;
        HashSet<Character> st = new HashSet<>();

        for(int i=0;i<s.length();i++){
            // 반복되는 알파벳을 찾기전까지 반복
            if(!st.contains(s.charAt(i))){
                st.add(s.charAt(i));
            }
            else{
                // 반복되는 알파벳 조건을 만족시 파티션증가, 해쉬셋 초기화 및 다음 반복문을 위해 현재 해쉬에는 i번째 값을 추가
                ans++;
                st.clear();
                st.add(s.charAt(i));
            }
        }
        return ans;
    }
}