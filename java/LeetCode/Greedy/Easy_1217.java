/**
 * Created at 2022-10-26
 * Site -> LINKEDIN
 * Link -> Minimum Cost to Move Chips to The Same Position
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_1217 {
    public static void main(String[] args) {

        int[] position = {2,2,2,3,3};
        System.out.println(minCostToMoveChips(position));
    }

    public static int minCostToMoveChips(int[] position) {
        int odd =0;
        int even =0;

        for(int i=0; i<position.length; i++){
            if(position[i]%2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        return Math.min(odd, even);
    }
}