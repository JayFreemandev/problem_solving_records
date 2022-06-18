package programmers.level1;

import java.util.*;

public class Kakao_lotto {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        System.out.println(solution(lottos, win_nums));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {

        int count = 0;
        int hope = 0;

        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                hope++;
            }

            for(int k=0; k<win_nums.length; k++){
                if(lottos[i] == win_nums[k]){
                    count++;
                    break;
                }
            }
        }

        int total = hope + count;

        if(total == 0){
            total = 1;
        }

        if(count == 0){
            count = 1;
        }

        int[] answer = {7-total, 7-count};

        return answer;
    }
}
