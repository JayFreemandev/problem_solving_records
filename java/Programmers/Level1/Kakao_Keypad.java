import java.util.*;

class Kakao_Keypad {
    public String solution(int[] numbers, String hand) {
        int[] lhand = {1, 4, 7};
        int[] rhand = {3, 6, 9};
        
        for(int i=0; i<numbers.length; i++){
            int num = numbers[i];
            if(Arrays.stream(lhand).anyMatch(x -> x == num)){
                System.out.print("L");
            }else if(Arrays.stream(rhand).anyMatch(x -> x == num)){
                System.out.print("R");
            }else{
                System.out.print(closeHand(numbers[i-2], numbers[i-1], num, hand));
            }
        }
        
        String answer = "";
        return answer;
    }
    
    public static String closeHand(int moreBefore, int before, int number, String hand){
        
        int leftLevel = 0;
        int rightLevel = 0;
        
        int[] level1 = {1,2,3};
        int[] level2 = {4,5,6};
        int[] level3 = {7,8,9,0};
        
        
        
        if(leftLevel > rightLevel){
            return "L";
        }else if(rightLevel > leftLevel){
            return "R";
        }
        
        return String.valueOf(hand.toUpperCase().charAt(0));
    }
}
