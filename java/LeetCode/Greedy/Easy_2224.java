/**
 * Created at 2022-10-30
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/minimum-number-of-operations-to-convert-time/
 * Level -> EASY
 * Topic -> GREEDY
 */
public class Easy_2224 {
    public static void main(String[] args) {
        String current = "09:41", correct = "10:34";
        System.out.println(convertTime(current, correct));
    }

    public static int convertTime(String current, String correct) {
        String[] currentArray = current.split(":");
        String[] correctArray = correct.split(":");

        Integer currentHour = Integer.valueOf(currentArray[0]);
        currentHour*=60;
        Integer correctHour = Integer.valueOf(correctArray[0]);
        correctHour*=60;

        Integer currentMin = Integer.valueOf(currentArray[1]);
        Integer correctMin = Integer.valueOf(correctArray[1]);

        currentHour+=currentMin;
        correctHour+=correctMin;

        int count = 0;

        while(correctHour - currentHour >= 60){
            count++;
            currentHour += 60;
        }
        while(correctHour - currentHour >= 15){
            count++;
            currentHour += 15;
        }
        while(correctHour - currentHour >= 5){
            count++;
            currentHour += 5;
        }
        while(correctHour - currentHour >= 1){
            count++;
            currentHour += 1;
        }

        return count;
    }
}