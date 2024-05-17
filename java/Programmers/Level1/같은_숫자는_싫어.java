import java.util.*;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : 같은_숫자는_싫어
 * author         : 정재윤
 * date           : 2023-09-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-24        정재윤       최초 생성
 */
public class 같은_숫자는_싫어 {

    public int[] solution(int []arr) {

        int temp = arr[0];

        List<Integer> list = new ArrayList<>();
        list.add(temp);

        for(int i : arr){
            if(i != temp){
                list.add(i);
            }

            temp = i;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        같은_숫자는_싫어 같은숫자는싫어 = new 같은_숫자는_싫어();
        같은숫자는싫어.solution(arr);
    }
}
