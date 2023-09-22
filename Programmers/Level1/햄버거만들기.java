import java.util.Stack;

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
        int result = 0;

        Stack<Integer> stack = new Stack<>();

        for (int ingredient : ingredients) {
            stack.push(ingredient);

            if (stack.size() >= 4) {
                int size = stack.size();

                if(stack.get(size - 1) == 1 && stack.get(size - 2) == 3 && stack.get(size - 3) == 2 && stack.get(size - 4) == 1) {
                    result++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }

        }

        return result;
    }
}
