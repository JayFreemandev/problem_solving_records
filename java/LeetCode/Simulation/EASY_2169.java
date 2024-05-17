/**
 * Created at 2022-12-10
 * Site -> LINKEDIN
 * Link -> hhttps://leetcode.com/problems/count-operations-to-obtain-zero/description/
 * Level -> EASY
 * Topic -> SIMULATION
 */
public class EASY_2169 {
    public static void main(String[] args) {

        int num1 = 2, num2 = 3;
        System.out.println(countOperations(num1, num2));
    }

    public static int countOperations(int num1, int num2) {
        int count = 0;

        while (num1 != 0 && num2 != 0)
            if (num1 >= num2) {
                num1 -= num2;
                count++;
            } else {
                num2 -= num1;
                count++;
            }

        return count;
    }
}
