import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Arrays;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : K번째수
 * author         : 정재윤
 * date           : 2023-09-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-26        정재윤       최초 생성
 */
public class K번째수 {
    public static void main(String[] args) {
        K번째수 k번째수 = new K번째수();
        int[] array ={1, 5, 2, 6, 3, 7, 4};
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(k번째수.solution(array, command));
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i < commands.length; i++){
            int[] tempArray = Arrays.copyOfRange(array, commands[i][0] -1, commands[i][1]);
            Arrays.sort(tempArray);
            answer[i] = tempArray[commands[i][2] -1];
        }

        return answer;
    }

}
