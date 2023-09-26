/**
 * packageName    : PACKAGE_NAME
 * fileName       : 비밀지도
 * author         : 정재윤
 * date           : 2023-09-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-26        정재윤       최초 생성
 */
public class 비밀지도 {
    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};

        비밀지도 비밀지도 = new 비밀지도();
        System.out.println(비밀지도.solution(n, arr1, arr2));
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];

        String[] binaryArr1 = new String[arr1.length];
        String[] binaryArr2 = new String[arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            binaryArr1[i] = String.format("%"+n+"s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            binaryArr2[i] = String.format("%"+n+"s", Integer.toBinaryString(arr2[i])).replace(' ', '0');
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0; i<n; i++) {
            for(int j=0;j<n;j++){
                if(binaryArr1[i].charAt(j) == '1' || binaryArr2[i].charAt(j) == '1'){
                    stringBuilder.append('#');
                }else{
                    stringBuilder.append(' ');
                }
            }
            answer[i] = stringBuilder.toString();
            stringBuilder.setLength(0);
        }

        return answer;
    }
}
