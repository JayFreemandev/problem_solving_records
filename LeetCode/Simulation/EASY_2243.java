/**
 * Created at 2022-12-17
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/calculate-digit-sum-of-a-string/
 * Level -> EASY
 * Topic -> SIMULATION
 */
public class EASY_2243 {
    public static void main(String[] args) {

        String s = "11111222223";
        int k = 3;
        System.out.println(digitSum(s, k));
    }

    public static String digitSum(String s, int k) {
        // 결과용 빌더
        StringBuilder anwswer = new StringBuilder(s);

        while(anwswer.length() > k) {
            // 숫자를 더하는 임시 더미 빌더
            StringBuilder dummy = new StringBuilder();
            // s length의 k배까지 반복
            for(int i = 0; i < anwswer.length(); i+=k) {
                // 저장용 sum 정수
                int sum = 0;
                // 🎁 j는 k보다 작아야하고 j+1은 원본길이보다 작아야함(NPE 방지)
                // 즉 K번까지 J가 반복예정
                for(int j = 0; j < k && (j+i) < anwswer.length(); j++) {
                    // answer의 i+j 즉 n번째 값을 가져옴
                    sum += anwswer.charAt(i+j)-'0';
                }
                // 더미 빌더로 차곡차곡 붙여줌
                dummy.append(sum+"");
            }

            anwswer = dummy;
        }

        return anwswer.toString();
    }
}
