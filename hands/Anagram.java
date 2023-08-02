import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        int k = 2;
        int[] nums = {1, 1, 0, 0};

        int maxLength = 0; // 가장 긴 1의 연속된 부분 배열의 길이
        int countZeros = 0; // 현재 0의 개수
        int left = 0; // 윈도우의 왼쪽 인덱스

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                countZeros++;
            }

            // 0의 개수가 2개 이상인 경우, 윈도우를 이동시킴
            while (countZeros > k) {
                if (nums[left] == 0) {
                    countZeros--;
                }
                left++;
            }

            // 현재 1의 연속된 부분 배열의 길이를 갱신
            maxLength = Math.max(maxLength, right - left);
        }

        System.out.println(maxLength);
    }
}
