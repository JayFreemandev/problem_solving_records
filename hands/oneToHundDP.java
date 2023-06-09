public class oneToHundDP {
    public static void main(String[] args) {
        int[] dp = new int[101];
        dp[0] = 0;

        for(int i =1; i<=100; i++){
            dp[i] = dp[i-1] + i;
        }

        System.out.println(dp[100]);
    }

    /*DP를 사용하면 중복 연산을 피할 수 있기 대문에 계산속도 향상*/
}
