/**
 * packageName    : PACKAGE_NAME
 * fileName       : 행열의_덧셈
 * author         : 정재윤
 * date           : 2023-09-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-19        정재윤       최초 생성
 */
public class 행열의_덧셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int size = arr1.length;
        int[][] answer = new int[size][size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < arr1[i].length; j++){
                answer[i][j] += arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
