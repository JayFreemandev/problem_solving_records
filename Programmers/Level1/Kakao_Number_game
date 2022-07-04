public class Kakao_Number_game {
    public static void main(String[] args) {
        String number = "one4seveneight";
        System.out.println(solution(number));
    }
    public static int solution(String s) {
        String[] numArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0; i<numArr.length; i++) {
            s = s.replace(numArr[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}
