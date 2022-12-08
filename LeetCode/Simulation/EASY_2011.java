/**
 * Created at 2022-12-08
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
 * Level -> EASY
 * Topic -> SIMULATION
 */
public class EASY_2011 {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {

        int minus = 0;
        int plus = 0;

        for(String operation : operations){
            for(int i=0; i<operation.length(); i++){
                if(operation.charAt(i) == '-'){
                    minus++;
                }
                if(operation.charAt(i) == '+'){
                    plus++;
                }
            }
        }

        return ((minus/2) * -1) + (plus/2);
    }
}
