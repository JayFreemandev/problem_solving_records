/**
 * Created at 2022-12-17
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/calculate-digit-sum-of-a-string/
 * Level -> EASY
 * Topic -> SIMULATION
 */
public class EASY_2138 {
    public static void main(String[] args) {

        String s = "abcdefghi";
        char fill = 'n';
        int k = 3;
        System.out.println(divideString(s, k, fill));
    }

    public static String[] divideString(String s, int k, char fill) {

        int arraySize;
        // string 사이즈가 k로 나눠 떨어진다면 devide값만 추가
        if(s.length()%k == 0){
            arraySize = s.length()/k;
        }else{
            arraySize = s.length()/k+1;
        }

        String[] result = new String[arraySize];

        int count = 0;
        while (count <= k) {
            StringBuilder dummy = new StringBuilder();
            // s length의 k배까지 반복
            for (int i = 0; i < s.length(); i += k) {
                // 🎁 j는 k보다 작아야하고 j+1은 원본길이보다 작아야함(NPE 방지)
                // 즉 K번까지 J가 반복예정
                for (int j = 0; j < k && (j + i) < s.length(); j++) {
                    // answer의 i+j 즉 n번째 값을 가져옴
                    dummy.append(s.charAt(i + j));
                }
                // dummy가 k보다 작으면 fill char로 append 해준다.
                while(dummy.length() < k){
                    dummy.append(fill);
                }
                // result count번째에 string 추가
                result[count] = dummy.toString();
                // dummy 초기화
                dummy = new StringBuilder();
                count++;
            }

            // while 종료를 위한 카운트 증가
            count = k+1;
        }

        return result;
    }
}

