/**
 * Created at 2022-11-21
 * Site -> LINKEDIN
 * Link -> Lemonade Change
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_860 {
    public static void main(String[] args) {
        int[] bills = {5,5,5,10,5,5,10,20,20,20};
        System.out.println(lemonadeChange(bills));
    }

    public static boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;

        for(int bill : bills){
            if(bill == 5){
                five++;
            }
            if(bill == 10){
                five--;
                ten++;
            }
            // 20원 이상
            if(bill > 10){
                if(ten > 0 && five >= 1){
                    five--;
                    ten--;
                }else{
                    five -=3;
                }
            }

            if(five < 0){
                return false;
            }
        }

        return true;
    }
}
