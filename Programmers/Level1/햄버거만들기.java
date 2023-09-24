import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : 햄버거만들기
 * author         : 정재윤
 * date           : 2023-09-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-22        정재윤       최초 생성
 */
public class 햄버거만들기 {

    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        햄버거만들기 햄버거만들기 = new 햄버거만들기();
        햄버거만들기.solution(ingredient);
    }

    public int solution(int[] ingredients) {
        int answer = 0;

        List<Integer> list = IntStream.of(ingredients)
            .boxed()
            .collect(Collectors.toList());

        for(int i=0; i<list.size()-3; i++){
            if(list.get(i)==1 && list.get(i+1)==2 && list.get(i+2)==3 && list.get(i+3)==1){
                answer++;
                for(int j=0; j<4; j++)
                    list.remove(i);
                if(i<=2)
                    i=-1;  // 0번 인덱스부터 다시 체크
                else
                    i=i-4; // 현 위치로부터 세칸 전부터 체크 ex) 1231234이고 i=3일 때
            }
        }

        return answer;
    }
}
