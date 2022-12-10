/**
 * Created at 2022-12-10
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/count-of-matches-in-tournament/
 * Level -> EASY
 * Topic -> SIMULATION
 */
public class EASY_1688 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(numberOfMatches(n));
    }

    public static int numberOfMatches(int n) {
        int team = n;
        int game = n;
        int result = 0;

        while(team > 1){
            if(team%2 == 0) { // 짝수
                team = team/2;
                game = team;
                result += game;
            }else{ // 홀수
                game = (team-1)/2;
                team = game+1;
                result += game;
            }
        }

        return result;
    }
}
